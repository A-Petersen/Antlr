package a4;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import javax.swing.*;
import java.util.Arrays;

public class Calc_3 {
    public static int testInt;

    public static int test(String str) {
        ANTLRInputStream input = new ANTLRInputStream(str);
        Kalkulator_3Lexer lex = new Kalkulator_3Lexer(input);
        CommonTokenStream token = new CommonTokenStream(lex);
        Kalkulator_3Parser parser = new Kalkulator_3Parser(token);
        ParseTree tree = parser.stat();
        ParseTreeWalker walker = new ParseTreeWalker();
        EvalWithProps evalProb = new EvalWithProps();

        walker.walk(evalProb, tree);
        System.out.println(evalProb.getValue(tree));
        return evalProb.getValue(tree);
    }

    public static void main(String[] args) throws Exception {
        CharStream input;
        if (args.length>0) input = new ANTLRFileStream(args[0]);
        else input = new ANTLRInputStream(System.in);

        Kalkulator_3Lexer lex = new Kalkulator_3Lexer(input);
        CommonTokenStream token = new CommonTokenStream(lex);
        Kalkulator_3Parser parser = new Kalkulator_3Parser(token);

        ParseTree tree = parser.stat();
//        viewTree(tree, parser);

        ParseTreeWalker walker = new ParseTreeWalker();
        EvalWithProps evalProb = new EvalWithProps();
        walker.walk(evalProb, tree);
        testInt = evalProb.getValue(tree);
        System.out.println("(" + evalProb.getValue(tree) + ")");

    }

    private static void viewTree(ParseTree tree, Kalkulator_3Parser parser) {
        // Ausgabe aus ANTLR "how-to-display-antlr-tree-gui" [https://stackoverflow.com/questions/23809005/how-to-display-antlr-tree-gui]
        JFrame frame = new JFrame("Antlr AST");
        JPanel panel = new JPanel();
        TreeViewer viewr = new TreeViewer(Arrays.asList(
                parser.getRuleNames()),tree);
        viewr.setScale(1.5);
        panel.add(viewr);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,200);
        frame.setVisible(true);
    }
}