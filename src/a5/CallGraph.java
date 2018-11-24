package a5;

import java.io.*;
import java.util.*;

import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.MultiMap;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import javax.swing.*;

public class CallGraph {

    public static class Graph {
        Set<String[]> nodes = new HashSet<String[]>();
        MultiMap<String, String> edges = new MultiMap<String, String>();

        public void edge(String source, String target) {
            edges.map(source, target);
        }

        public String toDOT() throws IOException {

            STGroup stG = new STGroupFile("a5/stringTemplateDOT.stg");
            ST dot = stG.getInstanceOf("DOT");
            dot.add("ranksep", .25);
            dot.add("arrowsize", .5);
            dot.add("margin", 0);
            dot.add("fontcolor", "blue");
            dot.add("fontsize", 32);
            dot.add("width", 0.5);
            dot.add("shape", "circle");
            dot.add("style", "filled");
            dot.add("nodes", nodes);
            dot.add("edges", edges);

            return dot.render();
        }

    }

    public static class FunctionListener extends CymbolBaseListener {
        Graph graph = new Graph();
        String[] currentFunctionName = {"", ""};
        boolean containsRecursion = false;

        /**
         * functionDecl
         :       type ID '('formalParameters')' block
         ;
         */
        @Override
        public void enterFunctionDecl(CymbolParser.FunctionDeclContext ctx) {
            currentFunctionName = new String[] {"", ""};
            currentFunctionName[0] = ctx.ID().getText();
            graph.nodes.add(currentFunctionName);
        }

        /**
         * expr    :   ID '(' exprList? ')'    #Call
         */
        @Override
        public void exitCall(CymbolParser.CallContext ctx) {
            String funcName = ctx.ID().getText();
//            System.out.println("exitCall: " + ctx.parent.getText());
            boolean inReturnState = false;
            if (ctx.parent.getText().length() >= 6 + currentFunctionName[0].length()) {
                inReturnState = ctx.parent.getText().substring(0, 6 + currentFunctionName[0].length() ).contains("return" + currentFunctionName[0]);
//                System.out.println(inReturnState);
            }
            boolean externFuncInReturn = false;
            if (ctx.parent.getText().length() >= 6 + funcName.length()) {
                externFuncInReturn = ctx.parent.getText().substring(0,6 + funcName.length()).contains("return" + funcName);
//                System.out.println(externFuncInReturn);
            }
            boolean endRecFunct = (inReturnState && containsRecursion);
            boolean notEndFunc = (!inReturnState && containsRecursion);
            /** map current function to the calle */
            if (externFuncInReturn || inReturnState) {
                graph.edge(currentFunctionName[0], funcName + "[color=green]");
            } else {
                if (notEndFunc) {
                    graph.edge(currentFunctionName[0], funcName + "[color=red]");
                } else {
                    graph.edge(currentFunctionName[0], funcName);
                }
            }

            if (endRecFunct) {
                graph.nodes.remove(currentFunctionName);
                currentFunctionName[1] = "[fillcolor=green]";
                graph.nodes.add(currentFunctionName);
            }
            if (notEndFunc) {
                graph.nodes.remove(currentFunctionName);
                currentFunctionName[1] = "[fillcolor=red]";
                graph.nodes.add(currentFunctionName);
            }
        }

        /**
         * stat    :   'return' expr? ';'      #Return
         */
        @Override
        public void enterReturn(CymbolParser.ReturnContext ctx) {
            containsRecursion = false;
            containsRecursion = ctx.expr().getText().contains(currentFunctionName[0]);

//            System.out.println("\n-----------");
//            System.out.println("exitReturn: " + ctx.expr().getText());
//            System.out.println("exitReturn recursiv: " + ctx.expr().getText().contains(currentFunctionName[0]));
//            System.out.println("------------\n");
        }
    }

    /**
     *
     int main() { fact(); a(); }
     float fact(int n) {
     print(n);
     if ( n==0 ) { return 1; }
     return n * fact(n-1);
     }
     void a() { int x = b(); if (false) { c(); d(); } }
     void b() { c(); }
     void c() { b(); }
     void d() { d(); }
     void e() { return e(); }

     int sum(int n) {
     if (n==0) {
     return 0; }
     else {
     return n + sum(n-1); } }

     int sum1(int n) {
     return sum1(n-1); }

     int sum2() {
     return 0;
     }
     */
    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null ) {
            is = new FileInputStream(inputFile);
        }
        ANTLRInputStream input = new ANTLRInputStream(is);

        CymbolLexer lexer = new CymbolLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CymbolParser parser = new CymbolParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.file();

        viewTree(tree, parser);

        ParseTreeWalker walker = new ParseTreeWalker();
        FunctionListener collector = new FunctionListener();
        walker.walk(collector, tree);
//        System.out.println("Nodes: " + collector.graph.nodes.toString() + "\nEdges: " + collector.graph.edges.toString() + "\n");
//        System.out.println(collector.graph.toDOT());
        writeFile(collector.graph.toDOT(),"newDot");

    }

    private static void writeFile(String s, String filename) throws IOException {
        BufferedWriter writer = null;
        File file = new File(filename + ".txt");
        writer = new BufferedWriter( new FileWriter(file));
        writer.write(s);
        if ( writer != null) writer.close( );
    }

    private static void viewTree(ParseTree tree, CymbolParser parser) {
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
