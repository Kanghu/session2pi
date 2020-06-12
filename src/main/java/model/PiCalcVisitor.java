package model;

import gen.grammar.*;

import java.util.*;

/***
 * Known bugs:
 *
 * TO DO:
 * - Input that TyPiCaL can accept
 */

public class PiCalcVisitor extends piBaseVisitor<String> {

    /**
     * The renaming function f(x) is represented as a HashMap
     * of names to a list of possible renamings.
     */
    Map<String, List<String>> renaming;

    /**
     * Stack representing the lists of co-names across all processes
     * that are still running.
     */
    Stack<List<String>> ctxNames;

    public PiCalcVisitor() {
        renaming = new HashMap<>();
        ctxNames = new Stack<>();
        ctxNames.push(new ArrayList<>());
    }

    @Override public String visitExpression(piParser.ExpressionContext ctx)
    {
        return visitChildren(ctx);
    }

    @Override public String visitProc(piParser.ProcContext ctx)
    {
        /* Base case */
        if(ctx.getText().equals("O")) {
            clearNames();
            return ctx.getText();
        }

        if(ctx.AND() != null) {
            /* New sequential process, create stack of names */
            ctxNames.push(new ArrayList<>());

            StringBuilder encoding = new StringBuilder();
            encoding.append(visitProc(ctx.proc().get(0)))
                    .append(" | ")
                    .append("\n");  /* Newline */

            ctxNames.push(new ArrayList<>());
            encoding.append(visitProc(ctx.proc().get(1)));

            return encoding.toString();
        } else if(ctx.REPL() != null) {
            return "*" + visitProc(ctx.proc().get(0));
        } else if(ctx.NEW() != null) {
            /* Session restriction */
            String name_1 = visitName(ctx.name().get(0));
            String name_2 = visitName(ctx.name().get(1));
            String fresh = bindFreshName(name_1);
            bindRenaming(name_2, fresh);

            return ctx.NEW() +
                    " " +
                    fresh +
                    " " +
                    ctx.IN() +
                    " " +
                    visitProc(ctx.proc().get(0));
        } else if(ctx.LET() != null) {
            return ctx.LET() +
                    " " +
                    visitName(ctx.name().get(0)) +
                    " " +
                    "=" +
                    visitValue(ctx.value());
        }

        return visitChildren(ctx);
    }

    @Override public String visitSubproc(piParser.SubprocContext ctx)
    {
        return '(' + visitProc(ctx.proc()) + ')';
    }

    @Override public String visitTuple(piParser.TupleContext ctx)
    {
        List<piParser.ValueContext> vals = ctx.value();
        StringBuilder tuple = new StringBuilder();

        tuple.append('(');
        for(int i=0; i<vals.size()-1; i++) {
            /* Visit each value in a tuple */
            String val = visitValue(vals.get(i));

            tuple.append(val);
            tuple.append(',');
        }

        /* Visit last value */
        tuple.append(visitValue(vals.get(vals.size() - 1)));
        tuple.append(')');

        return tuple.toString();
    }

    @Override public String visitValue(piParser.ValueContext ctx)
    {
        if(ctx.name() == null) {
            return ctx.getText();
        } else {
            return visitName(ctx.name());
        }
    }

    @Override public String visitName(piParser.NameContext ctx)
    {
        String name = ctx.getText();

        /* Renaming: x = f(x) */
        if(renaming.containsKey(name)) {
            return getRenaming(name);
        } else {
            /* Mark itself as renaming to add it to the set of names */
            bindRenaming(name, name);
            return name;
        }
    }

    @Override public String visitBool(piParser.BoolContext ctx)
    {
        return ctx.getText();
    }

    @Override public String visitNum(piParser.NumContext ctx)
    {
        return ctx.getText();
    }

    /***
     * Perform encoding for an output operation.
     *
     * x!value.P => new x' in x!(value, x').P
     */
    @Override public String visitOutput(piParser.OutputContext ctx)
    {
        String initialName = ctx.name().getText();  /* x */
        String name = visitName(ctx.name());        /* f(x) */
        String value = visitValue(ctx.value());     /* f(value) */

        String fresh = bindFreshName(initialName);  /* x' */
        String encoding = ("new " + fresh + " in ") + name + ctx.SEND() + pair(value, fresh);

        return encoding + ctx.CONTINUE() + visitProc(ctx.proc());
    }

    /***
     * Perform encoding for an input operation.
     *
     * x?y.P => x?y'.(let y=fst(y') in let x'=snd(y') in P)
     */
    @Override public String visitInput(piParser.InputContext ctx)
    {
        String initialName = ctx.name().get(0).getText();       /* x */
        String name = visitName(ctx.name().get(0));             /* f(x) */
        String recvName = visitName(ctx.name().get(1));         /* f(y) */

        String fresh = bindFreshName(initialName);              /* x' */
        String recvPair = getFreshName();                       /* y' */

        String encoding = name + ctx.RECV() + recvPair
                + "."
                + "("
                + "let " + recvName + "=fst(" + recvPair + ")"
                + " in let " + fresh + "=snd(" + recvPair + ")"
                + " in ";

        return encoding + visitProc(ctx.proc()) + ")";
    }

