package a4;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class EvalWithProps extends Kalkulator_3BaseListener {
    ParseTreeProperty<Integer> values = new ParseTreeProperty<>();

    public void setValue(ParseTree node, int value) {
        values.put(node, value);
    }
    public int getValue(ParseTree node) {
        return values.get(node);
    }

    @Override
    public void exitInt(Kalkulator_3Parser.IntContext ctx) {
        String intText = ctx.INT().getText();
        setValue(ctx, Integer.valueOf(intText));
    }

    @Override
    public void exitAdd(Kalkulator_3Parser.AddContext ctx) {
        int left = getValue(ctx.expr(0));
        int right = getValue(ctx.expr(1));
        setValue(ctx, left + right);
    }

    @Override
    public void exitStat(Kalkulator_3Parser.StatContext ctx) {
        setValue(ctx, getValue(ctx.expr()));
    }

    @Override
    public void exitDiv(Kalkulator_3Parser.DivContext ctx) {
        int left = getValue(ctx.expr(0));
        int right = getValue(ctx.expr(1));
        setValue(ctx, left / right);
    }

    @Override
    public void exitBracket(Kalkulator_3Parser.BracketContext ctx) {
        setValue(ctx, getValue(ctx.expr()));
    }

    @Override
    public void exitSub(Kalkulator_3Parser.SubContext ctx) {
        int left = getValue(ctx.expr(0));
        int right = getValue(ctx.expr(1));
        setValue(ctx, left - right);
    }

    @Override
    public void exitMult(Kalkulator_3Parser.MultContext ctx) {
        int left = getValue(ctx.expr(0));
        int right = getValue(ctx.expr(1));
        setValue(ctx, left * right);
    }
}
