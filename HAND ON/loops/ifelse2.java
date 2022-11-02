package Operators_ex;

import java.util.Scanner;
//demonstrate if else statement of 5 subjects .the person who gets above 60% will be passed otherwise failed

public class IFElse_EX2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:");
		String name=sc.nextLine();
		
		System.out.println("Enter marks for 5 subject:");
		int s1=sc.nextInt();
		int s2=sc.nextInt();
		int s3=sc.nextInt();
		int s4=sc.nextInt();
		int s5=sc.nextInt();
		
		int total=s1+s2+s3+s4+s5; // for total marks
		System.out.println("Total Marks:"+total);
		
	    double percentage= (total/500.0)*100;// for percentage
	    System.out.println("Percentage:"+percentage);
		
		if(percentage>=60)
		{
			System.out.println("Result:Passed");
		}
		else
		{
			System.out.println("Result:Failed");
		}
		

	}

}