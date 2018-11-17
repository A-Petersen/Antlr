package a4;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

import java.util.HashMap;
import java.util.Map;

public class EvalWithProps extends Kalkulator_3BaseListener {
    ParseTreeProperty<Integer> values = new ParseTreeProperty<>();
    Map<String, Integer> memory =  new HashMap<String,Integer>();

    public void setValue(ParseTree node, int value) {
        values.put(node, value);
    }

    public int getValue(ParseTree node) {
        return values.get(node);
    }

    @Override
    public void exitProg(Kalkulator_3Parser.ProgContext ctx) {
        setValue(ctx, getValue(ctx.stat().get(ctx.stat().size() - 1)));
    }

    @Override
    public void exitInt(Kalkulator_3Parser.IntContext ctx) {
        String intText = ctx.INT().getText();
        setValue(ctx, Integer.valueOf(intText));
    }

    @Override
    public void exitAssign(Kalkulator_3Parser.AssignContext ctx) {
        String id = ctx.ID().getText();
        int value = getValue(ctx.expr());
        memory.put(id, value);
        setValue(ctx, getValue(ctx.expr()));
    }

    @Override
    public void exitId(Kalkulator_3Parser.IdContext ctx) {
        if (memory.containsKey(ctx.ID().getText())) {
            setValue(ctx, memory.get(ctx.ID().getText()));
        } else {
            setValue(ctx, 0);
        }

    }

    @Override
    public void exitClear(Kalkulator_3Parser.ClearContext ctx) {
        memory.clear();
    }

    @Override
    public void exitBig(Kalkulator_3Parser.BigContext ctx) {
        int left = getValue(ctx.expr(0));
        int right = getValue(ctx.expr(1));
        setValue(ctx, left > right ? 1 : 0);
    }

    @Override
    public void exitCond(Kalkulator_3Parser.CondContext ctx) {
        int left = getValue(ctx.expr(0));
        int mid = getValue(ctx.expr(1));
        int right = getValue(ctx.expr(2));
        setValue(ctx, left == 1 ? mid : right);
    }

    @Override
    public void exitSmall(Kalkulator_3Parser.SmallContext ctx) {
        int left = getValue(ctx.expr(0));
        int right = getValue(ctx.expr(1));
        setValue(ctx, left < right ? 1 : 0);
    }

    @Override
    public void exitIfElse(Kalkulator_3Parser.IfElseContext ctx) {
        int left = getValue(ctx.expr(0));
        int mid = getValue(ctx.expr(1));
        int right = getValue(ctx.expr(2));
        setValue(ctx, left == 1 ? mid : right);
    }

    @Override
    public void exitEqual(Kalkulator_3Parser.EqualContext ctx) {
        int left = getValue(ctx.expr(0));
        int right = getValue(ctx.expr(1));
        setValue(ctx, left == right ? 1 : 0);
    }

    @Override
    public void exitPow(Kalkulator_3Parser.PowContext ctx) {
        int left = getValue(ctx.expr(0));
        int right = getValue(ctx.expr(1));
        setValue(ctx, (int)Math.pow((double)left, (double)right));
    }

    @Override
    public void exitAdd(Kalkulator_3Parser.AddContext ctx) {
        int left = getValue(ctx.expr(0));
        int right = getValue(ctx.expr(1));
        setValue(ctx, left + right);
    }

    @Override
    public void exitCalc(Kalkulator_3Parser.CalcContext ctx) {
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
