package list;
import static list.List.*;

import org.junit.*;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by n0ld on 14.05.2017.
 */
public class ListTest {

    List<Integer> list = list();
    List<Integer> list2 = list(1,2);

    int x = 1;

    //isEmpty(empty) = true
    @Test
    public void isEmptyEmpty() {
//        List<Integer> list = list();
        assertTrue(list.isEmpty());
    }

    //isEmpty(cons(x,l)) = false
    @Test
    public void isEmptyCons() {
//        List<Integer> list = list();
        assertFalse(list.cons(1).isEmpty());
    }

    //elem(x,empty) = false
    @Test
    public void elemEmpty() {
        assertFalse(list.elem(x));
    }

    //elem(x,cons(x,l)) = true
    @Test
    public void elemCons() {
        assertTrue(list.cons(x).elem(x));
    }

    //head(cons(x,l)) = x
    @Test
    public void headCons() {
        assertTrue(list.cons(x).head() == x);
    }

    //tail(cons(x,l)) = l
    @Test
    public void tailCons() {
        assertTrue(list.cons(x).tail().equals(list));
    }

    //length(empty) = 0
    @Test
    public void lengthEmpty() {
        assertTrue(list.length() == 0);
    }

    //length(cons(x,l)) = length(l)+1
    @Test
    public void lengthCons() {
        assertTrue(list.cons(x).length() == list.length() + 1);
    }

    //length(tail(l)) = length(l) – 1 , falls l nicht leer
    @Test
    public void lengthTail() {
        assertTrue(list2.tail().length() == list2.length() - 1);
    }
}