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

        System.out.println( "Anzahl aller Operanden: " + calcLex.getAmountOperands() +
                "\nAnzahl aller Operatoren: " + calcLex.getAmountOperators() +
                "\nAnzahl verschiedener Operanden: " + calcLex.getUniqueOperands() +
                "\nAnzahl verschiedener Operatoren: " + calcLex.getUniqueOperators());


//        STGroup test = new STGroupFile("a1/stringTemplateGroup.stg");
//        ST st = test.getInstanceOf("abc");
//        st.add("xyz", "hello, ").add("uvw", "du!");
//        System.out.println(st.render());

    }


}
