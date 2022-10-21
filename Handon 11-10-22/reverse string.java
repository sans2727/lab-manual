import java.util.Scanner;//importing scanner class
public class Reverse_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//creating object of scanner class
		System.out.println("Enter the Line you want to Reverse");
		String a = sc.nextLine();//taking length of array from user
		char[]array=a.toCharArray();
		System.out.println("The Reverse String Array is:");
		//for loop for reverse of string 
		for(int i=array.length-1;i>=0;i--)
		{
			System.out.print(array[i]);//printing the reverse of string array
		}

	}

}