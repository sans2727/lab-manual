package Array;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {

		int r1,c1,r2,c2;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows for 1st matrix:");
		r1=sc.nextInt();     //take row as input from user
		
		System.out.print("Enter number of columns for 1st matrix:");
		c1=sc.nextInt();            // taking columns as input
		
		System.out.print("Enter the number of rows for 2nd matrix:");
		r2=sc.nextInt();     //take row as input from user
		
		System.out.print("Enter number of columns for 2nd matrix:");
		c2=sc.nextInt();            // taking columns as input
		
		//declaring the 2d matrix
		if(r1==r2&& c1==c2)//condition
		{
	     int arr1[][] =new int[r1] [c1];
	     int arr2[][]=new int[r2][c2];
	     int arr3[][]=new int[r2][c2];
		 System.out.println("Enter the elements of array:");  // enter the numbers you want
				
			//using loop for printing the numbers for 1st matrix
			for(int i=0;i<r1;i++)          
				{
				   for(int j=0;j<c1;j++)
					{
				     arr1[i][j]=sc.nextInt();
					}
				}
			//for 2nd matrix
			for(int i=0;i<r2;i++)          
			{
			   for(int j=0;j<c2;j++)
				{
			     arr2[i][j]=sc.nextInt();
				}
			}
				   // enter the numbers in matrix from
				     System.out.println("First Matrix:");  
				     //using loop for printing the numbers1st matrix form
				     for(int i=0;i<r1;i++)
				     {
				    	 for(int j=0;j<c1;j++)
				    	 {
				    	 System.out.print(arr1[i][j] +" ");
				    	 }
				    	 System.out.println();
			        }
				     
				  // enter the numbers in matrix from
				     System.out.println("Second Matrix:");  
				     //using loop for printing the numbers 2ndmatrix form
				     for(int i=0;i<r2;i++)
				     {
				    	 for(int j=0;j<c2;j++)
				    	 {
				    	 System.out.print(arr2[i][j] +" ");
				    	 }
				    	 System.out.println();
			        }
				     //for addition of matrix
				    System.out.println("Addition of matrix:");
				    for (int i = 0; i < r1; i++) 
		            {
		                for (int j = 0; j <c2; j++) 
		                {
		                    for (int k = 0; k < c1; k++) 
		                    {
		                      arr3[i][j] = arr1[i][j] + arr2[i][j];
		                    }
		                }
		            }
				    //after addition print the addition of matrix value
				    System.out.println("Matrix after addition:");
		            for (int i = 0; i < r1; i++) 
		            {
		                for (int j = 0; j < c2; j++) 
		                {
		                    System.out.print(arr3[i][j]+" ");
		                }
		                System.out.println("");
		            }
		        }
		        else
		        {
		            System.out.println("Addition would not be possible");
		        }
				
			}
		
	}