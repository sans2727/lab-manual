
package labsession6;

import java.util.Scanner;

public class FindLargestNumber 
{
	
	public static Scanner sc;
	public static void main(String[] args) 
	{
		int n1, n2;
		sc = new Scanner(System.in);
		
		//take numbers from user
		System.out.print(" Please Enter the First Number : ");
		n1 = sc.nextInt();	
		
		System.out.print(" Please Enter the Second Number : ");
		n2 = sc.nextInt();	
		
		//check largest number using if else statement
		if(n1 > n2) 
	    {
			System.out.println("\n The Largest Number = " + n1);          
	    } 
	    else if (n1 < n2)
	    { 
	    	System.out.println("\n The Largest Number = " + n2);        
	    } 
	    	
	}	
}