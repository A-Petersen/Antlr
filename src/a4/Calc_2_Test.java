package a4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Calc_2_Test {

    public static String calc_1[] = {"X:\\IntellijProjects\\Antlr\\src\\a4\\input.txt"};

    @Test
    public void testCalc() throws Exception {
        Calc_2.main(calc_1);
        assertEquals(24, Calc_2.testInt);
        assertEquals(12, Calc_2.test("6+12/2\n"));
        assertEquals(9, Calc_2.test("(6+12)/2\n"));
    }
}