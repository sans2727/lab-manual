/*
 * creating Linked Hashset from Arraylist
 */
package collections_framework;

import java.util.ArrayList;
import java.util.LinkedHashSet;

class HashSet_Example2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> obj = new ArrayList<>();
		
		obj.add(20);
		obj.add(30);
		System.out.println("array list is :"+obj);
		
		//creating list hashset from an array list
		LinkedHashSet<Integer> obj1 =new LinkedHashSet<>(obj);
		
		System.out.println("LinkedHashSet is:"+obj1);
	}

}