package a2;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.junit.Test;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(Theories.class)
public class HalsteadTest {

    @DataPoint public static String path = "c_data/eval1.c";
    @DataPoint public static String path1 = "c_data/extract.c";
    @DataPoint public static String path2 = "c_data/main.c";
    @DataPoint public static String path3 = "c_data/Beispiel.c";

    @Test
    public void claculations() throws IOException {
        HalsteadCalc testCalc = testCalc(path);
        assertTrue(testCalc.getAmountOperands() == 122);
        assertTrue(testCalc.getAmountOperators() == 157);
        assertTrue(testCalc.getUniqueOperands() == 30);
        assertTrue(testCalc.getUniqueOperators() == 22);
        assertTrue(testCalc.getLength() == 279);
        assertTrue(testCalc.getVocabulary() == 52);
        assertEquals(testCalc.getDifficulty(), 44.733, 0.001);
        assertEquals(testCalc.getEffort(), 71144.908, 0.001);
        assertEquals(testCalc.getVolume(), 1590.423, 0.001);
    }

    @Test
    public void claculations1() throws IOException {
        HalsteadCalc testCalc = testCalc(path1);
        assertTrue(testCalc.getAmountOperands() == 26);
        assertTrue(testCalc.getAmountOperators() == 29);
        assertTrue(testCalc.getUniqueOperands() == 11);
        assertTrue(testCalc.getUniqueOperators() == 10);
        assertTrue(testCalc.getLength() == 55);
        assertTrue(testCalc.getVocabulary() == 21);
        assertEquals(testCalc.getDifficulty(), 11.818, 0.001);
        assertEquals(testCalc.getEffort(), 2855.006, 0.001);
        assertEquals(testCalc.getVolume(), 241.577, 0.001);
    }

    @Test
    public void claculations2() throws IOException {
        HalsteadCalc testCalc = testCalc(path2);
        assertTrue(testCalc.getAmountOperands() == 19);
        assertTrue(testCalc.getAmountOperators() == 20);
        assertTrue(testCalc.getUniqueOperands() == 12);
        assertTrue(testCalc.getUniqueOperators() == 10);
        assertTrue(testCalc.getLength() == 39);
        assertTrue(testCalc.getVocabulary() == 22);
        assertEquals(testCalc.getDifficulty(), 7.917, 0.001);
        assertEquals(testCalc.getEffort(), 1376.850, 0.001);
        assertEquals(testCalc.getVolume(), 173.918, 0.001);
    }

    @Test
    public void claculations3() throws IOException {
        HalsteadCalc testCalc = testCalc(path3);
        assertTrue(testCalc.getAmountOperands() == 177);
        assertTrue(testCalc.getAmountOperators() == 213);
        assertTrue(testCalc.getUniqueOperands() == 43);
        assertTrue(testCalc.getUniqueOperators() == 25);
        assertTrue(testCalc.getLength() == 390);
        assertTrue(testCalc.getVocabulary() == 68);
        assertEquals(testCalc.getDifficulty(), 51.453, 0.001);
        assertEquals(testCalc.getEffort(), 122156.267, 0.001);
        assertEquals(testCalc.getVolume(), 2374.110, 0.001);
    }

    private HalsteadCalc testCalc(String path) throws IOException {
        CharStream input = new ANTLRFileStream(path);
        Halstead lex = new Halstead(input);
        return new HalsteadCalc(lex);
    }

}
