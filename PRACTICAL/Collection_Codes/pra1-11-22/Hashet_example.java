/*
 * Hashset class implement the set interface, it uses hashtable to store the element
 * and contains only unique elements
 * 
 */
package collections_framework;

import java.util.*;

class Hashset_Example {

	public static void main(String[] args) {
		
		HashSet <String> obj1=new HashSet<>();
		
		// using add() method
		obj1.add("Ravi");
		obj1.add("Prakash");
		
		
		System.out.println("HashSet is:"+obj1);
		
		//calling interator() method
		Iterator<String> obj2= obj1.iterator(); 
		
		System.out.println("Hashset using Iterator:");
		while(obj2.hasNext())//hasnext is method which will check the next value in array
		{
			System.out.print(obj2.next());
			
			System.out.print(",");
		}
		

	}

}

Privacy
