// Generated from D:/Users/Kanghu/Github/session-pi/src/main/resources/grammar\pi.g4 by ANTLR 4.8
package gen.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link piParser}.
 */
public interface piListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link piParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(piParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link piParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(piParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link piParser#proc}.
	 * @param ctx the parse tree
	 */
	void enterProc(piParser.ProcContext ctx);
	/**
	 * Exit a parse tree produced by {@link piParser#proc}.
	 * @param ctx the parse tree
	 */
	void exitProc(piParser.ProcContext ctx);
	/**
	 * Enter a parse tree produced by {@link piParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(piParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link piParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(piParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link piParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(piParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link piParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(piParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link piParser#branch}.
	 * @param ctx the parse tree
	 */
	void enterBranch(piParser.BranchContext ctx);
	/**
	 * Exit a parse tree produced by {@link piParser#branch}.
	 * @param ctx the parse tree
	 */
	void exitBranch(piParser.BranchContext ctx);
	/**
	 * Enter a parse tree produced by {@link piParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(piParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link piParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(piParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link piParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(piParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link piParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(piParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link piParser#subproc}.
	 * @param ctx the parse tree
	 */
	void enterSubproc(piParser.SubprocContext ctx);
	/**
	 * Exit a parse tree produced by {@link piParser#subproc}.
	 * @param ctx the parse tree
	 */
	void exitSubproc(piParser.SubprocContext ctx);
	/**
	 * Enter a parse tree produced by {@link piParser#tuple}.
	 * @param ctx the parse tree
	 */
	void enterTuple(piParser.TupleContext ctx);
	/**
	 * Exit a parse tree produced by {@link piParser#tuple}.
	 * @param ctx the parse tree
	 */
	void exitTuple(piParser.TupleContext ctx);
	/**
	 * Enter a parse tree produced by {@link piParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(piParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link piParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(piParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link piParser#arithExpr}.
	 * @param ctx the parse tree
	 */
	void enterArithExpr(piParser.ArithExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link piParser#arithExpr}.
	 * @param ctx the parse tree
	 */
	void exitArithExpr(piParser.ArithExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link piParser#logicExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicExpr(piParser.LogicExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link piParser#logicExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicExpr(piParser.LogicExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link piParser#pairExpr}.
	 * @param ctx the parse tree
	 */
	void enterPairExpr(piParser.PairExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link piParser#pairExpr}.
	 * @param ctx the parse tree
	 */
	void exitPairExpr(piParser.PairExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link piParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(piParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link piParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(piParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link piParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(piParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link piParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(piParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link piParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(piParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link piParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(piParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link piParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(piParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link piParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(piParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link piParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(piParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link piParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(piParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link piParser#subval}.
	 * @param ctx the parse tree
	 */
	void enterSubval(piParser.SubvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link piParser#subval}.
	 * @param ctx the parse tree
	 */
	void exitSubval(piParser.SubvalContext ctx);
}