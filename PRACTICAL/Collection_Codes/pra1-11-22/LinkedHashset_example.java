/*
 * Linked hashset is a ordered and sorted collection of hashset 
 * and it maintains the insertion order of the elements
 */
package collections_framework;

import java.util.Iterator;
import java.util.LinkedHashSet;

class LinkedHashset_Example {

	public static void main(String[] args) {
		
		LinkedHashSet <String> obj1 =new LinkedHashSet<>();
		obj1.add("Ravi");
		obj1.add("Prakash");
		System.out.println("Linked hashset :"+obj1);
		Iterator<String> obj2= obj1.iterator(); 
		
		System.out.println("Linked Hashset using Iterator:");
		while(obj2.hasNext())//hasnext is method which will check the next value in array
		{
			System.out.print(obj2.next());
			
			System.out.print(",");
		}

	}

}