package a7;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.InputStream;

public class TestRig {
    public static void main(String[] args) throws Exception {
        String example = "int n;int i;int main() {  n = 1;  i = 4;  return 0;}";

        String inputFile = null;
        if ( args.length > 0 ) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile != null )
            is = new FileInputStream(inputFile);
        ClobalLexer lexer = new ClobalLexer( new ANTLRInputStream(example) );
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ClobalParser parser = new ClobalParser(tokens);

        parser.setBuildParseTree(true);
        ParseTree tree = parser.file();
        ParseTreeWalker walker = new ParseTreeWalker();
        MyListener loader = new MyListener();
        walker.walk(loader, tree);


    }
}
