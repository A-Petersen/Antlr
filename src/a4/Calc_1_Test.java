package a4;

import a3.Syntaxerkenner_a1_;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Calc_1_Test {

    public static String calc_1[] = {"X:\\IntellijProjects\\Antlr\\src\\a4\\input.txt"};

    @Test
    public void testCalc() throws Exception {
        Calc_1.main(calc_1);
        assertEquals(24, Calc_1.testInt);
        assertEquals(12, Calc_1.test("6+12/2\n"));
        assertEquals(9, Calc_1.test("(6+12)/2\n"));
    }
}