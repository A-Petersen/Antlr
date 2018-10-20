package stack;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;



@RunWith(Theories.class)
public class ADTListTheo {

	@DataPoint public static List<Integer> data1 = Arrays.asList(1, 2, 5);
	@DataPoint public static List<Integer> data2 = Arrays.asList(3, 8, 5, 9, 2);
	@DataPoint public static List<Integer> data3 = Arrays.asList();
	@DataPoint public static int x1 = 3;
	@DataPoint public static int x2 = 100;
	
	protected AbstractStack<Integer> createStack(List<Integer> data) {
		AbstractStack<Integer> listStack = new ListStack<Integer>();
		for (int i = 0; i < data.size(); i++) {
			listStack.push(data.get(i));
		}
		return listStack;
	}
	
	//1.4. Junit-Test
	
	//isEmpty(empty) = true
	@Theory
	public void isEmptyTest(List<Integer> data) {
		AbstractStack<Integer> listStack = createStack(data);
		if (listStack.isEmpty()) {
			assertTrue(listStack.isEmpty());
		} else {
			assertFalse(listStack.isEmpty());
		}
	}
	
	//isEmpty(push(s,x)) = false
	@Theory
	public void isEmptyPushTest(List<Integer> data, int x) {
		AbstractStack<Integer> listStack = createStack(data);
		listStack.push(x);
		assertFalse((listStack.isEmpty()));
	}

	//top(push(s,x)) = x
	@Theory
	public void topTest(List<Integer> data, int x) {
		AbstractStack<Integer> listStack = createStack(data);
		listStack.push(x);
		assertTrue(listStack.top() == x ? true : false);
	}
	
	//popTop(s) = ignore,top(s)
	@Theory
	public void popTopTest(List<Integer> data, int x) {
		AbstractStack<Integer> listStack = createStack(data);
		listStack.push(x);
		assertEquals(listStack.top(), listStack.popTop());
	}
	
	// 2.3. JUnit-Test komplettieren

	//pop(push(s,x)) = s
	@Theory
	public void popPushTest(List<Integer> data, int x) {
		AbstractStack<Integer> listStack1 = createStack(data);
		AbstractStack<Integer> listStack2 = createStack(data);
		assertTrue(listStack1.isEqualTo(listStack2));
		listStack1.push(x);
		listStack1.pop();
		assertTrue(listStack1.isEqualTo(listStack2));
	}
	
	//push(top(s),pop(s)) = s , falls s nicht leer
	@Theory
	public void pushTopPopTest(List<Integer> data, int x) {
		AbstractStack<Integer> listStack1 = createStack(data);
		AbstractStack<Integer> listStack2 = createStack(data);
		listStack1.push(x);
		listStack1.push(x);
		listStack2.push(x);
		listStack2.push(x);
		assertTrue(listStack1.isEqualTo(listStack2));
		int str = listStack1.top();
		listStack1.pop();
		listStack1.push(str);
		assertTrue(listStack1.isEqualTo(listStack2));
	}
	
	//popTop(s) = pop(s), top(s) , falls s nicht leer
	@Theory
	public void popTopPopTopTest(List<Integer> data, int x) {
		AbstractStack<Integer> listStack1 = createStack(data);
		AbstractStack<Integer> listStack2 = createStack(data);
		listStack1.push(x);
		listStack1.push(x);
		listStack2.push(x);
		listStack2.push(x);
		assertTrue(listStack1.isEqualTo(listStack2));
		listStack1.popTop();
		listStack2.top();
		listStack2.pop();
		assertTrue(listStack1.isEqualTo(listStack2));
	}
	
	//push(popTop(s)) = s , falls s nicht leer
	@Theory
	public void pushPopTopTest(List<Integer> data, int x) {
		AbstractStack<Integer> listStack1 = createStack(data);
		AbstractStack<Integer> listStack2 = createStack(data);
		listStack1.push(x);
		listStack2.push(x);
		assertTrue(listStack1.isEqualTo(listStack2));
		listStack1.push(x);
		listStack1.popTop();
		assertTrue(listStack1.isEqualTo(listStack2));
	}
}
