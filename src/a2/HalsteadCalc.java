package a2;

import map.Map;
import multiMenge.Multiset;
import org.antlr.v4.runtime.Token;

import java.util.HashMap;

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
    private Multiset<String> operators = multiSet();
    private Multiset<String> operands = multiSet();
    private java.util.Map<String, Integer> all = new HashMap<>();

    HalsteadCalc(HalsteadLexer hsLex)
    {
        Token t;
        do {
            t = hsLex.nextToken();
            if (t.getType() == 1)
            {
                operands = operands.insert(t.getText());
                all.put(t.getText(), operands.getMap().get(t.getText()));
            }
            if (t.getType() == 2)
            {
                operators = operators.insert(t.getText());
                all.put(t.getText(), operators.getMap().get(t.getText()));
            }
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

    public Multiset<String> getOperands() {
        return operands;
    }

    public Multiset<String> getOperators() {
        return operators;
    }

    public java.util.Map<String, Integer> getAll() {
        return all;
    }
}
