//write a program to print a table in for loop
package Operators_ex;

import java.util.Scanner;

public class ForLoopEx {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		
		//using for loop for printing table
		for(int i=1;i<=10;i++) {
			
	        System.out.println(num +"*"+i +"=" +num*i); 
		}

	}

}