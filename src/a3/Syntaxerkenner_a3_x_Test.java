package a3;

import org.junit.Test;

import static org.junit.Assert.*;

public class Syntaxerkenner_a3_x_Test {

    public static String calc_1[] = {"X:\\IntellijProjects\\Antlr\\src\\a3\\input.txt"};
    public static String calcTree_1 = "(expr (expr (expr (expr 10) * (expr 2)) / (expr 2)) + (expr 4))";
    public static String calc_2[] = {"X:\\IntellijProjects\\Antlr\\src\\a3\\inputFak.txt"};
    public static String calcTree_2 = "(expr aBc = (expr (expr (expr (expr 1) ^ (expr (expr 2) ^ (expr 3))) + (expr (expr (expr 1) * (expr 2)) / (expr ( (expr (expr 3) * (expr ( (expr (expr 1) + (expr 2)) ))) )))) < (expr 3)))";

    @Test
    public void testSyntax() throws Exception {
        Syntaxerkenner_a3_x_.main(calc_1);
        assertTrue(calcTree_1.equals(Syntaxerkenner_a3_x_.testString));
    }

    @Test
    public void testSyntax2() throws Exception {
        Syntaxerkenner_a3_x_.main(calc_2);
        assertTrue(calcTree_2.equals(Syntaxerkenner_a3_x_.testString));
    }
}