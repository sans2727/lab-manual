// write a program to sort array list in descending order.
package Collections_codes;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist_Descending {

	public static void main(String[] args) {
		//using add method
		ArrayList<String>subj=new ArrayList<>();
		
		subj.add("Maths");
		subj.add("English");
		subj.add("Physics");
		subj.add("Biology");
		subj.add("Chemistry");
		subj.add("History");
		
		System.out.println("Subjects Arralist are:"+subj);
		//print arraylist in descending order
		Collections.sort(subj,Collections.reverseOrder());
		System.out.println("Sorted arraylist in descendingorder is:"+subj);
	
		

	}

}