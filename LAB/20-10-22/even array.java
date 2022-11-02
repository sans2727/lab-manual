import java.util.Arrays;
import java.util.Scanner;//importing scanner class
public class Even_Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);//creating object of scanner class
		System.out.print("Enter the number of element in array:");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.print("enter the "+ size+ "element of array:");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		// for loop for checking even number in array
		for(int i=0;i<a.length;i++)
		{  
			if(a[i]%2==0) 
			System.out.println("Even Number are:"+a[i]);
			
		}
		//to arrange array in ascending order we use sort method 
		Arrays.sort(a);
		System.out.println("\n Ascending order of array:");
		for (int n:a)
		{
		System.out.print(n+" ");	
		


	}
		sc.close();

	}
}