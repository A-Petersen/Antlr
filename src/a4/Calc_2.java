package a4;

import org.antlr.v4.runtime.*;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Calc_2 {

    public static int testInt;

    public static int test(String str) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8))));
        String expr = br.readLine();
        int line = 1;
        int testMe = 66;

        Kalkulator_2Parser parser = new Kalkulator_2Parser(null);
        parser.setBuildParseTree(false);

        while (expr != null) {
            ANTLRInputStream input = new ANTLRInputStream(expr+"\n");
            Kalkulator_2Lexer lexer = new Kalkulator_2Lexer(input);
            lexer.setLine(line);
            lexer.setCharPositionInLine(0);
            CommonTokenStream token = new CommonTokenStream(lexer);
            parser.setInputStream(token);
            testMe = parser.stat().expr.v;
            expr = br.readLine();
            if (expr.equals("end")) break;
        }
        return testMe;
    }

    public static void main(String[] args) throws Exception {
        input();
    }

    public static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String expr = br.readLine();
        int line = 1;
        int testMe = 66;

        Kalkulator_2Parser parser = new Kalkulator_2Parser(null);
        parser.setBuildParseTree(false);

        while (expr != null) {
            ANTLRInputStream input = new ANTLRInputStream(expr+"\n");
            Kalkulator_2Lexer lexer = new Kalkulator_2Lexer(input);
            lexer.setLine(line);
            lexer.setCharPositionInLine(0);
            CommonTokenStream token = new CommonTokenStream(lexer);
            parser.setInputStream(token);
            testMe = parser.stat().expr.v;
            expr = br.readLine();
            line++;
            System.out.println("(" + expr + ")");
            if (expr.equals("end")) break;
        }
        System.out.println("Fin: " + testMe);
    }
}