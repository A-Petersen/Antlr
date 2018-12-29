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
        ST st = t("program").add("numGVars", keys );
//        for (VarDeclContext vC : ctx.varDecl()) {
//            st.add("state", getST(vC.children.get(0)));
//        }
        for (FunctionDeclContext fC : ctx.functionDecl()) {
            st.add("functions", getST(fC));
        }
        System.out.println("\nexitFile:\n" + st.render());
        setST(ctx, st);
    }

    @Override public void exitFunctionDecl(ClobalParser.FunctionDeclContext ctx) {
        if (ctx.ID().getText().equals("main")) {
            ST st = t("main")
                    .add("function", ctx.ID().getText())
                    .add("args", keys)
                    .add("block", getST(ctx.block()));
            System.out.println("\nexitFunctionDecl:\n" + st.render());
            setST(ctx, st);
        } else {
            ST st = t("function")
                    .add("name", ctx.ID().getText())
                    .add("block", getST(ctx.block()));
            System.out.println("\nexitFunctionDecl:\n" + st.render());
            setST(ctx, st);
        }
    }

    @Override public void exitBlock(ClobalParser.BlockContext ctx) {
        ST st = t("block");
        for (StatContext sC : ctx.stat()) {
            st.add("state", getST(sC.children.get(0)));
        }
        System.out.println("\nexitBlock:\n" + st.render());
        setST(ctx, st);
    }

//    @Override public void exitStat(ClobalParser.StatContext ctx) {
//        ST st = t("block");
//        System.out.println("\nexitBracket:" + st.render());
//        setST(ctx, st);
//    }

    @Override public void exitPrintStat(ClobalParser.PrintStatContext ctx) {
        ST st = getST(ctx.expr());
        System.out.println("\nexitPrintStat:\n" + st.render());
        setST(ctx, t("printStat").add("expr", st));
    }

    @Override public void exitBracket(ClobalParser.BracketContext ctx) {
        ST st = getST(ctx.expr());
        System.out.println("\nexitBracket:\n" + st.render());
        setST(ctx, st);
    }

    @Override public void exitCase(ClobalParser.CaseContext ctx) {
        ST binOp = getST(ctx.expr(0));
        ST tr = getST(ctx.expr(1));
        ST fa = getST(ctx.expr(2));
        ST st = t("ifElse")
                .add("condition", binOp)
                .add("stat1", tr)
                .add("stat2", fa);
        System.out.println("\nexitCase:\n" + st.render());
        setST(ctx, st);
    }

    @Override public void exitVarDecl(ClobalParser.VarDeclContext ctx) {
        symbol.put(ctx.ID().getText(), new Entry(keys));
        keys++;
        System.out.println("\nexitVarDecl:\n" + symbol.get(ctx.ID().getText()).getKey());
//        setST(ctx, t("varDecl").add("int", ctx.ID().getText()));
    }

    @Override public void exitForStat(ClobalParser.ForStatContext ctx) {
        ST binOp = getST(ctx.expr());
        ST a1 = getST(ctx.assignStat(0));
        ST a2 = getST(ctx.assignStat(1));
        ST st = t("for")
                .add("assign1", a1)
                .add("assign2", a2)
                .add("binOp", binOp)
                .add("block", getST(ctx.block()));
        System.out.println("\nexitForStat:\n" + st.render());
        setST(ctx, st);
    }

    @Override public void exitAssignStat(ClobalParser.AssignStatContext ctx) {
        String i = "" + symbol.get(ctx.ID().getText()).getKey();
        ST v = getST(ctx.expr());
        System.out.println("\nexitAssignStat:\n" + i + " = " + v.render());
        setST(ctx, t("assign").add("v", v).add("index", i));
    }

    @Override public void exitBinOp(ClobalParser.BinOpContext ctx) {
        ST left = getST(ctx.expr(0));
        ST right = getST(ctx.expr(1));
        System.out.println("\nexitBinOp:\n" + left.render() + " -- " + right.render());
        setST(ctx, t(left, ctx.op.getType(), right));
    }

    @Override public void exitReturnStat(ClobalParser.ReturnStatContext ctx) {
        ST st = t("returnStat").add("expr", getST(ctx.expr()));
        System.out.println("\nexitReturnStat:\n" + st.render());
        setST(ctx, st);
    }

    @Override public void exitInt(ClobalParser.IntContext ctx) {
        ST st = t("int_").add("v", ctx.INT().getText());
        System.out.println("\nexitInt:\n" + st.render());
        setST(ctx, st);
    }

    @Override public void exitId(ClobalParser.IdContext ctx) {
        ST st = t("id_").add("id", symbol.get(ctx.ID().getText()).getKey());
        System.out.println("\nexitId:\n" + st.render());
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
