package collections_framework;

import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		
		Vector<String> obj1 = new Vector<>();
		// using the add() method
		obj1.add("Ravi");
		obj1.add("Prakash");
		
		//using index number
		obj1.add(2,"Vaishya");
		System.out.println("Vector:"+obj1);
		
		//using addAll() method
		Vector<String> obj2 = new Vector<>();
		obj2.add("Anudip");
		obj2.add("hii");
		
		obj2.addAll(obj1);
		System.out.println("New Vector:"+obj2);
		

	}

}