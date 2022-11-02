Date:17-10-22
import java.util.Scanner;
public class Multi_Array {

	public static void main(String[] args) {
		int i,j,a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows:");
		//taking row as input
		a=sc.nextInt();
		System.out.println("Enter the no of Columns:");
		//taking column as input
		b=sc.nextInt();
		
		//declaring 2d matrix
		int array[][]=new int[a][b];
		//reading the matrix value
		System.out.println("enter the element of row:");
		//loop for row
		for(i=0;i<a;i++) 
		{
			for (j=0;j<b;j++)
		{
		array[i][j]=sc.nextInt();
		//accessing array values
		}
		}
		System.out.println("Enter the element of column:");
			for (i=0;i<a;i++) 
			{
			for(j=0;j<b;j++)
			{
				System.out.println(array[i][j]+" ");
			}
					
			System.out.println();
		}
			
	
	}

}