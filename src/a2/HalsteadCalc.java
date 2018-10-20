package a2;

import map.Map;
import multiMenge.Multiset;
import org.antlr.v4.runtime.Token;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

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
    private java.util.Map<String, Integer> allOperators = new HashMap<>();
    private java.util.Map<String, Integer> allOperands = new HashMap<>();

    HalsteadCalc(Halstead hsLex)
    {
        Token t;
        do {
            t = hsLex.nextToken();
            if (t.getType() == 2)
            {
                String tokenText = t.getText();
                operands = operands.insert(tokenText);
                allOperands.put(tokenText, operands.getMap().get(tokenText));
            }
            if (t.getType() == 1)
            {
                operators = operators.insert(t.getText());
                allOperators.put(t.getText(), operators.getMap().get(t.getText()));
            }
        } while ( t.getType()!= Token.EOF );



        uOperators = operators.distinct();
        uOperands = operands.distinct();
        aOperators = operators.size();
        aOperands = operands.size();
        vocabulary = uOperands + uOperators;
        length = aOperands + aOperators;
        volume = volume_V(vocabulary, length);
        difficulty = diff_D(uOperators, uOperands, aOperands);
        effort = effort_E(volume, difficulty);
    }

    private double diff_D(int n1, int n2, int N2)
    {
        return ((double)n1/2.0)*((double)N2/(double)n2);
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

    public java.util.Map<String, Integer> getAllOperands() {
        return allOperands;
    }

    public java.util.Map<String, Integer> getAllOperators() {
        return allOperators;
    }
}
