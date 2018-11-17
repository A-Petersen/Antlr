package a4;

import org.antlr.v4.runtime.*;

public class Calc_2 {

    public static int testInt;

    public static int test(String str) {
        ANTLRInputStream input = new ANTLRInputStream(str);
        Kalkulator_2Lexer lex = new Kalkulator_2Lexer(input);
        CommonTokenStream token = new CommonTokenStream(lex);
        Kalkulator_2Parser parser = new Kalkulator_2Parser(token);
        parser.setBuildParseTree(false);
        return parser.stat().expr.v;
    }

    public static void main(String[] args) throws Exception {
        CharStream input;
        if (args.length>0) input = new ANTLRFileStream(args[0]);
        else input = new ANTLRInputStream(System.in);

        Kalkulator_2Lexer lex = new Kalkulator_2Lexer(input);
        CommonTokenStream token = new CommonTokenStream(lex);
        Kalkulator_2Parser parser = new Kalkulator_2Parser(token);

        parser.setBuildParseTree(false);
        testInt = parser.stat().expr.v;
    }
}