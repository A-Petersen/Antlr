package set;

import list.List;

import java.util.function.Function;

import static list.List.*;

/**
 * Created by n0ld on 14.05.2017.
 */
public class ListSet<A> implements Set<A>{

    private List<A> list;

    public static <A> Set<A> set() {
        return new ListSet<A>(list());
    }

    public static <A> Set<A> set(A... a) {
        Set<A> n = set();
        for (int i = a.length - 1; i >= 0; i--) {
            n = n.insert(a[i]);
        }
        return n;
    }

    private ListSet(List<A> list)
    {
        this.list = list;
    }

    @Override
    public Set<A> insert(A a) {
        return list.elem(a) ? new ListSet<A>(list).remove(a).insert(a) : new ListSet<A>(list.cons(a));
    }

    @Override
    public Set<A> remove(A a) {
        return this.isEmpty() ? this : new ListSet<A>(list.filter(x -> !x.equals(a)));
    }

    @Override
    public boolean member(A a) {
        return list.elem(a);
    }

    @Override
    public int size() {
        return list.length();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    public String toString() {
        String a = "Set%s";
        if (list.isEmpty()) return String.format(a, "[]");
        return String.format(a, list.toString().substring(0, list.toString().length() - 6) + "]");
    }

    public A get(A a) {
        return list.elem(a) ? a : null;
    }

    public boolean isSubsetOf(Set<A> s) {
        if (this.isEmpty()) return true;
        return list.forAll(x -> s.member(x));
    }

    public boolean forAll(Function<A, Boolean> p) {
        return list.forAll(p);
    }

    public boolean isEqualTo (Set<A> s) {
        return this.isSubsetOf(s) && s.size() == this.size();
    }

    public List<A> toList() {
//        return list.map(x -> x);
        return list;
    }
}
