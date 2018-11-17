package a4;// Generated from Kalkulator.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KalkulatorParser}.
 */
public interface KalkulatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link KalkulatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(KalkulatorParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link KalkulatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(KalkulatorParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link KalkulatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(KalkulatorParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link KalkulatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(KalkulatorParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link KalkulatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(KalkulatorParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link KalkulatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(KalkulatorParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link KalkulatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(KalkulatorParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link KalkulatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(KalkulatorParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code brackets}
	 * labeled alternative in {@link KalkulatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBrackets(KalkulatorParser.BracketsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code brackets}
	 * labeled alternative in {@link KalkulatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBrackets(KalkulatorParser.BracketsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultDiv}
	 * labeled alternative in {@link KalkulatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultDiv(KalkulatorParser.MultDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultDiv}
	 * labeled alternative in {@link KalkulatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultDiv(KalkulatorParser.MultDivContext ctx);
}