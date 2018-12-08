package a6;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.MultiMap;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import java.io.*;
import java.util.*;

public class CSVLoader extends CSVBaseListener {
    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if ( args.length > 0 ) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile != null )
            is = new FileInputStream(inputFile);
        CSVLexer lexer = new CSVLexer( new ANTLRInputStream(is) );
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CSVParser parser = new CSVParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.file();

        ParseTreeWalker walker = new ParseTreeWalker();
        CSVLoader loader = new CSVLoader();
        walker.walk(loader, tree);
        System.out.println(loader.table);
        loader.fillEdgesNodes();
        writeFile(loader.toDOT(),"newDot_CSV");
    }

    Set<String> nodes = new HashSet<>();
    MultiMap<String, String> edges = new MultiMap<String, String>();
    HashMap<String[], HashMap<String, String>> table = new HashMap<>();
    List<String> headerList;
    List<String> currentRow;

    @Override
    public void exitHdr(CSVParser.HdrContext ctx) {
        headerList = new ArrayList<>();
        headerList.addAll(currentRow);
    }

    @Override
    public void enterRow(CSVParser.RowContext ctx) {
        currentRow = new ArrayList<>();
    }

    @Override
    public void exitRow(CSVParser.RowContext ctx) {
        if ( ctx.getParent().getRuleIndex() == CSVParser.RULE_hdr ) return;
        HashMap<String, String> headerMap = new HashMap<>();
        int i = 0;
        String[] state = {"",""};
        for (String v : currentRow) {
            if (v.contains("_start")) {
                state[1] = "_start";
                v = v.replace("_start", "");
            } else if (v.contains("_end")) {
                state[1] = "_end";
                v = v.replace("_end", "");
            }
            if (i == 0) {
                state[0] = v;
                headerList.forEach(x -> headerMap.put(x, ""));
                table.put(state, headerMap);
            }
            else {
                headerMap.put(headerList.get(i), v.equals("") ? "\u03A9" : v);
                table.put(state, headerMap);
            }
            i++;
        }
    }

    @Override
    public void exitText(CSVParser.TextContext ctx) {
        currentRow.add(ctx.TEXT().getText());
    }

    @Override
    public void exitString(CSVParser.StringContext ctx) {
        currentRow.add(ctx.STRING().getText());
    }

    @Override
    public void exitEmpty(CSVParser.EmptyContext ctx) {
        currentRow.add("");
    }

    public void fillEdgesNodes() {
        nodes.add("\u03A9[fontsize=16]");

        table.keySet().forEach(x -> {
            if (x[1].contains("_start")) nodes.add(x[0] + "[style=filled, fillcolor=green]");
            else if (x[1].contains("_end")) nodes.add(x[0] + "[style=filled, fillcolor=red, shape=doublecircle]");
            else nodes.add(x[0]);
        });

        table.entrySet().forEach(x ->
                {
                    if (!x.getKey()[0].equals("")) {
                        x.getValue()
                            .entrySet()
                            .forEach(y -> {
                                if (!y.getKey().equals("") && !y.getValue().equals("")) {
                                    edges.map(x.getKey()[0], y.getValue() + "[label=\"" + y.getKey() + "\"]" );
                                }
//                                else if (!y.getKey().equals("") && y.getValue().equals("")) {
//                                    edges.map(x.getKey()[0], "\u03A9" + "[label=\"" + y.getKey() + "\"]" );
//                                }
                            });

                    }
                }
            );
        System.out.println(nodes);
        System.out.println(edges);
    }

    @SuppressWarnings("Duplicates")
    public String toDOT() throws IOException {

        STGroup stG = new STGroupFile("a5/stringTemplateDOT.stg");
        ST newDot = stG.getInstanceOf("DOT");
        newDot.add("ranksep", .25);
        newDot.add("arrowsize", .5);
        newDot.add("margin", 0);
        newDot.add("fontcolor", "blue");
        newDot.add("fontsize", 32);
        newDot.add("width", 0.5);
        newDot.add("shape", "circle");
        newDot.add("style", "filled");
        newDot.add("nodes", nodes);
        newDot.add("edges", edges);

        return newDot.render();
    }

    private static void writeFile(String s, String filename) throws IOException {
        BufferedWriter writer = null;
        File file = new File(filename + ".txt");
        writer = new BufferedWriter( new FileWriter(file));
        writer.write(s);
        if ( writer != null) writer.close( );
    }
}
