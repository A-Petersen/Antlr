package stack;

import static org.junit.Assert.*;

import org.junit.Test;

public class ADTListStackTest {

	//1.4. Junit-Test
	
	//isEmpty(empty) = true
	@Test
	public void isEmptyTestList() {
		AbstractStack<String> listStack = new ListStack<String>();	
		assertTrue(listStack.isEmpty());
	}
	
	//isEmpty(push(s,x)) = false
	@Test
	public void isEmptyPushTestList() {
		AbstractStack<String> listStack = new ListStack<String>();
		listStack.push("x");
		assertFalse((listStack.isEmpty()));
	}

	//top(push(s,x)) = x
	@Test
	public void topTestList() {
		AbstractStack<String> listStack = new ListStack<String>();
		listStack.push("x");
		assertEquals(listStack.top(), "x");
	}
	
	//popTop(s) = ignore,top(s)
	@Test
	public void popTopTestList() {
		AbstractStack<String> listStack = new ListStack<String>();
		listStack.push("x");
		assertEquals(listStack.top(), listStack.popTop());
	}
	
	// 2.3. JUnit-Test komplettieren
	
	//pop(push(s,x)) = s
	@Test
	public void popPushTestList() {
		AbstractStack<String> listStack1 = new ListStack<String>();
		AbstractStack<String> listStack2 = new ListStack<String>();
		assertTrue(listStack1.isEqualTo(listStack2));
		listStack1.push("x");
		listStack1.pop();
		assertTrue(listStack1.isEqualTo(listStack2));
	}
	
	//push(top(s),pop(s)) = s , falls s nicht leer
	@Test
	public void pushTopPopTestList() {
		AbstractStack<String> listStack1 = new ListStack<String>();
		AbstractStack<String> listStack2 = new ListStack<String>();
		listStack1.push("x");
		listStack1.push("y");
		listStack2.push("x");
		listStack2.push("y");
		assertTrue(listStack1.isEqualTo(listStack2));
		String str = listStack1.top();
		listStack1.pop();
		listStack1.push(str);
		assertTrue(listStack1.isEqualTo(listStack2));
	}
	
	//popTop(s) = pop(s), top(s) , falls s nicht leer
	@Test
	public void popTopPopTopTestList() {
		AbstractStack<String> listStack1 = new ListStack<String>();
		AbstractStack<String> listStack2 = new ListStack<String>();
		listStack1.push("x");
		listStack1.push("y");
		listStack2.push("x");
		listStack2.push("y");
		assertTrue(listStack1.isEqualTo(listStack2));
		listStack1.popTop();
		listStack2.top();
		listStack2.pop();
		assertTrue(listStack1.isEqualTo(listStack2));
	}
	
	//push(popTop(s)) = s , falls s nicht leer
	@Test
	public void pushPopTopTestList() {
		AbstractStack<String> listStack1 = new ListStack<String>();
		AbstractStack<String> listStack2 = new ListStack<String>();
		listStack1.push("x");
		listStack2.push("x");
		assertTrue(listStack1.isEqualTo(listStack2));
		listStack1.push("y");
		listStack1.popTop();
		assertTrue(listStack1.isEqualTo(listStack2));
	}
	
	//2.4. JUnit-Test f?r Fehlerf?lle
	
	//pop(empty) = error
	@Test(expected = ListStackFehler.class)
	public void popEmpty() {
		ListStack<String> listStack = new  ListStack<String>();
		listStack.pop();
	}
	
	//top(empty) = error
	@Test(expected = ListStackFehler.class)
	public void topEmpty() {
		ListStack<String> listStack = new  ListStack<String>();
		listStack.top();
	}
	
	//popTop(empty) = error
	@Test(expected = AbstractStackFehler.class)
	public void popTopEmpty() {
		ListStack<String> listStack = new  ListStack<String>();
		listStack.popTop();
	}
}
