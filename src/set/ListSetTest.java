package set;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static set.ListSet.*;
import static org.junit.Assert.*;

/**
 * Created by n0ld on 14.05.2017.
 */
@RunWith(Theories.class)
public class ListSetTest {

    @DataPoint public static Set<Integer> t1 = set();
    @DataPoint public static Set<Integer> t2 = set(1,2,3,4);

    @DataPoint public static int x1 = 1;
    @DataPoint public static int y1 = 2;
    @DataPoint public static int z1 = 2;

    int x = 1;
    int y = 2;

    //isEmpty(empty) = true
    @Test
    public void isEmptyEmpty() {
        Set<Integer> ls = set();
        assertTrue(ls.isEmpty());
    }

    //isEmpty(insert(s,x)) = false
    @Test
    public void isEmptyInsert() {
        Set<Integer> ls = set();
        assertFalse(ls.insert(x).isEmpty());
    }

    //member(empty,x) = false
    @Test
    public void memberEmpty() {
        Set<Integer> ls = set();
        assertFalse(ls.member(x));
    }

    //member(insert(s,x),y) = x==y ? true : member(s,y)
    @Test
    public void memberInsert() {
        Set<Integer> ls = set();
        assertFalse(ls.insert(x).member(y));
        assertTrue(ls.insert(x).member(x));
    }

    //member(remove(s,x),y) = x==y ? false : member(s,y)
    @Test
    public void memberRemove() {
        Set<Integer> ls2 = set();
        ls2 = ls2.insert(x);
        ls2 = ls2.insert(y);
        assertTrue(ls2.member(x) && x != y);
        assertTrue(ls2.remove(x).member(y));
        assertFalse(ls2.remove(x).member(x));
    }

    //size(empty) = 0
    @Test
    public void sizeEmpty() {
        Set<Integer> ls = set();
        assertTrue(ls.size() == 0);
    }

//    //size(insert(s,x)) = !member(s,x) ? size(s)+1 : size(s)
//    @Test
//    public void sizeInsert1() {
//        Set<Integer> ls3 = set();
//        Set<Integer> ls4 = set();
//        ls3 = ls3.insert(x);
//        ls4 = ls4.insert(x);
//        assertTrue(ls3.member(x) && ls4.member(x));
//        ls3 = ls3.insert(x);
//        assertTrue(ls3.size() == ls4.size());
//        ls3 = ls3.remove(x);
//        ls4 =  ls4.remove(x);
//        assertTrue(ls3.insert(x).size() == ls4.size() + 1);
//    }

    //size(insert(s,x)) = !member(s,x) ? size(s)+1 : size(s)
    @Theory
    public void sizeInsert(Set<Integer> s, int x) {
    assertTrue(!s.member(x) ? s.insert(x).size() == s.size() + 1 : s.insert(x).size() == s.size());
    }

//    //    insert(insert(s,x),y) = x==y ? insert(s,y) : insert(insert(s,y),x)
//    @Test
//    public void insertInsert1() {
//        Set<Integer> s = set();
//        Set<Integer> s1 = set();
//        s = s.insert(x).insert(y-1);
//        s1 = s1.insert(x);
//        assertTrue(s.isEqualTo(s1));
//        s = s.remove(x);
//        s1 = s1.remove(x);
//        assertTrue(s.isEmpty() && s1.isEmpty());
//        s.insert(x).insert(y);
//        s1.insert(y).insert(x);
//        assertTrue(s1.isEqualTo(s));
//    }

    //    insert(insert(s,x),y) = x==y ? insert(s,y) : insert(insert(s,y),x)
    @Theory
    public void insertInsert(Set<Integer> s, int x, int y) {
        assertTrue(x == y ? s.insert(x).insert(y).isEqualTo(s.insert(y)) : s.insert(x).insert(y).isEqualTo(s.insert(y).insert(x)));
    }

    //    remove(empty,x) = empty
    @Test
    public void empty() {
        Set<Integer> s1 = set();
        assertTrue(s1.remove(x).isEqualTo(s1));
    }

//    //    remove(insert(s,x),y) = x==y ? remove(s,y) : insert(remove(s,y),x)
//    @Test
//    public void removeInsert1() {
//        Set<Integer> s = set(2,3);
//        Set<Integer> s1 = set(3,2);
//        s = s.insert(x);
//        s = s.remove(y);
//        s1 = s1.remove(y);
//        s1 = s1.insert(x);
//        assertTrue(s.isEqualTo(s1));
//        s = s.insert(x+5);
//        s = s.remove(x+5);
//        s1 = s1.remove(x+5);
//        assertTrue(s.isEqualTo(s1));
//    }

    //    remove(insert(s,x),y) = x==y ? remove(s,y) : insert(remove(s,y),x)
    @Theory
    public void removeInsert(Set<Integer> s, int x, int y) {
        assertTrue(x == y ? s.insert(x).remove(y).isEqualTo(s.remove(y))
                        : s.insert(x).remove(y).isEqualTo(s.remove(y).insert(x)));
    }

    //    get(insert(s,x),y) = x==y ? x : get(s,y)
    @Theory
    public void getInsert(Set<Integer> s, int x, int y) {
        assertTrue(x == y ? s.insert(x).get(y) == x : s.insert(x).get(y) == s.get(y));
    }

    //    get(remove(s,x),y) = x==y ? null : get(s,y)
    @Theory
    public void
    getRemove(Set<Integer> s, int x, int y) {
        assertTrue(x == y ? s.remove(x).get(y) == null : s.remove(x).get(y) == s.get(y) );
    }
}