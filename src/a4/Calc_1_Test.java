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
        assertEquals(5, Calc_1.test("a=2\nb=3\na+b\n"));
        assertEquals(256, Calc_1.test("a=2\nb=2\nc=3\na^b^c\n"));
        assertEquals(8, Calc_1.test("a=2\nb=2\nc=2\na^b*c\n"));
        assertEquals(1, Calc_1.test("a=3\nb=5\nc=2\na<b^c\n"));
        assertEquals(0, Calc_1.test("a=2\nb=8\nc=300\na^b>c\n"));
        assertEquals(9, Calc_1.test("a=2\na+7\n"));
        assertEquals(0, Calc_1.test("a=3\nb=5\nc=2\nclear\na\n"));
        assertEquals(5, Calc_1.test("a=3\nb=5\nc=2\na==3?b:c\n"));
        assertEquals(2, Calc_1.test("a=3\nb=5\nc=2\na==2?b:c\n"));
    }
}