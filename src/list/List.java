package list;

import java.util.function.Function;

import Collection.collection;
import map.ListMap;
import map.Map;
import static map.ListMap.*;
import set.Set;
import static set.ListSet.*;
import tailCall.TailCall;
import tuple.Tuple;

import static tailCall.TailCall.Suspend.ret;
import static tailCall.TailCall.Suspend.sus;

/**
 * Created by n0ld on 13.05.2017.
 */
public abstract class List<A> {

    /**
     * Gibt den Kopf der Liste aus O(1)
     * @return Kopf der Liste
     */
    public abstract A head();

    /**
     * Gibt die Liste ohne Kopf aus O(1)
     * @return Liste ohne Kopf
     */
    public abstract List<A> tail();

    /**
     * Boolean, ob die Liste Leer ist. O(1)
     * @return True, wenn leer. False, wenn nicht.
     */
    public abstract boolean isEmpty();

    /**
     * Setzt den Kopf der Liste auf den eingegebenen Parameter. O(1)
     * @param a - Gewünschter Eintrag in den Kopf
     * @return Liste mit neuem Kopf
     */
    public abstract List<A> setHead (A a);

    /**
     * Gibt die Liste in einem String aus. O(n)
     * @return Liste als String.
     */
    public abstract String toString();

    /**
     * Dreht die Reihenfolge der Elemente in der Liste. O(n)
     * @return
     */
    public abstract List<A> reverse();

    /**
     * Gibt eine Liste ohne das letzte Element der Liste aus. O(n)
     * @return Liste ohne "SchwanzEnde"
     */
    public abstract List<A> init();

    /**
     * Verbindet zwei Listen miteinander. O(n)
     * @param l1 - Liste an die angehängt wird.
     * @param l2 - Liste die angehängt wird.
     * @return Zusammengefügte Liste
     */
    public abstract <A> List<A> concat (List<A> l1, List<A> l2);

    /**
     * Filtert eine Liste auf Basis einer Funktion. O(n)
     * @param f - Die beschreibende Filter-Funktion
     * @return Liste auf welche die Funktion angewendet wurde
     */
    public abstract List<A> filter (Function<A, Boolean> f);

    /**
     * Durchläuft die Liste und führt auf jedes Element eine beschriebene Funktion aus. O(n)
     * @param f - Funktion für jedes Element
     * @return neue Liste
     */
    public abstract <B> List<B> map (Function<A, B> f);

    /**
     * Gibt die Länge der Liste aus. O(n)
     * @return Länge der Liste
     */
    public abstract int length();

    /**
     * Bollean für das Zutreffen einer Funktion auf min. ein Element in der Liste. O(n)
     * @param f - Funktion
     * @return True, wenn zutreffend. False, wenn nicht.
     */
    public abstract boolean exists (Function<A, Boolean> f);

    /**
     * Boolean für das Zutreffen einer Funktion auf alle Elemente in einer Liste. O(n)
     * @param p - Funktion
     * @return True, wenn zutreffend. False, wenn nicht.
     */
    public abstract boolean forAll(Function<A, Boolean> p);

    /**
     * Boolean für die existens eines Objektes in der Liste. O(n)
     * @param a - Das zu Suchende Objekt.
     * @return True, wenn zutreffend. False, wenn nicht.
     */
    public abstract boolean elem(A a);

    public abstract <B> B foldRight(B identity, Function<A, Function<B, B>> f);
//    public abstract <B> B foldLeft(B identity, Function<B, Function<A, B>> f);
//    public abstract <B> Tuple<B, List<A>> foldLeft(B identity, B zero, Function<B, Function<A, B>> f);

    /**
     * Entfernt alle doppelt vorkommenden Elemente in einer Liste. O(n)
     * @return Liste mit einzigartigen Elementen.
     */
    public abstract List<A> distinct();

    public abstract <B> Map<B, List<A>> groupBy(Function<A,B> f);

//    public abstract A[] toArray();

    @SuppressWarnings("rawtypes")
    public static final List NIL = new Nil();

    private List() {}

    @SuppressWarnings("unchecked")
    public static <A> List<A> list() {
        return NIL;
    }

    @SafeVarargs
    public static <A> List<A> list(A... a) {
        List<A> n = list();
        for (int i = a.length - 1; i >= 0; i--) {
            n = new Cons<>(a[i], n);
        }
        return n;
    }

    public List<A> cons(A a) {
        return new Cons<>(a, this);
    }

    private static class Nil<A> extends List<A> {

        private Nil() {}

        public A head() {
            throw new IllegalStateException("head called on an empty list");
        }

        public List<A> tail() {
            throw new IllegalStateException("head called on an empty list");
        }

        public boolean isEmpty() {
            return true;
        }

        public List<A> setHead (A a) {
            throw new IllegalStateException("head called on an empty list");
        }

        public String toString() {
            return "[NIL]";
        }

        public List<A> reverse() {
            return this;
        }

        public List<A> init () {
            throw new IllegalStateException("init called on empty list");
        }

        @Override
        public <A1> List<A1> concat(List<A1> l1, List<A1> l2) {
            return l1 == NIL ? l2 : l1;
        }

        @Override
        public List<A> filter(Function<A, Boolean> f) {
            return null;
        }

        public <B> B foldRight (B n, Function<A, Function<B, B>> f) {
            throw new IllegalStateException("foldRight called on empty list");
        }

//        @Override
//        public <B> B foldLeft(B identity, Function<B, Function<A, B>> f) {
//            throw new IllegalStateException("foldLeft called on empty list");
//        }

