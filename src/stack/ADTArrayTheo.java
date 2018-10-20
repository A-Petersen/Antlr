package stack;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;



@RunWith(Theories.class)
public class ADTArrayTheo {

	@DataPoint public static List<Integer> data1 = Arrays.asList(1, 2, 5);
	@DataPoint public static List<Integer> data2 = Arrays.asList(3, 8, 5, 9, 2);
	@DataPoint public static List<Integer> data3 = Arrays.asList();
	@DataPoint public static int x1 = 3;
	@DataPoint public static int x2 = 100;
	
	protected AbstractStack<Integer> createStack(List<Integer> data) {
		AbstractStack<Integer> arrayStack = new ArrayStack<Integer>();
		for (int i = 0; i < data.size(); i++) {
			arrayStack.push(data.get(i));
		}
		return arrayStack;
	}
	
	//1.4. Junit-Test
	
	//isEmpty(empty) = true
	@Theory
	public void isEmptyTest(List<Integer> data) {
		AbstractStack<Integer> arrayStack = createStack(data);
		if (arrayStack.isEmpty()) {
			assertTrue(arrayStack.isEmpty());
		} else {
			assertFalse(arrayStack.isEmpty());
		}
	}
	
	//isEmpty(push(s,x)) = false
	@Theory
	public void isEmptyPushTest(List<Integer> data, int x) {
		AbstractStack<Integer> arrayStack = createStack(data);
		arrayStack.push(x);
		assertFalse((arrayStack.isEmpty()));
	}

	//top(push(s,x)) = x
	@Theory
	public void topTest(List<Integer> data, int x) {
		AbstractStack<Integer> arrayStack = createStack(data);
		arrayStack.push(x);
		assertTrue(arrayStack.top() == x ? true : false);
	}
	
	//popTop(s) = ignore,top(s)
	@Theory
	public void popTopTest(List<Integer> data, int x) {
		AbstractStack<Integer> arrayStack = createStack(data);
		arrayStack.push(x);
		assertEquals(arrayStack.top(), arrayStack.popTop());
	}
	
	// 2.3. JUnit-Test komplettieren

	//pop(push(s,x)) = s
	@Theory
	public void popPushTest(List<Integer> data, int x) {
		AbstractStack<Integer> arrayStack1 = createStack(data);
		AbstractStack<Integer> arrayStack2 = createStack(data);
		assertTrue(arrayStack1.isEqualTo(arrayStack2));
		arrayStack1.push(x);
		arrayStack1.pop();
		assertTrue(arrayStack1.isEqualTo(arrayStack2));
	}
	
	//push(top(s),pop(s)) = s , falls s nicht leer
	@Theory
	public void pushTopPopTest(List<Integer> data, int x) {
		AbstractStack<Integer> arrayStack1 = createStack(data);
		AbstractStack<Integer> arrayStack2 = createStack(data);
		arrayStack1.push(x);
		arrayStack1.push(x);
		arrayStack2.push(x);
		arrayStack2.push(x);
		assertTrue(arrayStack1.isEqualTo(arrayStack2));
		int str = arrayStack1.top();
		arrayStack1.pop();
		arrayStack1.push(str);
		assertTrue(arrayStack1.isEqualTo(arrayStack2));
	}
	
	//popTop(s) = pop(s), top(s) , falls s nicht leer
	@Theory
	public void popTopPopTopTest(List<Integer> data, int x) {
		AbstractStack<Integer> arrayStack1 = createStack(data);
		AbstractStack<Integer> arrayStack2 = createStack(data);
		arrayStack1.push(x);
		arrayStack1.push(x);
		arrayStack2.push(x);
		arrayStack2.push(x);
		assertTrue(arrayStack1.isEqualTo(arrayStack2));
		arrayStack1.popTop();
		arrayStack2.top();
		arrayStack2.pop();
		assertTrue(arrayStack1.isEqualTo(arrayStack2));
	}
	
	//push(popTop(s)) = s , falls s nicht leer
	@Theory
	public void pushPopTopTest(List<Integer> data, int x) {
		AbstractStack<Integer> arrayStack1 = createStack(data);
		AbstractStack<Integer> arrayStack2 = createStack(data);
		arrayStack1.push(x);
		arrayStack2.push(x);
		assertTrue(arrayStack1.isEqualTo(arrayStack2));
		arrayStack1.push(x);
		arrayStack1.popTop();
		assertTrue(arrayStack1.isEqualTo(arrayStack2));
	}
	
	//2.4. JUnit-Test für Fehlerfälle
	
	
		//pop(empty) = error
		@Theory
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
