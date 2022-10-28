package collections_framework;

import java.util.Vector;

class Vector_Remove {

	public static void main(String[] args) {
		Vector<String> obj1 = new Vector<>();
		// using the add() method
		obj1.add("Ravi");
		obj1.add("Prakash");
		
		//using index number
		obj1.add(2,"Vaishya");
		System.out.println("Vector:"+obj1);
		
		//Using remove() method
		String s= obj1.remove(2);
		System.out.println("Remove Element:"+s);
		System.out.println("New Vector:"+obj1);
		
		//using clear() method
		obj1.clear();
		System.out.println("Vector After:"+obj1);
	}

}