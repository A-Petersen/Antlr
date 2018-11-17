package a4;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import javax.swing.*;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Calc_1 {

    public static int testInt;

    public static int test(String str) throws IOException {
        InputStream is = new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
        ANTLRInputStream input = new ANTLRInputStream(is);
        KalkulatorLexer lex = new KalkulatorLexer(input);
        CommonTokenStream token = new CommonTokenStream(lex);
        KalkulatorParser parser = new KalkulatorParser(token);
        EvalVisitor eval = new EvalVisitor();
        ParseTree tree = parser.prog();
        return eval.visit(tree);
    }

    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if (args.length>0) inputFile = args[0];
        InputStream is = System.in;
        if (inputFile != null) is = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is);

        KalkulatorLexer lex = new KalkulatorLexer(input);
        CommonTokenStream token = new CommonTokenStream(lex);
        KalkulatorParser parser = new KalkulatorParser(token);

        ParseTree tree = parser.prog();
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