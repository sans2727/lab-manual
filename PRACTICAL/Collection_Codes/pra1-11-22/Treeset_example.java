/*
 * tree set implements set interface that uses a tree for storage
 * it inherits abstract set class an implements navigable set interface
 * the object of the tree set class are sorted in ascending order
 * it contains unique and does not allows null values
 */
package collections_framework;

import java.util.*;

class TreeSet_Example {

	public static void main(String[] args) {
		
		SortedSet <String> fruits = new TreeSet<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		System.out.println("Fruits sets:"+fruits);
		
		//duplicate elements are ignored
		fruits.add("apple");//if we put same Apple then it will not print due to dupliacte value
		
		System.out.println("After adding Duplicate Element:"+fruits);

	}

}