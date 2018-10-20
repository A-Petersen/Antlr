package multiMenge;

import java.util.function.Function;
import map.Map;

/**
 * Created by n0ld on 24.06.2017.
 */
public interface Multiset<A> {

    int size();
    boolean isEmpty();
    boolean member(A e);
    Multiset<A> remove(A e);
    Multiset<A> insert(A e);
    int count(A e);
    int distinct();
    boolean forAll(Function<A, Boolean> p);
    boolean isSubsetOf(Multiset<A> s);
    boolean isEqualTo(Multiset<A> s);
    String toString();
    Map<A, Integer> getMap();

}
