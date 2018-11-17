package a4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Calc_3_Test {

    public static String calc_1[] = {"X:\\IntellijProjects\\Antlr\\src\\a4\\input.txt"};

    @Test
    public void testCalc() throws Exception {
        Calc_3.main(calc_1);
        assertEquals(24, Calc_3.testInt);
        assertEquals(12, Calc_3.test("6+12/2\n"));
        assertEquals(9, Calc_3.test("(6+12)/2\n"));
        assertEquals(2, Calc_3.test("a=2\n"));
        assertEquals(3, Calc_3.test("a=2\nb=3\n"));
        assertEquals(5, Calc_3.test("a=2\nb=3\na+b\n"));
        assertEquals(256, Calc_3.test("a=2\nb=2\nc=3\na^b^c\n"));
        assertEquals(8, Calc_3.test("a=2\nb=2\nc=2\na^b*c\n"));
        assertEquals(1, Calc_3.test("a=3\nb=5\nc=2\na<b^c\n"));
        assertEquals(0, Calc_3.test("a=2\nb=8\nc=300\na^b>c\n"));
        assertEquals(9, Calc_3.test("a=2\na+7\n"));
        assertEquals(0, Calc_3.test("a=3\nb=5\nc=2\nclear\na\n"));
        assertEquals(5, Calc_3.test("a=3\nb=5\nc=2\na==3?b:c\n"));
        assertEquals(2, Calc_3.test("a=3\nb=5\nc=2\na==2?b:c\n"));
        assertEquals(4, Calc_3.test("a=3\nb=5\nc=2\nif (a == 3){ b-1 }else { 5*c }\n"));
        assertEquals(10, Calc_3.test("a=3\nb=5\nc=2\nif (a == 1) { b - 1 } else { 5*c }\n"));
    }
}