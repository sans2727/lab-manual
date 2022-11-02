import java.util.Scanner;
public class TypeCasting {

public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("Enter the number: ");
		i=sc.nextInt();
		
		//no explict type casting required
		long l=i;
		//no explict type casting required
		float f=l;
		 System.out.println("int value: "+i);
		 System.out.println("long value: "+l);
		 System.out.println("float value: "+f);
		 

	}

}