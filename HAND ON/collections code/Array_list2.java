package Collections_codes;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_List2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Fruit Names:");
        // get names from user 
		String s=sc.nextLine();
		// creating array list 
		ArrayList<String> s1=new ArrayList<String>();
		
		//add 		
		s1.add(s);
		
        //print values
		System.out.println(s1);
		

	}

}