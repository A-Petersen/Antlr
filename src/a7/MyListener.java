package a7;

import org.antlr.v4.runtime.tree.ParseTree;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import java.util.HashMap;

import static a7.ClobalParser.*;

public class MyListener extends ClobalBaseListener {

    STGroup stG = new STGroupFile("a7/ST_PCODE.stg");
    private HashMap<ParseTree, ST> mainCode = new HashMap<>();
    private HashMap<String, Entry> symbol = new HashMap<>();
    private int keys = 0;

    @Override public void exitFile(ClobalParser.FileContext ctx) {
        ST temp = t("program").add("numGVars", keys );
//        mainCode.forEach((x, y) -> temp.add("functions", y));
//        mainCode.forEach((x, y) -> System.out.println(y.render()));
//        System.out.println("\n\n\n" + temp.render());
    }

    @Override public void exitFunctionDecl(ClobalParser.FunctionDeclContext ctx) {
//        if (ctx.ID().getText().equals("main")) {
//            setST(ctx, t("main").add("function", ctx.ID().getText()).add("block", getST(ctx.block())));
//        } else {
            ST st = t("function").add("name", ctx.ID().getText()).add("block", getST(ctx.block()));
            System.out.println("exitFunctionDecl:\n" + st.render());
            setST(ctx, st);
//        }
    }

    @Override public void exitBlock(ClobalParser.BlockContext ctx) {
        ST st = t("block");
        for (StatContext sC : ctx.stat()) {
            st.add("state", getST(sC.children.get(0)));
        }
        System.out.println("exitBlock:\n" + st.render());
        setST(ctx, st);
    }

    @Override public void exitStat(ClobalParser.StatContext ctx) {
        ST st = t("block");
        System.out.println("exitBracket:" + st.render());
        setST(ctx, st);
    }

    @Override public void exitBracket(ClobalParser.BracketContext ctx) {
        ST st = getST(ctx.expr());
        System.out.println("exitBracket:\n" + st.render());
        setST(ctx, st);
    }

    @Override public void exitVarDecl(ClobalParser.VarDeclContext ctx) {
        symbol.put(ctx.ID().getText(), new Entry(keys));
        keys++;
        System.out.println("exitVarDecl:\n" + symbol.get(ctx.ID().getText()).getKey());
//        setST(ctx, t("varDecl").add("int", ctx.ID().getText()));
    }

    @Override public void exitAssignStat(ClobalParser.AssignStatContext ctx) {
//        ST index = getST(ctx.ID());
        String i = "" + symbol.get(ctx.ID().getText()).getKey();
        ST v = getST(ctx.expr());
        System.out.println("exitAssignStat:\n" + i + " = " + v.render());
        setST(ctx, t("assign").add("v", v).add("index", i));
    }

    @Override public void exitBinOp(ClobalParser.BinOpContext ctx) {
        ST left = getST(ctx.expr(0));
        ST right = getST(ctx.expr(1));
        System.out.println("exitBinOp:\n" + left.render() + " -- " + right.render());
        setST(ctx, t(left, ctx.op.getType(), right));
    }

    @Override public void exitReturnStat(ClobalParser.ReturnStatContext ctx) {
        ST st = t("returnStat").add("expr", getST(ctx.expr()));
        System.out.println("exitReturnStat:\n" + st.render());
        setST(ctx, st);
    }

    @Override public void exitInt(ClobalParser.IntContext ctx) {
        ST st = t("int_").add("v", ctx.INT().getText());
        System.out.println("exitInt:\n" + st.render());
        setST(ctx, st);
    }

    @Override public void exitId(ClobalParser.IdContext ctx) {
        ST st = t("id_").add("id", symbol.get(ctx.ID().getText()).getKey());
        System.out.println("exitId:\n" + st.render());
        setST(ctx, st);
    }

    ST t(ST left, int op, ST right) {
        String templateName = "error";
        switch(op) {
            case MUL :  templateName = "MUL";
                break;
            case DIV :  templateName = "DIV";
                break;
            case ADD :  templateName = "ADD";
                break;
            case SUB :  templateName = "SUB";
                break;
            case POW :  templateName = "POW";
                break;
            case EQU :  templateName = "EQU";
                break;
            case BIG :  templateName = "BIG";
                break;
            case SMA :  templateName = "SMA";
                break;
        }
        return t(templateName).add("left", left).add("right", right);
    }

    ST t(String str) {
        return stG.getInstanceOf(str);
    }

    void setST(ParseTree ctx, ST st) {
        mainCode.put(ctx, st);
    }

    ST getST(ParseTree ctx) {
        return mainCode.get(ctx);
    }
}
