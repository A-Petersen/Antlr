package a7;

import map.Map;
import org.antlr.v4.runtime.tree.ParseTree;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import java.util.HashMap;

import static a7.ClobalParser.*;

public class MyListener extends ClobalBaseListener {

    STGroup stG = new STGroupFile("a7/ST_PCODE.stg");
    private HashMap<ParseTree, ST> mainCode;

    @Override public void exitBracket(ClobalParser.BracketContext ctx) {
        setST(ctx, getST(ctx.expr()));
    }
    @Override public void exitBinOp(ClobalParser.BinOpContext ctx) {
        ST left = getST(ctx.expr(0));
        ST right = getST(ctx.expr(1));
        setST(ctx, t(left, ctx.op.getType(), right));
    }
    @Override public void exitInt(ClobalParser.IntContext ctx) {
        setST(ctx, t("int").add("v", ctx.INT().getText()));
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
