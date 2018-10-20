package stack;

import static org.junit.Assert.*;
import org.junit.Test;

public class ADTArrayStackTest {
	
	//1.4. Junit-Test
	
	//isEmpty(empty) = true
	@Test
	public void isEmptyTest() {
		AbstractStack<String> arrayStack = new ArrayStack<String>();	
		assertTrue(arrayStack.isEmpty());
	}
	
	//isEmpty(push(s,x)) = false
	@Test
	public void isEmptyPushTest() {
		AbstractStack<String> arrayStack = new ArrayStack<String>();
		arrayStack.push("x");
		assertFalse((arrayStack.isEmpty()));
	}

	//top(push(s,x)) = x
	@Test
	public void topTest() {
		AbstractStack<String> arrayStack = new ArrayStack<String>();
		arrayStack.push("x");
		assertEquals(arrayStack.top(), "x");
	}
	
	//popTop(s) = ignore,top(s)
	@Test
	public void popTopTest() {
		AbstractStack<String> arrayStack = new ArrayStack<String>();
		arrayStack.push("x");
		assertEquals(arrayStack.top(), arrayStack.popTop());
	}
	
	// 2.3. JUnit-Test komplettieren
	
	//pop(push(s,x)) = s
	@Test
	public void popPushTest() {
		AbstractStack<String> arrayStack1 = new ArrayStack<String>();
		AbstractStack<String> arrayStack2 = new ArrayStack<String>();
		assertTrue(arrayStack1.isEqualTo(arrayStack2));
		arrayStack1.push("x");
		arrayStack1.pop();
		assertTrue(arrayStack1.isEqualTo(arrayStack2));
	}
	
	//push(top(s),pop(s)) = s , falls s nicht leer
	@Test
	public void pushTopPopTest() {
		AbstractStack<String> arrayStack1 = new ListStack<String>();
		AbstractStack<String> arrayStack2 = new ListStack<String>();
		arrayStack1.push("x");
		arrayStack1.push("y");
		arrayStack2.push("x");
		arrayStack2.push("y");
		assertTrue(arrayStack1.isEqualTo(arrayStack2));
		String str = arrayStack1.top();
		arrayStack1.pop();
		arrayStack1.push(str);
		assertTrue(arrayStack1.isEqualTo(arrayStack2));
	}
	
	//popTop(s) = pop(s), top(s) , falls s nicht leer
	@Test
	public void popTopPopTopTest() {
		AbstractStack<String> arrayStack1 = new ArrayStack<String>();
		AbstractStack<String> arrayStack2 = new ArrayStack<String>();
		arrayStack1.push("x");
		arrayStack1.push("y");
		arrayStack2.push("x");
		arrayStack2.push("y");
		assertTrue(arrayStack1.isEqualTo(arrayStack2));
		arrayStack1.popTop();
		arrayStack2.top();
		arrayStack2.pop();
		assertTrue(arrayStack1.isEqualTo(arrayStack2));
	}
	
	//push(popTop(s)) = s , falls s nicht leer
	@Test
	public void pushPopTopTest() {
		AbstractStack<String> arrayStack1 = new ArrayStack<String>();
		AbstractStack<String> arrayStack2 = new ArrayStack<String>();
		arrayStack1.push("x");
		arrayStack2.push("x");
		assertTrue(arrayStack1.isEqualTo(arrayStack2));
		arrayStack1.push("y");
		arrayStack1.popTop();
		assertTrue(arrayStack1.isEqualTo(arrayStack2));
	}
	
	//2.4. JUnit-Test für Fehlerfälle
	
	//pop(empty) = error
	@Test(expected = ArrayStackFehler.class)
	public void popEmpty() {
		ArrayStack<String> arrayStack = new  ArrayStack<String>();
		arrayStack.pop();
	}
	
	//top(empty) = error
	@Test(expected = ArrayStackFehler.class)
	public void topEmpty() {
		ArrayStack<String> arrayStack = new  ArrayStack<String>();
		arrayStack.top();
	}
	
	//popTop(empty) = error
	@Test(expected = AbstractStackFehler.class)
	public void popTopEmpty() {
		ArrayStack<String> arrayStack = new  ArrayStack<String>();
		arrayStack.popTop();
	}
}