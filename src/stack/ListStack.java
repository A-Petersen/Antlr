package stack;

import java.util.LinkedList;
import java.util.List;

@SuppressWarnings("serial")
class ListStackFehler extends RuntimeException{
String message;
ListStackFehler(String m) {message = m;}
}

/**
 * Klasse ListStack
 * @author Arne Petersen 276562
 *
 */
public class ListStack<E> extends AbstractStack<E> {

	/**
	 * Anker
	 */
	private Zelle<E> top; //Anker
	/**
	 * Größe
	 */
	private int size;
	
	/**
	 * Konstruktor der Klasse ListStack
	 */
	public ListStack() {
		top = null;
		size = 0;
	}
	
	public boolean isEmpty() {
		return top == null;
	}

	public void push(E e) {
		Zelle<E> neueZelle = new Zelle<E>(e);
		Zelle<E> alteZelle = this.top;
		top = neueZelle;
		top.setNext(alteZelle);
		size++;
	}

	public void pop() {
		if (isEmpty()) throw new ListStackFehler("Stack underflow");
			top = top.next();
			size--;
	}

	public E top() {
		if (isEmpty()) throw new ListStackFehler("Stack underflow");
		return top.getZelle();
	}

	public int size() {
		return this.size;
	}

	public List<E> toList() {
		AbstractStack<E> ar = new ListStack<E>();
		List<E> list = new LinkedList<E>();
		while (!this.isEmpty()) {
			list.add(this.top());
			ar.push(this.popTop());			
		}
		while (!ar.isEmpty()) {
			this.push(ar.popTop());
		}
		return list;
	}

	public boolean isEqualTo(AbstractStack<E> s) {
		AbstractStack<E> v1 = new ListStack<E>();
		AbstractStack<E> v2 = new ListStack<E>();
		Boolean b = true;
		
		if (s.size() != this.size()) return false;
		
		while (!this.isEmpty() && !s.isEmpty() && b == true) {
			if (this.top() != s.top()) { 
				b = false;
			} else {
				b = true;
			}
			v1.push(this.popTop());
			v2.push(s.popTop());
		}
		while (!v1.isEmpty() && !v2.isEmpty()) {
			this.push(v1.popTop());
			s.push(v2.popTop());
		}
		return b;
	}
	
//	public E popTop() {
//	E merk = top();
//	this.pop();
//	return merk;
//}
}
