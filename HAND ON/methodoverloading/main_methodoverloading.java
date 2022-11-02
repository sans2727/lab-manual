package MethodOverloading;

import java.util.Scanner;

public class Main_MethodOverloading {

	public static void main(String[] args) {
		
		//get number from user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any three Number:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
       System.out.println("Addition of first two number is:"+ArithAddition.addition(a, b));  // calling method with same name with diiferent parameter
       System.out.println("Addition of three number is:"+ArithAddition.addition(a, b,c));    

	}

}