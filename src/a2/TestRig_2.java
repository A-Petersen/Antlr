package a2;

import static multiMenge.ListMultiset.*;

import multiMenge.Multiset;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.stringtemplate.v4.*;

public class TestRig_2 {
    public static void main(String[] args) throws Exception {
        CharStream input;
        if (args.length>0) input = new ANTLRFileStream(args[0]);
        else input = new ANTLRInputStream(System.in);


        HalsteadLexer lex = new HalsteadLexer(input);

        HalsteadCalc calcLex = new HalsteadCalc(lex);

        STGroup stG = new STGroupFile("a2/stringTemplateHalstead.stg");
        ST opFormat = stG.getInstanceOf("opFormat");
        opFormat.add("op", calcLex.getAll());

        ST halsteadPara = stG.getInstanceOf("halsteadPara");
        halsteadPara.add("aOperators", calcLex.getAmountOperators());
        halsteadPara.add("aOperands", calcLex.getAmountOperands());
        halsteadPara.add("aUniqueOperators", calcLex.getUniqueOperators());
        halsteadPara.add("aUniqueOperands", calcLex.getUniqueOperands());

        ST halsteadMetric = stG.getInstanceOf("HalsteadMetric");
        halsteadMetric.add("len", calcLex.getLength());
        halsteadMetric.add("vocab", calcLex.getVocabulary());
        halsteadMetric.add("volume", calcLex.getVolume());
        halsteadMetric.add("difficulty", calcLex.getDifficulty());
        halsteadMetric.add("effort", calcLex.getEffort());

        System.out.println(opFormat.render() + halsteadPara.render() + halsteadMetric.render());

    }


}
