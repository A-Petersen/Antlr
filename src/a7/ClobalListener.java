package a7;// Generated from Clobal.g4 by ANTLR 4.7.1


import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ClobalParser}.
 */
public interface ClobalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ClobalParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(ClobalParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClobalParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(ClobalParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClobalParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(ClobalParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClobalParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(ClobalParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClobalParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ClobalParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClobalParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ClobalParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClobalParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(ClobalParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClobalParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(ClobalParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClobalParser#assignStat}.
	 * @param ctx the parse tree
	 */
	void enterAssignStat(ClobalParser.AssignStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClobalParser#assignStat}.
	 * @param ctx the parse tree
	 */
	void exitAssignStat(ClobalParser.AssignStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClobalParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(ClobalParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClobalParser#ifStat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(ClobalParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClobalParser#forStat}.
	 * @param ctx the parse tree
	 */
	void enterForStat(ClobalParser.ForStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClobalParser#forStat}.
	 * @param ctx the parse tree
	 */
	void exitForStat(ClobalParser.ForStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClobalParser#returnStat}.
	 * @param ctx the parse tree
	 */
	void enterReturnStat(ClobalParser.ReturnStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClobalParser#returnStat}.
	 * @param ctx the parse tree
	 */
	void exitReturnStat(ClobalParser.ReturnStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClobalParser#printStat}.
	 * @param ctx the parse tree
	 */
	void enterPrintStat(ClobalParser.PrintStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClobalParser#printStat}.
	 * @param ctx the parse tree
	 */
	void exitPrintStat(ClobalParser.PrintStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClobalParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(ClobalParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClobalParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(ClobalParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClobalParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ClobalParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClobalParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ClobalParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Function}
	 * labeled alternative in {@link ClobalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunction(ClobalParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Function}
	 * labeled alternative in {@link ClobalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunction(ClobalParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Negation}
	 * labeled alternative in {@link ClobalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNegation(ClobalParser.NegationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Negation}
	 * labeled alternative in {@link ClobalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNegation(ClobalParser.NegationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bracket}
	 * labeled alternative in {@link ClobalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBracket(ClobalParser.BracketContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bracket}
	 * labeled alternative in {@link ClobalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBracket(ClobalParser.BracketContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link ClobalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(ClobalParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link ClobalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(ClobalParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinOp}
	 * labeled alternative in {@link ClobalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinOp(ClobalParser.BinOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinOp}
	 * labeled alternative in {@link ClobalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinOp(ClobalParser.BinOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link ClobalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(ClobalParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link ClobalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(ClobalParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Case}
	 * labeled alternative in {@link ClobalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCase(ClobalParser.CaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Case}
	 * labeled alternative in {@link ClobalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCase(ClobalParser.CaseContext ctx);
}