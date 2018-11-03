package a3;

import org.junit.Test;

import static org.junit.Assert.*;

public class Syntaxerkenner_a2_Test {

    public static String calc_1[] = {"X:\\IntellijProjects\\Antlr\\src\\a3\\A1_input.txt"};
    public static String calcTree_1 = "(expr (term (fact 10) * (fact 2) / (fact 2)) + (term (fact 4)))";

    @Test
    public void testSyntax() throws Exception {
        Syntaxerkenner_a2_.main(calc_1);
        assertTrue(calcTree_1.equals(Syntaxerkenner_a2_.testString));
    }

}