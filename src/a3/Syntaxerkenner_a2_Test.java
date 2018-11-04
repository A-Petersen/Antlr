package a3;

import org.junit.Test;

import static org.junit.Assert.*;

public class Syntaxerkenner_a2_Test {

    public static String calc_1[] = {"X:\\IntellijProjects\\Antlr\\src\\a3\\input.txt"};
    public static String calcTree_1 = "(prog (stat (decl (comp (expr (term (pow (fact 10)) * (pow (fact 2)) / (pow (fact 2))) + (term (pow (fact 4)))))) <missing NL>))";
    public static String calc_2[] = {"X:\\IntellijProjects\\Antlr\\src\\a3\\inputFak.txt"};
    public static String calcTree_2 = "(prog (stat (decl aBc = (comp (expr (term (pow (fact 1) ^ (fact 2) ^ (fact 3))) + (term (pow (fact 1)) * (pow (fact 2)) / (pow (fact ( (decl (comp (expr (term (pow (fact 3)) * (pow (fact ( (decl (comp (expr (term (pow (fact 1))) + (term (pow (fact 2)))))) ))))))) ))))) < (expr (term (pow (fact 3)))))) <missing NL>))";


    @Test
    public void testSyntax() throws Exception {
        Syntaxerkenner_a2_.main(calc_1);
        assertTrue(calcTree_1.equals(Syntaxerkenner_a2_.testString));
    }

    @Test
    public void testSyntax2() throws Exception {
        Syntaxerkenner_a2_.main(calc_2);
        assertTrue(calcTree_2.equals(Syntaxerkenner_a2_.testString));
    }

}