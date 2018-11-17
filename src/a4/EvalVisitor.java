package a4;

import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends KalkulatorBaseVisitor<Integer> {
//    /** "memory" for our calculator; variable/value pairs go here */
//    Map<String, Integer> memory = new HashMap<String, Integer>();

//    /** ID '=' expr NEWLINE */
//    @Override
//    public Integer visitAssign(KalkulatorParser.AssignContext ctx) {
//        String id = ctx.ID().getText();  // id is left-hand side of '='
//        int value = visit(ctx.expr());   // compute value of expression on right
//        memory.put(id, value);           // store it in our memory
//        return value;
//    }

    /** expr NEWLINE */
    @Override
    public Integer visitPrintExpr(KalkulatorParser.PrintExprContext ctx) {
        Integer value = visit(ctx.expr()); // evaluate the expr child
        System.out.println(value);         // print the result
        return value;                          // return dummy value
    }

    /** INT */
    @Override
    public Integer visitInt(KalkulatorParser.IntContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }

//    /** ID */
//    @Override
//    public Integer visitId(KalkulatorParser.IdContext ctx) {
//        String id = ctx.ID().getText();
//        if ( memory.containsKey(id) ) return memory.get(id);
//        return 0;
//    }

    /** expr op=('*'|'/') expr */
    @Override
    public Integer visitMultDiv(KalkulatorParser.MultDivContext ctx) {
        int left = visit(ctx.expr(0));  // get value of left subexpression
        int right = visit(ctx.expr(1)); // get value of right subexpression
        if ( ctx.op.getType() == KalkulatorParser.MUL ) return left * right;
        return left / right; // must be DIV
    }

    /** expr op=('+'|'-') expr */
    @Override
    public Integer visitAddSub(KalkulatorParser.AddSubContext ctx) {
        int left = visit(ctx.expr(0));  // get value of left subexpression
        int right = visit(ctx.expr(1)); // get value of right subexpression
        if ( ctx.op.getType() == KalkulatorParser.ADD ) return left + right;
        return left - right; // must be SUB
    }

    /** '(' expr ')' */
    @Override
    public Integer visitBrackets(KalkulatorParser.BracketsContext ctx) {
        return visit(ctx.expr()); // return child expr's value
    }
}
