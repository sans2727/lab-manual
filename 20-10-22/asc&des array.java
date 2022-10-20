import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;//import scanner class
public class Asc_Dec_Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);//creating object of scanner class
		System.out.print("Enter the number of element in array:");
		int input = sc.nextInt();
		Integer arr[]=new Integer[input];
		
		System.out.print("enter the "+ input+ "element of array:");
		for(int i=0;i<input;i++)
		{
			arr[i]=sc.nextInt();
		}
		//to arrange array in ascending order we use sort method 
		Arrays.sort(arr);
		System.out.println("\n Result of Ascending array:");
		for (int n:arr)
		{
		System.out.print(n+" ");	
		}
		//sorted the array in descending order
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println("\n Result of Decending array:"+Arrays.toString(arr));
		
		sc.close();

	}

}