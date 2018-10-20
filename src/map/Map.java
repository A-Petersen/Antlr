package map;

import java.util.function.Function;
import set.Set;

/**
 * Created by n0ld on 16.06.2017.
 */
public interface Map<K, V>  {

    /**
     * Setzt ein Key Value element in die Map ein und gibt diese als neue Map aus. O(n^2)
     * @param key Key
     * @param value Value
     * @return Gibt die neue Map aus
     */
    Map<K, V> put(K key, V value);

    /**
     * Testet ob die Map den gesuchten Key enthält. O(n)
     * @param key gesuchter Key
     * @return True falls enthalten, False falls nicht.
     */
    boolean contains(K key);

    /**
     * Entfernt ein Key Value Element unter der Angabe des Keys. O(n^2)
     * @param key Key
     * @return neue Map, ohne das Key Value Paar.
     */
    Map<K, V> remove(K key);

    /**
     * Testet ob die Map leer ist. O(1)
     * @return True falls leer, False falls nicht.
     */
    boolean isEmpty();

    /**
     * Gibt die größe der Map aus (Anzahl an Key Value Paaren). O(n)
     * @return Größe der Map
     */
    int size();

    /**
     * Gibt die Map als String aus. O(n)
     * @return Mapinhalt als String
     */
    String toString();

    /**
     * Gibt den Value eines Key Value Paares aus. O(n)
     * @param k Key
     * @return Value des Key Value Paares
     */
    V get(K k);

    /**
     * Gibt die Map als Set mit allen enthaltenen EntrySets aus. O(1)
     * @return Set<Entry<K, V>>
     */
    Set<Entry<K, V>> entrySet();

    /**
     * Liefert true, wenn alle Elemente der Map das Prädikat p erfüllen. O(n x m)
     * @param p Prädikat
     * @return True, wenn erfüllt. False, wenn nicht.
     */
    boolean forAll(Function<Entry<K, V>, Boolean> p);

    /**
     * Liefert true, wenn alle Keys der Map das Prädikat p erfüllen. O(n x m)
     * @param p Prädikat
     * @return True, wenn erfüllt. False, wenn nicht.
     */
    boolean forAllKeys(Function<K, Boolean> p);

    /**
     * Testet, ob diese Map gleich einer als Argument übergebenen Map o ist. O(n^2)
     * @param o übergebene Map
     * @return True, wenn erfüllt. False, wenn nicht.
     */
    boolean isEqualTo(Map<K, V> o);
}
