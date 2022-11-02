package collections_framework;

import java.util.ArrayDeque;

class Array_Dequeue {

	public static void main(String[] args) {
		ArrayDeque<String> obj1=new ArrayDeque<>();
		
		obj1.add("Ravi");
		obj1.add("Prakash");
		
		//using addFirst() method
		obj1.addFirst("Vaishya");
		//using addLast() method
		obj1.addLast("HI");
		System.out.println("Array Deque:"+obj1);
	}

}