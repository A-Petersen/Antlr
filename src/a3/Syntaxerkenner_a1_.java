package a3;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import javax.swing.*;
import java.util.Arrays;

public class Syntaxerkenner_a1_ {

    public static String testString;

        public static void main(String[] args) throws Exception {
            CharStream input;
            if (args.length>0) input = new ANTLRFileStream(args[0]);
            else input = new ANTLRInputStream(System.in);

            Syntaxerkenner_a1_Lexer lex = new Syntaxerkenner_a1_Lexer(input);
            CommonTokenStream token = new CommonTokenStream(lex);
            Syntaxerkenner_a1_Parser parser = new Syntaxerkenner_a1_Parser(token);

            ParseTree tree = parser.decl();
            testString = tree.toStringTree(parser);
            System.out.println(testString);

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