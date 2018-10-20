package a2;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.stringtemplate.v4.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TestRig_2 {
    private static String dataPath = "X:\\IntellijProjects\\Antlr\\c_data";
    private static String testResultPath = "X:\\IntellijProjects\\Antlr\\resultsHalstead\\";

    public static void main(String[] args) throws Exception {
        List<String> fileList = new ArrayList<>();
        File[] files = new File(dataPath).listFiles();
        for (File file : files) {
            if (file.isFile()) {
                fileList.add(file.getName());
            }
        }

        CharStream input;
        for (String s : fileList)
        {
            input = new ANTLRFileStream(dataPath + "\\" + s);
            Halstead lex = new Halstead(input);
            HalsteadCalc calcLex = new HalsteadCalc(lex);
            writeTest(calcLex, s.substring(0, s.length() - 2) + "_Halstead");
        }
    }

    private static void writeFile(String s, String filename) throws IOException {
        BufferedWriter writer = null;
        File file = new File(testResultPath + filename + ".txt");
        writer = new BufferedWriter( new FileWriter(file));
        writer.write(s);
        if ( writer != null) writer.close( );
    }

    private static void writeTest(HalsteadCalc hC, String filename) throws IOException {
        STGroup stG = new STGroupFile("a2/stringTemplateHalstead.stg");
        ST opFormat = stG.getInstanceOf("opFormat");
        opFormat.add("operands", hC.getAllOperands());
        opFormat.add("operators", hC.getAllOperators());

        ST halsteadPara = stG.getInstanceOf("halsteadPara");
        halsteadPara.add("aOperators", hC.getAmountOperators());
        halsteadPara.add("aOperands", hC.getAmountOperands());
        halsteadPara.add("aUniqueOperators", hC.getUniqueOperators());
        halsteadPara.add("aUniqueOperands", hC.getUniqueOperands());

        ST halsteadMetric = stG.getInstanceOf("HalsteadMetric");
        halsteadMetric.add("len", hC.getLength());
        halsteadMetric.add("vocab", hC.getVocabulary());
        halsteadMetric.add("volume", hC.getVolume());
        halsteadMetric.add("difficulty", hC.getDifficulty());
        halsteadMetric.add("effort", hC.getEffort());

        String s = (opFormat.render() + halsteadPara.render() + halsteadMetric.render());
        writeFile(s, filename);
    }

}
