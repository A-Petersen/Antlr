package stack;

import java.util.List;

public interface Stack<E> {

	/**
	 * Zeigt ob der Stack leer ist.
	 * Laufzeit: O(n):1
	 * @return true wenn leer / false wenn nicht
	 */
	public abstract boolean isEmpty();
	/**
	 * Legt ein Objekt auf den Stack.
	 * Laufzeit: O(n):1
	 * @param e - Das auf den Stack zu legende Objekt
	 */
	public abstract void push(E e);
	/**
	 * Entfernt das oberste Objekt eines Stacks.
	 * Laufzeit: O(n):1
	 */
	public abstract void pop();
	/**
	 * Gibt das oberste Objekt eines Stacks aus.
	 * Laufzeit: O(n):1
	 * @return Das oberste Objekt eines Stacks.
	 */
	public abstract E top();
	/**
	 * Gibt eine Liste mit allen Objekten eines Stacks aus.
	 * Laufzeit: O(n):1
	 * @return Eine Liste mit allen Objekten eines Stacks
	 */
	public abstract List<E> toList();
	/**
	 * Vergleicht zwei Stacks miteinander und überprüft ob diese gleich sind.
	 * Laufzeit: O(n):n
	 * @param s - Der zu vergleichende Stack
	 * @return true falls die Stacks gleich sind / false falls nicht.
	 */
	public abstract boolean isEqualTo(AbstractStack<E> s);
	/**
	 * Zeigt die größe eines Stacks.
	 * Laufzeit: O(n):n
	 * @return Die größe eines Stacks in int.
	 */
	public abstract int size();
	
	/**
	 * Gibt das oberste element eines Stacks aus und entfernt dieses aus dem Stack.
	 * Laufzeit: O(n):1
	 * @return Das oberste element eines Stacks.
	 */
	
}
