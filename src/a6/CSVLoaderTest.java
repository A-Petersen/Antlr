package a6;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.theories.DataPoint;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;


public class CSVLoaderTest {

    private static String sucess = "Sucess";
    private static String error = "Error";

    @DataPoint
    public static List<String> A1_Sucess = Arrays.asList("1", "1", "0", "0");
    @DataPoint
    public static List<String> A1_Omega = Arrays.asList("1", "1", "0", "0", "1");
    @DataPoint
    public static List<String> A1_Error = Arrays.asList("1", "0");

    @Test
    public void csvTest_1() throws Exception {
        InputStream is = new FileInputStream("X:\\IntellijProjects\\Antlr\\src\\a6\\automat_A1.csv");
        CSVLexer lexer = new CSVLexer( new ANTLRInputStream(is) );
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CSVParser parser = new CSVParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.file();

        ParseTreeWalker walker = new ParseTreeWalker();
        CSVLoader loader = new CSVLoader();
        walker.walk(loader, tree);

        LexAnalysator lexAnalysator = new LexAnalysator();
        String result = lexAnalysator.automat(A1_Sucess, loader.table);

        String result1 = lexAnalysator.automat(A1_Omega, loader.table);

        String result2 = lexAnalysator.automat(A1_Error, loader.table);

        Assert.assertEquals(result, sucess);
        Assert.assertEquals(result1, error);
        Assert.assertEquals(result2, error);
    }

    @DataPoint
    public static List<String> A2_Sucess = Arrays.asList("a", "b", "b");
    @DataPoint
    public static List<String> A2_Omega = Arrays.asList("b", "b", "a", "b", "a");
    @DataPoint
    public static List<String> A2_Error = Arrays.asList("b", "a", "b", "b");

    @Test
    public void csvTest_2() throws Exception {
        InputStream is = new FileInputStream("X:\\IntellijProjects\\Antlr\\src\\a6\\automat_test.csv");
        CSVLexer lexer = new CSVLexer( new ANTLRInputStream(is) );
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CSVParser parser = new CSVParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.file();

        ParseTreeWalker walker = new ParseTreeWalker();
        CSVLoader loader = new CSVLoader();
        walker.walk(loader, tree);

        LexAnalysator lexAnalysator = new LexAnalysator();
        String result = lexAnalysator.automat(A2_Sucess, loader.table);

        String result1 = lexAnalysator.automat(A2_Omega, loader.table);

        String result2 = lexAnalysator.automat(A2_Error, loader.table);

        Assert.assertEquals(result, sucess);
        Assert.assertEquals(result1, error);
        Assert.assertEquals(result2, error);
    }
}