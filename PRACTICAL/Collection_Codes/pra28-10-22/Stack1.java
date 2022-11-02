package collections_framework;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		Stack<String> obj1 = new Stack<>();
		
		obj1.push("Ravi");
		obj1.push("Prakash");
		
		System.out.println("Stack value:"+obj1);
		//pop element from the top
		obj1.pop();
		System.out.println("Stack after pop:"+obj1);
		

	}

}