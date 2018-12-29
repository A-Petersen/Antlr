package a7;

import a7.StackInterp.Interpreter;
import org.junit.Test;

public class MyListenerTest {

    private static String[] interpArgs = {"-trace", "-dis", "-dump", "currentPcode.pcode"};

    @Test
    public void condExpr() throws Exception {
        String[] args = {"X:\\IntellijProjects\\Antlr\\src\\a7\\testClobalFiles\\condExpr.clobal"};
        TestRig.main(args);
        Interpreter.main(interpArgs);
    }

    @Test
    public void for_() throws Exception {
        String[] args = {"X:\\IntellijProjects\\Antlr\\src\\a7\\testClobalFiles\\for.clobal"};
        TestRig.main(args);
        Interpreter.main(interpArgs);
    }

    @Test
    public void forTwice() throws Exception {
        String[] args = {"X:\\IntellijProjects\\Antlr\\src\\a7\\testClobalFiles\\forTwice.clobal"};
        TestRig.main(args);
        Interpreter.main(interpArgs);
    }

    @Test
    public void funcCall() throws Exception {
        String[] args = {"X:\\IntellijProjects\\Antlr\\src\\a7\\testClobalFiles\\funcCall.clobal"};
        TestRig.main(args);
        Interpreter.main(interpArgs);
    }

    @Test
    public void ifElse() throws Exception {
        String[] args = {"X:\\IntellijProjects\\Antlr\\src\\a7\\testClobalFiles\\ifElse.clobal"};
        TestRig.main(args);
        Interpreter.main(interpArgs);
    }

    @Test
    public void ifgt() throws Exception {
        String[] args = {"X:\\IntellijProjects\\Antlr\\src\\a7\\testClobalFiles\\ifgt.clobal"};
        TestRig.main(args);
        Interpreter.main(interpArgs);
    }

    @Test
    public void iflt() throws Exception {
        String[] args = {"X:\\IntellijProjects\\Antlr\\src\\a7\\testClobalFiles\\iflt.clobal"};
        TestRig.main(args);
        Interpreter.main(interpArgs);
    }

    @Test
    public void neq() throws Exception {
        String[] args = {"X:\\IntellijProjects\\Antlr\\src\\a7\\testClobalFiles\\neq.clobal"};
        TestRig.main(args);
        Interpreter.main(interpArgs);
    }

    @Test
    public void not() throws Exception {
        String[] args = {"X:\\IntellijProjects\\Antlr\\src\\a7\\testClobalFiles\\not.clobal"};
        TestRig.main(args);
        Interpreter.main(interpArgs);
    }

    @Test
    public void printf() throws Exception {
        String[] args = {"X:\\IntellijProjects\\Antlr\\src\\a7\\testClobalFiles\\printf.clobal"};
        TestRig.main(args);
        Interpreter.main(interpArgs);
    }

    @Test
    public void uminus() throws Exception {
        String[] args = {"X:\\IntellijProjects\\Antlr\\src\\a7\\testClobalFiles\\uminus.clobal"};
        TestRig.main(args);
        Interpreter.main(interpArgs);
    }

}