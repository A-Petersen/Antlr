package stack;

import java.util.LinkedList;
import java.util.List;

@SuppressWarnings("serial")
class ArrayStackFehler extends RuntimeException{
String message;
ArrayStackFehler(String m) {message = m;}
}

/**
 * ArraayStack Klasse
 * @author Arne Petersen 276562
 *
 */
public class ArrayStack<E> extends AbstractStack<E> {

	/**
	 * Array des Stacks
	 */
	private E[] array;
	/**
	 * Pointer des Stacks
	 */
	private int top;
	/**
	 * Größe des Stacks
	 */
	private static final int CAPACITY = 10;
	
	/**
	 * Konstruktor der Klasse Stack
	 */
	@SuppressWarnings("unchecked")
	public ArrayStack() {
		array = (E[]) new Object[CAPACITY];
		top = -1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	/**
	 * Zeigt ob der Stack voll ist.
	 * Laufzeit: O(n):1
	 * @return true falls voll / false falls leer.
	 */
	public boolean isFull() { 
		return top == CAPACITY -1;
	}
	
	public void push(E e) {
		if (isFull()) throw new ArrayStackFehler("Stack overflow");
		array[++top] = e;
	}

	public void pop() {
		if (isEmpty()) throw new ArrayStackFehler("Stack underflow");
		array[top--] = null;
	}

	public E top() {
		if (isEmpty()) throw new ArrayStackFehler("Stack underflow");
		return array[top];
	}

	public List<E> toList() {
		AbstractStack<E> ar = new ArrayStack<E>();
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

	public int size() {
		return CAPACITY;
	}

	public boolean isEqualTo(AbstractStack<E> s) {
		AbstractStack<E> v1 = new ArrayStack<E>();
		AbstractStack<E> v2 = new ArrayStack<E>();
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
//		E merk = top();
//		this.pop();
//		return merk;
//	}
}
