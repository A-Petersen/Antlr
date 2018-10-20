package set;

import list.List;

import java.util.function.Function;

/**
 * Created by n0ld on 14.05.2017.
 */
public interface Set<A> {

    /**
     * Fügt ein Element in das Set ein. O(1)
     * @param a Element
     * @return Neues Set inkl. dem Element
     */
    Set<A> insert(A a);

    /**
     * Entfernt ein Element aus einem Set. O(n)
     * @param a zu entfernende Element
     * @return Neues Set exkl. dem Element
     */
    Set<A> remove(A a);

    /**
     * Boolean, ob das Element in dem Set exestiert. O(n)
     * @param a gesuchte Element
     * @return True, wenn es exestiert. False, wenn nicht.
     */
    boolean member(A a);

    /**
     * Gibt die Größe des Sets aus. O(n)
     * @return Größe des Sets
     */
    int size();

    /**
     * Boolean, ob das Set leer ist. O(1)
     * @return True, wenn leer. False, wenn nicht.
     */
    boolean isEmpty();

    /**
     * Gibt das Set als String aus. O(n)
     * @return String
     */
    String toString();

    /**
     * Gibt das gesuchte Element aus, sofern es in dem Set existiert. O(n)
     * @param a zu suchendes element
     * @return Das gesuchte element, oder "null" wenn es nicht in dem Set existiert.
     */
    A get(A a);

    /**
     * Testet, ob diese Menge Teilmenge der als Argument übergebenen Menge ist. O(n)
     * @param s übergebene Teilmenge
     * @return True, wenn es eine Teilmenge ist. Faalse, wenn nicht.
     */
    boolean isSubsetOf(Set<A> s);

    /**
     * Liefert true, wenn alle Elemente der Menge das Prädikat p erfüllen. O(n x m)
     * @param p Prädikat
     * @return True, wenn erfüllt. False, wenn nicht.
     */
    boolean forAll(Function<A, Boolean> p);

    /**
     * Testet, ob diese Menge gleich einer als Argument übergebenen Menge s ist. O(n)
     * @param s übergebene Menge
     * @return True, wenn erfüllt. False, wenn nicht.
     */
    boolean isEqualTo(Set<A> s);

    /**
     * Gibt das Set als List<A> aus. O(n)
     * @return Liste
     */
    List<A> toList();

//    A search(Function<A, Boolean> a);
//
//    A head();
}
