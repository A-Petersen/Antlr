package a4;

import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends KalkulatorBaseVisitor<Integer> {
    Map<String, Integer> memory = new HashMap<String, Integer>();

    @Override
    public Integer visitAssign(KalkulatorParser.AssignContext ctx) {
        String id = ctx.ID().getText();
        int value = visit(ctx.expr());
        memory.put(id, value);
        return value;
    }

    @Override
    public Integer visitPrintExpr(KalkulatorParser.PrintExprContext ctx) {
        Integer value = visit(ctx.expr());
        System.out.println(value);
        return value;
    }

    @Override
    public Integer visitClear(KalkulatorParser.ClearContext ctx) {
        memory.clear();
        return 0;
    }

    @Override
    public Integer visitEquals(KalkulatorParser.EqualsContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        return left == right ? 1 : 0;
    }

    @Override
    public Integer visitBigSmall(KalkulatorParser.BigSmallContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        if ( ctx.op.getType() == KalkulatorParser.BIG ) return left > right ? 1 : 0;
        return left < right ? 1 : 0;
    }

    @Override
    public Integer visitPow(KalkulatorParser.PowContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        return (int)Math.pow((double)left, (double)right);
    }

    @Override
    public Integer visitConditional(KalkulatorParser.ConditionalContext ctx) {
        int left = visit(ctx.expr(0));
        int mid = visit(ctx.expr(1));
        int right = visit(ctx.expr(2));
        return left == 1 ? mid : right;
    }

    @Override
    public Integer visitInt(KalkulatorParser.IntContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }

    @Override
    public Integer visitId(KalkulatorParser.IdContext ctx) {
        String id = ctx.ID().getText();
        if ( memory.containsKey(id) ) return memory.get(id);
        return 0;
    }

    @Override
    public Integer visitMultDiv(KalkulatorParser.MultDivContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        if ( ctx.op.getType() == KalkulatorParser.MUL ) return left * right;
        return left / right;
    }

    @Override
    public Integer visitAddSub(KalkulatorParser.AddSubContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));
        if ( ctx.op.getType() == KalkulatorParser.ADD ) return left + right;
        return left - right;
    }

    @Override
    public Integer visitBrackets(KalkulatorParser.BracketsContext ctx) {
        return visit(ctx.expr());
    }
}
