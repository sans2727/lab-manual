Date:19-10-22
import java.util.Arrays;
import java.util.Scanner;
 class Sort_Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of element in array:");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.print("enter the "+ size+ "element of array:");
		
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		//to arrange array in ascending order we use sort method 
		Arrays.sort(a);
		System.out.println("\n Result:");
		for (int n:a)
		{
		System.out.print(n+" ");	
		}

	}

}