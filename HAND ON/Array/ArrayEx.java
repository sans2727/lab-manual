package Casting;

import java.util.Scanner;

public class ArrayEx {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a length of array:"); //get length from user 
		int l=sc.nextInt();
		// use single dimensional array 
		int arr[]=new int[l];
		
		System.out.println("Enter a numbers:");
		
		for(int i=0;i<arr.length;i++) // use for loop for printing the elements
		{
			arr[i]=sc.nextInt();
		}
		for(int i:arr) // use loop for printing the array
		{
			System.out.println("Array is:"+i);
		}
	}
		
}