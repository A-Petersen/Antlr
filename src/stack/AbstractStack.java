package stack;

@SuppressWarnings("serial")
class AbstractStackFehler extends RuntimeException{
String message;
AbstractStackFehler(String m) {message = m;}
}

/**
 * AbstractStack Klasse
 * @author Arne Petersen 276562
 *
 */
public abstract class AbstractStack<E> implements Stack<E>{

//	/**
//	 * Zeigt ob der Stack leer ist.
//	 * @return true wenn leer / false wenn nicht
//	 */
//	public abstract boolean isEmpty();
//	/**
//	 * Legt ein Objekt auf den Stack.
//	 * @param e - Das auf den Stack zu legende Objekt
//	 */
//	public abstract void push(E e);
//	/**
//	 * Entfernt das oberste Objekt eines Stacks.
//	 */
//	public abstract void pop();
//	/**
//	 * Gibt das oberste Objekt eines Stacks aus.
//	 * @return Das oberste Objekt eines Stacks.
//	 */
//	public abstract E top();
//	/**
//	 * Gibt eine Liste mit allen Objekten eines Stacks aus.
//	 * @return Eine Liste mit allen Objekten eines Stacks
//	 */
//	public abstract List<E> toList();
//	/**
//	 * Vergleicht zwei Stacks miteinander und überprüft ob diese gleich sind.
//	 * @param s - Der zu vergleichende Stack
//	 * @return true falls die Stacks gleich sind / false falls nicht.
//	 */
//	public abstract boolean isEqualTo(AbstractStack<E> s);
//	/**
//	 * Zeigt die größe eines Stacks.
//	 * @return Die größe eines Stacks in int.
//	 */
//	public abstract int size();
	
	/**
	 * Gibt das oberste element eines Stacks aus und entfernt dieses aus dem Stack.
	 * Laufzeit: O(n):1
	 * @return Das oberste element eines Stacks.
	 */
	public final E popTop() {
		if (isEmpty()) throw new AbstractStackFehler("Stack underflow");
		E merk = top();
		this.pop();
		return merk;
	}
}
