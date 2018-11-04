package a3;// Generated from Syntaxerkenner_a2_.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Syntaxerkenner_a2_Parser}.
 */
public interface Syntaxerkenner_a2_Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Syntaxerkenner_a2_Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(Syntaxerkenner_a2_Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Syntaxerkenner_a2_Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(Syntaxerkenner_a2_Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link Syntaxerkenner_a2_Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(Syntaxerkenner_a2_Parser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link Syntaxerkenner_a2_Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(Syntaxerkenner_a2_Parser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link Syntaxerkenner_a2_Parser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(Syntaxerkenner_a2_Parser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link Syntaxerkenner_a2_Parser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(Syntaxerkenner_a2_Parser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link Syntaxerkenner_a2_Parser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(Syntaxerkenner_a2_Parser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link Syntaxerkenner_a2_Parser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(Syntaxerkenner_a2_Parser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link Syntaxerkenner_a2_Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(Syntaxerkenner_a2_Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Syntaxerkenner_a2_Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(Syntaxerkenner_a2_Parser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Syntaxerkenner_a2_Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(Syntaxerkenner_a2_Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link Syntaxerkenner_a2_Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(Syntaxerkenner_a2_Parser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link Syntaxerkenner_a2_Parser#pow}.
	 * @param ctx the parse tree
	 */
	void enterPow(Syntaxerkenner_a2_Parser.PowContext ctx);
	/**
	 * Exit a parse tree produced by {@link Syntaxerkenner_a2_Parser#pow}.
	 * @param ctx the parse tree
	 */
	void exitPow(Syntaxerkenner_a2_Parser.PowContext ctx);
	/**
	 * Enter a parse tree produced by {@link Syntaxerkenner_a2_Parser#fact}.
	 * @param ctx the parse tree
	 */
	void enterFact(Syntaxerkenner_a2_Parser.FactContext ctx);
	/**
	 * Exit a parse tree produced by {@link Syntaxerkenner_a2_Parser#fact}.
	 * @param ctx the parse tree
	 */
	void exitFact(Syntaxerkenner_a2_Parser.FactContext ctx);
}