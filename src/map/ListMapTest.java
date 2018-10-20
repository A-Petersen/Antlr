package map;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

import map.Map.*;
import static map.ListMap.*;

/**
 * Created by n0ld on 17.06.2017.
 */
@RunWith(Theories.class)
public class ListMapTest {

    @DataPoint public static Map<Integer, String> a = map();
//    @DataPoint public static Map<Integer, String> b = map();

    @DataPoint public static int i1 = 1;
    @DataPoint public static int i2 = 2;
    @DataPoint public static String s1 = "abc";
    @DataPoint public static String s2 = "def";

//    @Theory
//    public void test(Map<Integer, String> m, int i, String s) {
//        m = m.put(i, s);
//    }

    //isEmpty(empty) = true
    @Theory
    public void isEmpty(Map<Integer, String> m) {
        assertTrue(m.isEmpty());
    }

    //isEmpty(put(m,k,v)) = false
    @Theory
    public void isEmptyPut(Map<Integer, String> m, int i, String s) {
        m = m.put(i, s);
        assertTrue(!m.isEmpty());
    }

    //contains(empty,k) = false
    @Theory
    public void containsEmpty(Map<Integer, String> m, int i) {
        assertFalse(m.contains(i));
    }

    //contains(put(m,k1,v),k2) = k1==k2 ? true : contains(m,k2)
    @Theory
    public void containsPut(Map<Integer, String> m, int i1, int i2, String s1) {
        assertTrue(i1 == i2 ? m.put(i1, s1).contains(i2) == true : m.put(i1, s1).contains(i2) == m.contains(i2));
    }

    //contains(remove(m,k1),k2) = k1==k2 ? false : contains(m,k2)
    @Theory
    public void containsRemove(Map<Integer, String> m, int i1, int i2, String s1) {
        m = m.put(i1, s1);
        m = m.put(i2, s1);
        assertTrue(i1 == i2 ? m.remove(i1).contains(i2) == false : m.remove(i1).contains(i2) == m.contains(i2));
    }

    //put(put(m,k1,v),k2,v) = put(put(m,k2,v),k1,v)
    @Theory
    public void putPut(Map<Integer, String> m, int i1, int i2, String s1) {
        assertTrue(m.put(i1, s1).put(i2, s1).isEqualTo(m.put(i2,s1).put(i1, s1)));
    }

    //put(put(m,k,v1),k,v2) = put(m,k,v2)
    @Theory
    public void putPut2(Map<Integer, String> m, int i1, String s1, String s2) {
        assertTrue(m.put(i1, s1).put(i1, s2).isEqualTo(m.put(i1, s2)));
    }

    //remove(put(m,k1,v),k2) = k1==k2 ? remove(m,k2) : put(remove(m,k2),k1,v)
    @Theory
    public void removePut(Map<Integer, String> m, int i1, int i2, String s1) {
        assertTrue(i1 == i2 ? m.put(i1, s1).remove(i2).isEqualTo(m.remove(i2)) : m.put(i1, s1).remove(i2).isEqualTo(m.remove(i2).put(i1, s1)));
    }

    //get(put(m,k1,v),k2) = k1==k2 ? v : get(m,k2)
    @Theory
    public void getPut(Map<Integer, String> m, int i1, int i2, String s1) {
        assertTrue(i1 == i2 ? m.put(i1,s1).get(i2).equals(s1) : m.put(i1,s1).get(i2) == m.get(i2));
    }

    //get(remove(m,k1),k2) = k1==k2 ? null : get(m, k2)
    @Theory
    public void getRemove(Map<Integer, String> m, int i1, int i2) {
        assertTrue(i1 == i2 ? m.remove(i1).get(i2) == null : m.remove(i1).get(i2) == m.get(i2));
        assertTrue(m.remove(i1).get(i2) == (i1 == i2 ? null : m.get(i2)));
    }

}