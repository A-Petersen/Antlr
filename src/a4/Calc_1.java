package a4;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import java.util.Arrays;

public class Calc_1 {

    public static int testInt;

    public static int test(String str) {
        ANTLRInputStream input = new ANTLRInputStream(str);
        KalkulatorLexer lex = new KalkulatorLexer(input);
        CommonTokenStream token = new CommonTokenStream(lex);
        KalkulatorParser parser = new KalkulatorParser(token);
        EvalVisitor eval = new EvalVisitor();
        ParseTree tree = parser.stat();
        return eval.visit(tree);
    }

    public static void main(String[] args) throws Exception {
        CharStream input;
        if (args.length>0) input = new ANTLRFileStream(args[0]);
        else input = new ANTLRInputStream(System.in);

        KalkulatorLexer lex = new KalkulatorLexer(input);
        CommonTokenStream token = new CommonTokenStream(lex);
        KalkulatorParser parser = new KalkulatorParser(token);

        ParseTree tree = parser.stat();
        viewTree(tree, parser);

        EvalVisitor eval = new EvalVisitor();
        testInt = eval.visit(tree);

    }

    private static void viewTree(ParseTree tree, KalkulatorParser parser) {
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