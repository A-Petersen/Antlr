package stack;

/**
 * Klasse Zelle
 * @author Arne Petersen
 *
 */
public class Zelle<E> {

	/**
	 * Inhalt
	 */
	private E inhalt;
	/**
	 * Pointer der Zelle
	 */
	private Zelle<E> next;
	
	/**
	 * Konstruktor der Klasse Zelle
	 * @param e Inhalt
	 */
	public Zelle(E e) {
		inhalt = e;
	}
	
	/**
	 * Getter der Zelle, um den Inhalt auszulesen.
	 * Laufzeit: O(n):1
	 * @return Inhalt
	 */
	public E getZelle() {
		return this.inhalt;
	}
	
	/**
	 * Setzt den Pointer einer Zelle.
	 * Laufzeit: O(n):1
	 * @param z - Zelle auf die der Pointer gesetzt werden soll.
	 */
	public void setNext(Zelle<E> z) {
		this.next = z;
	}
	
	/**
	 * Gibt die Zelle aus, auf welche der Pointer der aktuellen Zelle zeigt.
	 * Laufzeit: O(n):1
	 * @return Zelle auf die der Pointer der aktuellen Zelle zeigt.
	 */
	public Zelle<E> next() {
		return this.next;
	}
}
