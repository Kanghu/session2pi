// Generated from D:/Users/Kanghu/Github/session-pi/src/main/resources/grammar\pi.g4 by ANTLR 4.8
package gen.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link piParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface piVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link piParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(piParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link piParser#proc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProc(piParser.ProcContext ctx);
	/**
	 * Visit a parse tree produced by {@link piParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(piParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link piParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(piParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link piParser#branch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBranch(piParser.BranchContext ctx);
	/**
	 * Visit a parse tree produced by {@link piParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(piParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link piParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(piParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link piParser#subproc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubproc(piParser.SubprocContext ctx);
	/**
	 * Visit a parse tree produced by {@link piParser#tuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple(piParser.TupleContext ctx);
	/**
	 * Visit a parse tree produced by {@link piParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(piParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link piParser#arithExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithExpr(piParser.ArithExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link piParser#logicExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicExpr(piParser.LogicExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link piParser#pairExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPairExpr(piParser.PairExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link piParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(piParser.PairContext ctx);
	/**
	 * Visit a parse tree produced by {@link piParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(piParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link piParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(piParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link piParser#num}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(piParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by {@link piParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(piParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link piParser#subval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubval(piParser.SubvalContext ctx);
}