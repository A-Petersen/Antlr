package a3;// Generated from Syntaxerkenner_a3_x_.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Syntaxerkenner_a3_x_Parser}.
 */
public interface Syntaxerkenner_a3_x_Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Syntaxerkenner_a3_x_Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(Syntaxerkenner_a3_x_Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Syntaxerkenner_a3_x_Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(Syntaxerkenner_a3_x_Parser.ExprContext ctx);
}