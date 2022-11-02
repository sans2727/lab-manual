package Array;

import java.util.Scanner;

public class Arrayex {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length of array:");//get input for the length by user
		int l=sc.nextInt();
		
		int n[]=new int[l];  //length size store in array
		
		for(int i=0;i<n.length;i++)  //use for loop for printing the numbers which are given by user
		{
			System.out.print("Enter "+i+" Number of an array: ");
			int arr=sc.nextInt();
			n[i]=arr;
		}
		//code for printing the numbers in array 
		System.out.print("Array is [ ");
		
		for(int j=0;j<n.length;j++)
		{
			//use if else loop for priting the space and comma
			if(j==(l-1))
			{
				System.out.print(n[j]+" ");
			}
			else
			{
				System.out.print(n[j]+",");
			}
		}
		System.out.print("]");

	}

}