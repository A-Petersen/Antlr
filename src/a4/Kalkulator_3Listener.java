package a4;// Generated from Kalkulator_3.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Kalkulator_3Parser}.
 */
public interface Kalkulator_3Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Kalkulator_3Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(Kalkulator_3Parser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link Kalkulator_3Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(Kalkulator_3Parser.StatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Div}
	 * labeled alternative in {@link Kalkulator_3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDiv(Kalkulator_3Parser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link Kalkulator_3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDiv(Kalkulator_3Parser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Add}
	 * labeled alternative in {@link Kalkulator_3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAdd(Kalkulator_3Parser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link Kalkulator_3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAdd(Kalkulator_3Parser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Bracket}
	 * labeled alternative in {@link Kalkulator_3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBracket(Kalkulator_3Parser.BracketContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bracket}
	 * labeled alternative in {@link Kalkulator_3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBracket(Kalkulator_3Parser.BracketContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link Kalkulator_3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSub(Kalkulator_3Parser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link Kalkulator_3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSub(Kalkulator_3Parser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link Kalkulator_3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMult(Kalkulator_3Parser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link Kalkulator_3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMult(Kalkulator_3Parser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link Kalkulator_3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(Kalkulator_3Parser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link Kalkulator_3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(Kalkulator_3Parser.IntContext ctx);
}