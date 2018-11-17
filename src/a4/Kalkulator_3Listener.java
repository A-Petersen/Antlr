package a4;// Generated from Kalkulator_3.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Kalkulator_3Parser}.
 */
public interface Kalkulator_3Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Kalkulator_3Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(Kalkulator_3Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Kalkulator_3Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(Kalkulator_3Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Calc}
	 * labeled alternative in {@link Kalkulator_3Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterCalc(Kalkulator_3Parser.CalcContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Calc}
	 * labeled alternative in {@link Kalkulator_3Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitCalc(Kalkulator_3Parser.CalcContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Nl}
	 * labeled alternative in {@link Kalkulator_3Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterNl(Kalkulator_3Parser.NlContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Nl}
	 * labeled alternative in {@link Kalkulator_3Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitNl(Kalkulator_3Parser.NlContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link Kalkulator_3Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(Kalkulator_3Parser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link Kalkulator_3Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(Kalkulator_3Parser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Clear}
	 * labeled alternative in {@link Kalkulator_3Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterClear(Kalkulator_3Parser.ClearContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Clear}
	 * labeled alternative in {@link Kalkulator_3Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitClear(Kalkulator_3Parser.ClearContext ctx);
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
	 * Enter a parse tree produced by the {@code Big}
	 * labeled alternative in {@link Kalkulator_3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBig(Kalkulator_3Parser.BigContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Big}
	 * labeled alternative in {@link Kalkulator_3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBig(Kalkulator_3Parser.BigContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Cond}
	 * labeled alternative in {@link Kalkulator_3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCond(Kalkulator_3Parser.CondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Cond}
	 * labeled alternative in {@link Kalkulator_3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCond(Kalkulator_3Parser.CondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Small}
	 * labeled alternative in {@link Kalkulator_3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSmall(Kalkulator_3Parser.SmallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Small}
	 * labeled alternative in {@link Kalkulator_3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSmall(Kalkulator_3Parser.SmallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfElse}
	 * labeled alternative in {@link Kalkulator_3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIfElse(Kalkulator_3Parser.IfElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfElse}
	 * labeled alternative in {@link Kalkulator_3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIfElse(Kalkulator_3Parser.IfElseContext ctx);
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
	 * Enter a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link Kalkulator_3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqual(Kalkulator_3Parser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link Kalkulator_3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqual(Kalkulator_3Parser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Pow}
	 * labeled alternative in {@link Kalkulator_3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPow(Kalkulator_3Parser.PowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Pow}
	 * labeled alternative in {@link Kalkulator_3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPow(Kalkulator_3Parser.PowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Id}
	 * labeled alternative in {@link Kalkulator_3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(Kalkulator_3Parser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Id}
	 * labeled alternative in {@link Kalkulator_3Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(Kalkulator_3Parser.IdContext ctx);
}