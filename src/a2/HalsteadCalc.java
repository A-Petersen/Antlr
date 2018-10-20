package a2;

import multiMenge.Multiset;
import org.antlr.v4.runtime.Token;

import static java.lang.Math.log;
import static multiMenge.ListMultiset.multiSet;

public class HalsteadCalc {
    private int uOperators;
    private int uOperands;
    private int aOperators;
    private int aOperands;
    private int vocabulary;
    private int length;
    private double volume;
    private double difficulty;
    private double effort;

    HalsteadCalc(HalsteadLexer hsLex)
    {
        Token t;
        Multiset<String> operators = multiSet();
        Multiset<String> operands = multiSet();
        do {
            t = hsLex.nextToken();
            if (t.getType() == 1) operands = operands.insert(t.getText());
            if (t.getType() == 2) operators = operators.insert(t.getText());
        } while ( t.getType()!= Token.EOF );

        uOperators = operators.distinct();
        uOperands = operands.distinct();
        aOperators = operators.size();
        aOperands = operands.size();
        vocabulary = uOperands + uOperators;
        length = aOperands + aOperators;
        volume = volume_V(vocabulary, length);
        difficulty = diff_D(aOperators, uOperands);
        effort = effort_E(volume, difficulty);
    }

    private double diff_D(int aOperators, int uOperands)
    {
        return (aOperators/2.0)*(uOperands/2.0);
    }

    private double volume_V(int vocab, int len)
    {
        return len*(log(vocab)/log(2));
    }

    private double effort_E(double volume, double diff)
    {
        return volume*diff;
    }

    public int getAmountOperands() {
        return aOperands;
    }

    public int getAmountOperators() {
        return aOperators;
    }

    public int getUniqueOperands() {
        return uOperands;
    }

    public int getUniqueOperators() {
        return uOperators;
    }

    public int getLength() {
        return length;
    }

    public int getVocabulary() {
        return vocabulary;
    }

    public double getEffort() {
        return effort;
    }

    public double getVolume() {
        return volume;
    }

    public double getDifficulty() {
        return difficulty;
    }
}
