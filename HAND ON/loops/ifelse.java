//test whether the person is eligible to give vote using(if-else)
package Operators_ex;

import java.util.Scanner;

public class IfElseEx {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		
		//if-else statement
		if(age>=18)// condition
		{
			System.out.println("Eligible for voting...!");
		}
		else//if condition is not statisfied then print else part
		{
			System.out.println("Not eligible for voting..!");
		}
		
		

	}

}
Footer
© 2022 GitHub, Inc.