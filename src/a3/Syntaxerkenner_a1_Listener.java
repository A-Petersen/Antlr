package a3;// Generated from Syntaxerkenner_a1_.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Syntaxerkenner_a1_Parser}.
 */
public interface Syntaxerkenner_a1_Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Syntaxerkenner_a1_Parser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(Syntaxerkenner_a1_Parser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link Syntaxerkenner_a1_Parser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(Syntaxerkenner_a1_Parser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link Syntaxerkenner_a1_Parser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(Syntaxerkenner_a1_Parser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link Syntaxerkenner_a1_Parser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(Syntaxerkenner_a1_Parser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link Syntaxerkenner_a1_Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(Syntaxerkenner_a1_Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Syntaxerkenner_a1_Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(Syntaxerkenner_a1_Parser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Syntaxerkenner_a1_Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(Syntaxerkenner_a1_Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link Syntaxerkenner_a1_Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(Syntaxerkenner_a1_Parser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link Syntaxerkenner_a1_Parser#pow}.
	 * @param ctx the parse tree
	 */
	void enterPow(Syntaxerkenner_a1_Parser.PowContext ctx);
	/**
	 * Exit a parse tree produced by {@link Syntaxerkenner_a1_Parser#pow}.
	 * @param ctx the parse tree
	 */
	void exitPow(Syntaxerkenner_a1_Parser.PowContext ctx);
	/**
	 * Enter a parse tree produced by {@link Syntaxerkenner_a1_Parser#fact}.
	 * @param ctx the parse tree
	 */
	void enterFact(Syntaxerkenner_a1_Parser.FactContext ctx);
	/**
	 * Exit a parse tree produced by {@link Syntaxerkenner_a1_Parser#fact}.
	 * @param ctx the parse tree
	 */
	void exitFact(Syntaxerkenner_a1_Parser.FactContext ctx);
}