package map;

import java.util.function.Function;
import set.Set;
import static set.ListSet.set;

/**
 * Created by n0ld on 16.06.2017.
 */
public class ListMap<K, V> implements Map<K, V>{

    private Set<Entry<K, V>> set = set();

    private ListMap(Set<Entry<K, V>> set) {
        this.set = set;
    }

    public static <K, V> Map<K, V> map() {
        return new ListMap<>(set());
    }

    @Override
    public Map<K, V> put(K k, V value) {
        return this.contains(k) ? this.remove(k).put(k, value) :  new ListMap<>(set.insert(new Entry<>(k, value)));
    }

    @Override
    public boolean contains(K k) {
        if (set.isEmpty()) return false;
        return !set.forAll(x -> !x.equals(new Entry<>(k, null)));
//        return !set.forAll(x -> !x.key.equals(k));
    }

    @Override
    public Map<K, V> remove(K k) {
        if (!contains(k)) return this;
        return new ListMap<>(set.remove
                (set.toList()
                        .filter(x -> x.key.equals(k))
                        .head()));
    }

    @Override
    public boolean isEmpty() {
        return set.isEmpty();
    }

    @Override
    public int size() {
        return set.size();
    }

    @Override
    public String toString() {
        return "Map" + String.format(set.toString().substring(3, set.toString().length()));
    }

    @Override
    public V get(K k) {
//        if (isEmpty()) return null;
//        return set.toList().filter(x -> x.key == k).isEmpty() ?
//        null : set.toList().filter(x -> x.key == k).head().value;
        return this.contains(k) ?  set.toList().filter(x -> x.key.equals(k)).head().value : null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return set;
    }

    public boolean forAll(Function<Entry<K, V>, Boolean> p) {
        return set.forAll(p);
    }

    public boolean forAllKeys(Function<K, Boolean> p) {
        return set.forAll(x -> p.apply(x.key));
    }

    @Override
    public boolean isEqualTo(Map<K, V> o) {
        if (isEmpty() && o.isEmpty()) return true;
        return set.forAll(x -> o.contains(x.key)) && set.size() == o.size(); //Values werden nicht verglichen?
    }
}
