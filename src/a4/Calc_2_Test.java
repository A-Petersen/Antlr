package a4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Calc_2_Test {

    @Test
    public void testCalc() throws Exception {
        assertEquals(12, Calc_2.test("6+12/2\nend\n"));
        assertEquals(9, Calc_2.test("(6+12)/2\nend\n"));
        assertEquals(3, Calc_2.test("a=2\nb=3\nend\n"));
        assertEquals(5, Calc_3.test("a=2\nb=3\na+b\n"));
        assertEquals(256, Calc_3.test("a=2\nb=2\nc=3\na^b^c\n"));
        assertEquals(8, Calc_3.test("a=2\nb=2\nc=2\na^b*c\n"));
        assertEquals(1, Calc_3.test("a=3\nb=5\nc=2\na<b^c\n"));
        assertEquals(0, Calc_3.test("a=2\nb=8\nc=300\na^b>c\n"));
        assertEquals(9, Calc_3.test("a=2\na+7\n"));
        assertEquals(0, Calc_3.test("a=3\nb=5\nc=2\nclear\na\n"));
        assertEquals(5, Calc_3.test("a=3\nb=5\nc=2\na==3?b:c\n"));
        assertEquals(2, Calc_3.test("a=3\nb=5\nc=2\na==2?b:c\n"));
    }
}