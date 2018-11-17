// Generated from Kalkulator_2.g4 by ANTLR 4.7.1

package a4;
import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Kalkulator_2Parser}.
 */
public interface Kalkulator_2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Kalkulator_2Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(Kalkulator_2Parser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link Kalkulator_2Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(Kalkulator_2Parser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link Kalkulator_2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(Kalkulator_2Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Kalkulator_2Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(Kalkulator_2Parser.ExprContext ctx);
}