package a4;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Calc_2_Test {

    @Test
    public void testCalc() throws Exception {
        assertEquals(12, Calc_2.test("6+12/2\nend\n"));
        assertEquals(9, Calc_2.test("(6+12)/2\nend\n"));
        assertEquals(3, Calc_2.test("a=2\nb=3\nend\n"));
        assertEquals(5, Calc_2.test("a=2\nb=3\na+b\nend\n"));
        assertEquals(256, Calc_2.test("a=2\nb=2\nc=3\na^b^c\nend\n"));
        assertEquals(8, Calc_2.test("a=2\nb=2\nc=2\na^b*c\nend\n"));
        assertEquals(1, Calc_2.test("a=3\nb=5\nc=2\na<b^c\nend\n"));
        assertEquals(0, Calc_2.test("a=2\nb=8\nc=300\na^b>c\nend\n"));
        assertEquals(9, Calc_2.test("a=2\na+7\nend\n"));
        assertEquals(0, Calc_2.test("a=3\nb=5\nc=2\nclear\na\nend\n"));
        assertEquals(5, Calc_2.test("a=3\nb=5\nc=2\na==3?b:c\nend\n"));
        assertEquals(2, Calc_2.test("a=3\nb=5\nc=2\na==2?b:c\nend\n"));
    }
}