    /***
     * Perform encoding for a select operation
     */
    @Override public String visitSelect(piParser.SelectContext ctx)
    {
        String initialName = ctx.name().getText();           /* x */
        String name = visitName(ctx.name());                 /* f(x) */
        String variant = visitNum(ctx.num());                /* variant l_i */
        String tuple = '(' + variant + ')';                  /* tuple <l_i> */

        String fresh = bindFreshName(initialName);
        String encoding = "new " + fresh + " in " + name + "!" + updateTuple(tuple, fresh);

        return encoding + ctx.CONTINUE() + visitProc(ctx.proc());
    }

    /***
     * Perform encoding for a branch operation
     *
     * x > {l_i : P_i} => fx?(l_j, c).case l_j of {l_i : [P_i]}
     */
    @Override public String visitBranch(piParser.BranchContext ctx)
    {
        ctxNames.push(new ArrayList<>());
        String initialName = ctx.name().getText();           /* x */
        String name = visitName(ctx.name());                 /* f(x) */
        List<piParser.NumContext> variants = ctx.num();      /* Branched variant values */
        List<piParser.ProcContext> processes = ctx.proc();   /* Branched processes */

        // TO DO: Fix fresh names for input
        String chan = bindFreshName(initialName);                   /* x' */
        String var = getFreshName();                                /* l_j */
        String pair = getFreshName();                               /* (l_j, c) */

        StringBuilder encoding = new StringBuilder();
        encoding.append(name)
                .append("?")
                .append(pair)
                .append('.')
                .append('(')
                .append("let " )
                .append(var)
                .append("=fst(")
                .append(pair)
                .append(")")
                .append(" in let ")
                .append(chan)
                .append("=snd(")
                .append(pair)
                .append(")")
                .append(" in ")
                .append("\n");  /* Newline */

        /* Encode the variant cases as conditionals */
        for(int i=0; i<variants.size() - 1; i++)
        {
            String variant = variants.get(i).getText();
            ctxNames.push(new ArrayList<>());
            encoding.append("if ")
                    .append(var)
                    .append("=")
                    .append(variant)
                    .append(" ")
                    .append("then ")
                    .append(visitProc(processes.get(i)))
                    .append(" else ")
                    .append("\n");  /* Newline */
        }

        /* Last variant */
        String variant = variants.get(variants.size() - 1).getText();
        ctxNames.push(new ArrayList<>());
        encoding.append("if ")
                .append(var)
                .append("=")
                .append(variant)
                .append(" ")
                .append("then ")
                .append(visitProc(processes.get(variants.size() - 1)))
                .append(" else ")
                .append("O");

        clearNames();

        encoding.append(")");

        return encoding.toString();
    }

    /***
     * Binds a channel name to an existing tuple
     */
    public String updateTuple(String tuple, String name) {
        StringBuilder updated = new StringBuilder();

        for(int i=0; i<tuple.length() - 1; i++)
        {
            updated.append(tuple.charAt(i));
        }

        updated.append(',');
        updated.append(name);
        updated.append(')');

        return updated.toString();
    }

    public String getFreshName() {
        String fresh = null;
        for(char i='a'; i<'z'; i++) {
            if (!renaming.containsKey(String.valueOf(i))) {
                fresh = String.valueOf(i);
                break;
            }
        }

        /* Bind itself as renaming */
        bindRenaming(fresh, fresh);

        /* Add to current context */
        ctxNames.peek().add(fresh);

        return fresh;
    }

    public String bindFreshName(String name) {
        String fresh = getFreshName();

        /* Bind as renaming */
        bindRenaming(name, fresh);

        return fresh;
    }

    public void bindRenaming(String name, String coname) {
        if(renaming.get(name) != null) {
            renaming.get(name).add(coname);
        } else {
            renaming.put(name, new ArrayList<>());
            bindRenaming(name, coname);
        }
    }

    /***
     * @param name a name in the current domain
     * @return its renaming
     */
    public String getRenaming(String name) {
        List<String> renamings = renaming.get(name);
        return renamings.get(renamings.size() - 1);
    }

    private void clearNames() {
        /* Clear context names */
        for(String name : ctxNames.pop())
        {
            /* Remove implicit naming c -> c */
            if(renaming.containsKey(name)) {
                renaming.remove(name);
            }

            /* Remove naming of type x -> c */
            for(List<String> conames : renaming.values())
            {
                if(conames.contains(name))
                {
                    conames.remove(name);
                }
            }
        }
    }

    /***
     * Auxiliary parenthesis function
     * @param x
     * @param y
     * @return "(x,y)"
     */
    private String pair(String x, String y) {
        return '(' + x + "," + y + ')';
    }
}