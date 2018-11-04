package a3;

import org.junit.Test;

import static org.junit.Assert.*;

public class Syntaxerkenner_a1_Test {

    public static String calc_1[] = {"X:\\IntellijProjects\\Antlr\\src\\a3\\input.txt"};
    public static String calcTree_1 = "(decl (comp (expr (expr (term (term (term (pow (fact 10))) * (pow (fact 2))) / (pow (fact 2)))) + (term (pow (fact 4))))))";
    public static String calc_2[] = {"X:\\IntellijProjects\\Antlr\\src\\a3\\inputFak.txt"};
    public static String calcTree_2 = "(decl aBc = (comp (comp (expr (expr (term (pow (fact 1) ^ (pow (fact 2) ^ (pow (fact 3)))))) + (term (term (term (pow (fact 1))) * (pow (fact 2))) / (pow (fact ( (decl (comp (expr (term (term (pow (fact 3))) * (pow (fact ( (decl (comp (expr (expr (term (pow (fact 1)))) + (term (pow (fact 2)))))) ))))))) )))))) < (expr (term (pow (fact 3))))))";

    @Test
    public void testSyntax() throws Exception {
        Syntaxerkenner_a1_.main(calc_1);
        assertTrue(calcTree_1.equals(Syntaxerkenner_a1_.testString));
    }

    @Test
    public void testSyntax2() throws Exception {
        Syntaxerkenner_a1_.main(calc_2);
        assertTrue(calcTree_2.equals(Syntaxerkenner_a1_.testString));
    }

}