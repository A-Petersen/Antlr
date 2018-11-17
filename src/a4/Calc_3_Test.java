package a4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Calc_3_Test {

    public static String calc_1[] = {"X:\\IntellijProjects\\Antlr\\src\\a4\\input.txt"};

    @Test
    public void testCalc() throws Exception {
        Calc_3.main(calc_1);
        assertEquals(24, Calc_3.testInt);
        assertEquals(12, Calc_3.test("6+12/2\n"));
        assertEquals(9, Calc_3.test("(6+12)/2\n"));
    }
}