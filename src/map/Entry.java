package map;

/**
 * Created by n0ld on 16.06.2017.
 */
public class Entry <K, V> {

    public K key;
    public V value;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public boolean equals(Entry<K, V> entry) {
//        return this == null ? (entry == null ? true : false) : this.key.equals(entry.key);
//        return this == null || entry == null ? false : this.key.equals(entry.key);
        return this.key.equals(entry.key);
    }

    public String toString() {
        return "Key: " + key + " Value: " + value;
    }
}
