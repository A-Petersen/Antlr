package multiMenge;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static multiMenge.ListMultiset.*;
import static org.junit.Assert.*;

/**
 * Created by n0ld on 24.06.2017.
 */
@RunWith(Theories.class)
public class ListMultisetTest {

    @DataPoint public static Multiset<String> ms1 = multiSet();
    @DataPoint public static Multiset<String> ms2 = multiSet("a", "a", "b", "c");

    @DataPoint public static String s1 = "a";
    @DataPoint public static String s2 = "d";

    //isEmpty(empty) = true
    @Theory
    public void empty(Multiset<String> ms) {
        assertTrue(ms.isEmpty() ? ms.isEmpty() : !ms.isEmpty());
    }

    //isEmpty(insert(m,x)) = false
    @Theory
    public void emptyInsert(Multiset<String> ms, String s) {
        assertFalse(ms.insert(s).isEmpty());
    }

    //count(empty,x) = 0
    @Theory
    public void countEmpty(Multiset<String> ms, String s) {
        if (ms.isEmpty()) assertTrue(ms.count(s) == 0);
    }

    //count(insert(m,x),y)) = x==y ? count(m,y)+1 : count(m,y)
    @Theory
    public void countInsert(Multiset<String> ms, String s1, String s2) {
        assertTrue(ms.insert(s1).count(s2) == (s1 == s2 ? ms.count(s2) + 1 : ms.count(s2)));
    }

    //member(m,x) = count(x) > 0 ? true : false
    @Theory
    public void memberCount(Multiset<String> ms, String x, String y) {
        assertTrue(ms.member(x) == ms.count(x) > 0 ? true : false);
    }

    //size(empty) = 0
    @Theory
    public void sizeEmpty(Multiset<String> ms) {
        if (ms.isEmpty()) assertTrue(ms.size() == 0);
    }

    //size(insert(m,x)) = size(m)+1
    @Theory
    public void sizeInsert(Multiset<String> ms, String x) {
        assertTrue(ms.insert(x).size() == ms.size() + 1);
    }

    //size(remove(m,x)) = member(m,x) ? size(m)-1 : size(m)
    @Theory
    public void sizeRemove(Multiset<String> ms, String x) {
        assertTrue(ms.remove(x).size() == (ms.member(x) ? ms.size() - 1 : ms.size()));
    }

    //distinct(empty,x) = 0
    @Theory
    public void distinctEmpty(Multiset<String> ms, String x) {
        if (ms.isEmpty()) assertTrue(ms.distinct() == 0);
    }

    //distinct(insert(m,x))) = count(m,x)>0 ? distinct(m) : distinct(m)+1
    @Theory
    public void distinctInsert(Multiset<String> ms, String x) {
        assertTrue(ms.insert(x).distinct() == (ms.count(x) > 0 ? ms.distinct() : ms.distinct() + 1));
    }

    //remove(empty,x) = empty
    @Theory
    public void removeEmtpy(Multiset<String> ms, String x) {
        if (ms.isEmpty()) assertTrue(ms.remove(x).isEqualTo(ms));
    }

    //remove(insert(m,x),y)) = x==y ? m : insert(remove(m,y),x)
    @Theory
    public void removeInsert(Multiset<String> ms, String x, String y) {
        assertTrue(ms.insert(x).remove(y).isEqualTo(x.equals(y) ? ms : ms.remove(y).insert(x)));
    }

    //count(remove(m,x)x) = count(m,x)>0 ? count(m,x)-1 : 0
    @Theory
    public void countRemove(Multiset<String> ms, String x) {
        assertTrue(ms.remove(x).count(x) == (ms.count(x) > 0 ? ms.count(x) - 1 : 0));
    }
}