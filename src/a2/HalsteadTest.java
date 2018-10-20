package a2;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CharStream;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import java.io.IOException;

import static org.junit.Assert.assertTrue;

@RunWith(Theories.class)
public class HalsteadTest {

    @DataPoint public static CharStream input;
    static {
        try {
            input = new ANTLRFileStream("c_data/ggt1.c");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @DataPoint public static HalsteadLexer lex = new HalsteadLexer(input);
    @DataPoint public static HalsteadCalc testCalc = new HalsteadCalc(lex);

    @Theory
    public void claculations(HalsteadCalc testCalc) {
        assertTrue(testCalc.getAmountOperands() == 17);
    }

}