        @Override
        public <B> List<B> map (Function<A, B> f) {
            throw new IllegalStateException("map called on empty list");

        }

//        @Override
//        public <B> Tuple<B, List<A>> foldLeft(B identity, B zero, Function<B, Function<A, B>> f) {
//            throw new IllegalStateException("map called on empty list");
//        }

        @Override
        public int length() {
            return 0;
        }

        @Override
        public boolean exists(Function<A, Boolean> f) {
            return false;
        }

        @Override
        public boolean forAll(Function<A, Boolean> p) {
            return false;
        }

        @Override
        public boolean elem(A a) {
            return false;
        }

        @Override
        public List<A> distinct () {
            return null;
        }

        @Override
        public <B> Map<B, List<A>> groupBy(Function<A, B> f) {
            throw new IllegalStateException("groupBy called on empty list");
        }

    }

    private static class Cons<A> extends List<A> {

        private final A head;
        private final List<A> tail;

        private Cons (A head, List<A> tail) {
            this.head = head;
            this.tail = tail;
        }

        public A head() {
            return head;
        }

        public List<A> tail() {
            return tail;
        }

        public boolean isEmpty() {
            return false;
        }

        public List<A> setHead (A a) {
                return new Cons<>(a, tail());
        }

        public static <A> List<A> setHead(List<A> l, A a) {
            return l.setHead(a);
        }

        public String toString() {
            return String.format("[%sNIL]", toString(new StringBuilder(), this).eval());
        }

        private TailCall<StringBuilder> toString (StringBuilder acc, List<A> list) {
            return list.isEmpty()
                    ? ret(acc)
                    : sus(() -> toString(acc.append(list.head()).append(", "), list.tail()));
        }

        // nicht static !!!!!!!! nicht Stack Safe !!!! O(n1)
//        public List<A> concat (List<A> l1, List<A> l2) {
//            return l1.isEmpty()
//                    ? l2
//                    : new Cons<>(l1.head(), concat(l1.tail(), l2));
//        }

        public <A> List<A> concat (List<A> l1, List<A> l2) {
            return foldRight(l1, l2, x -> y -> new Cons<>(x, y));
        }

        public List<A> reverse() {
            return reverse_(list(), this).eval();
        }

        private TailCall<List<A>> reverse_(List<A> acc, List<A> list) {
            return list.isEmpty()
                    ? ret(acc)
                    : sus(() -> reverse_(new Cons<>(list.head(), acc), list.tail()));
        }

        public List<A> init () {
            return reverse().tail().reverse();
        }

        public static <A, B> B foldRight (List<A> l, B n, Function<A, Function<B, B>> f) {
            return l.isEmpty()
                    ? n
                    : f.apply(l.head()).apply(foldRight(l.tail(), n, f));
        }

        public <B> B foldRight (B idintity, Function<A, Function<B, B>> f) {
            return foldRight_(idintity, this.reverse(), idintity, f).eval();
        }

        private <B> TailCall<B> foldRight_ (B acc, List<A> l, B idintity, Function<A, Function<B, B>> f) {
            return l.isEmpty()
                    ? ret(acc)
                    : sus(() -> foldRight_(f.apply(l.head()).apply(acc), l.tail(), idintity, f));
        }

//        @Override
//        public <B> B foldLeft(B identity, Function<B, Function<A, B>> f) {
//            return foldLeft(identity, this, f).eval();
//        }

//        private <B> TailCall<B> foldLeft(B acc, List<A> list, Function<B, Function<A, B>> f) {
//            return list.isEmpty()
//                    ? ret(acc)
//                    : sus(() -> foldLeft(f.apply(acc).apply(list.head()), list.tail(), f));
//        }

//        @Override
//        public <B> Tuple<B, List<A>> foldLeft(B identity, B zero, Function<B, Function<A, B>> f) {
//            return foldLeft(identity, zero, this, f).eval();
//        }

//        private <B> TailCall<Tuple<B, List<A>>> foldLeft(B acc, B zero, List<A> list, Function<B, Function<A, B>> f) {
//            return list.isEmpty() || acc.equals(zero)
//                    ? ret(new Tuple<>(acc, list))
//                    : sus(() -> foldLeft(f.apply(acc).apply(list.head()), zero, list.tail(), f));
//        }

        public <B> List<B> map (Function<A, B> f) {
            return foldRight(list(), x -> y -> new Cons<>(f.apply(x), y));
        }

        public List<A> filter (Function<A, Boolean> f) {
            return foldRight(list(), x -> y -> f.apply(x) ? new Cons<>(x, y) : y);
        }

        public int length() {
            return foldRight(this, 0, x -> y -> y + 1);
        }

        public boolean exists (Function<A, Boolean> f) {
            return foldRight(false, x -> y -> f.apply(x) || y);
        }

        public boolean forAll(Function<A, Boolean> f) {
            return foldRight(true, x -> y -> f.apply(x) && y);
        }

//        public boolean forAll2(Function<A, Boolean> f) { return !exists(x -> !f.apply(x)); }

        public boolean elem(A a) {
            return foldRight(false, x -> y -> x.equals(a) || y);
        }

        public List<A> distinct() {
            Set<A> s = set();
            s = foldRight(s, x -> y -> y.insert(x));
            return s.toList();
        }

        @Override
        public <B> Map<B, List<A>> groupBy(Function<A, B> f) {
            return foldRight(ListMap.map(), (A x) -> {
                return y -> {
                    final B k = f.apply(x);
                    return y.put(k, y.contains(k) ? y.get(k).cons(x) : list(x));
                };
            });
        }


//        @Override
//        public A[] toArray() {
//            AtomicInteger a = new AtomicInteger();
//            A[] arr = (A[]) new Object[length()];
//            return foldRight(arr, x -> y -> y[1] = x);
//        }
    }
}
