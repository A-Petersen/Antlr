package stack;

public class Test {

	public static void main(String[] args) {

		ArrayStack<String> arr = new ArrayStack<String>();
		ArrayStack<String> arr1 = new ArrayStack<String>();
		
		arr.push("1");
		System.out.println(arr.top());
		arr.push("2");
		System.out.println(arr.top());
		arr.push("3");
		System.out.println(arr.top());
		
//		System.out.println(arr.toList() + " - " + arr.size());
		
//		System.out.println(arr.popTop());
//		System.out.println(arr.popTop());
//		System.out.println(arr.popTop());
		
		arr1.push("1");
		arr1.push("2");
		arr1.push("3");
		System.out.println(arr.isEqualTo(arr1) + "\n");
		
		//-----------------------------------------------------
		
		ListStack<String> list = new ListStack<String>();
		ListStack<String> list1 = new ListStack<String>();
		
		list.push("erster");
		System.out.println(list.top());
		list.push("zweiter");
		System.out.println(list.top());
		list.push("dritter");
		System.out.println(list.top());
		
//		System.out.println(list.toList());
//		
//		System.out.println(list.popTop());
//		System.out.println(list.popTop());
//		System.out.println(list.popTop());
	
		list1.push("erster");
		list1.push("zweiter");
		list1.push("dritter");
		System.out.println(list.isEqualTo(list1) + "\n");
	}

}
