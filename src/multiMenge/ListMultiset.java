package multiMenge;


import static map.ListMap.map;

import java.util.function.Function;
import map.Map;

/**
 * Created by n0ld on 24.06.2017.
 */
public class ListMultiset<A> implements Multiset<A> {

    private Map<A, Integer> map = map();

    private ListMultiset(Map<A, Integer> map) { this.map = map; }

    public static <A> Multiset<A> multiSet() { return new ListMultiset<A>(map()); }
    
    public static <A> Multiset<A> multiSet(A ... a) {
        Multiset<A> m = multiSet();
        for (A i : a ) {
            m = m.insert(i);
        }
        return m;
    }

    @Override
    public int size() {
        return map.isEmpty() ? 0 : map.entrySet().toList().foldRight(0, x -> y -> x.value + y);
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean member(A e) {
        return map.contains(e);
    }

    @Override
    public Multiset<A> remove(A e) {
        return new ListMultiset<>(
                map.contains(e) ?
                        this.count(e) == 1 ? map.remove(e) :
                map.put(e, this.count(e) - 1) : map); //NEEEEEEEEEEEE
    }

    @Override
    public Multiset<A> insert(A e) {
        return new ListMultiset<>(map.contains(e) ? map.put(e, count(e) + 1) : map.put(e, 1));
    }

    @Override
    public int count(A e) {
        if (map.isEmpty()) return 0;
        return !map.contains(e) ? 0 :
                map.get(e);
    }

    @Override
    public int distinct() {
        return map.isEmpty() ? 0 : map.size();
    }

    @Override
    public boolean forAll(Function<A, Boolean> p) {
        return map.forAllKeys(p);
    }

    @Override
    public boolean isSubsetOf(Multiset<A> s) {
        if (this.isEmpty()) return true;
        return this.size() > s.size() ? false : this.forAll(x -> s.member(x) && s.count(x) == this.count(x));
    }

    @Override
    public boolean isEqualTo(Multiset<A> s) {
        return this.size() == s.size() && this.isSubsetOf(s);
    }

    @Override
    public String toString() {
        return String.format(("Multiset[" + map.entrySet().toList().foldRight("", x -> y -> y + "(" + x.key + "," + x.value + "),") + "]").replace(",]", "]"));
    }

    public Map<A, Integer> getMap() {
        return map;
    }
}
