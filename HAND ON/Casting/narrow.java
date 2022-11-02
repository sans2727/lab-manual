package Casting;

import java.util.Scanner;

public class Narrowing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		double d=sc.nextInt();
		
		long l=(long)d; //no explicit type casting required
		int i=(int)l;   //no explicit type casting required
		
		System.out.println("double value is:"+d);
		System.out.println("long value is:"+l);
		System.out.println("int value is:"+i);
	}

}