import java.util.Scanner;//importing scanner class for user input
public class Creating_Arr {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);//creating object of scanner size
	
		System.out.println("Enter the length of array:");
		int size=sc.nextInt();//taking user input for size of array
		int arr[]=new int[size];//creating single dimension array of size which is user input
		//using for loop to take user element
		for (int i=0;i<size;i++)
		{
			System.out.println("Enter"+" "+i+" "+"element of array:");
			arr[i]=sc.nextInt();
			
		}//using for loop to print element
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
		sc.close();
		

	}

}