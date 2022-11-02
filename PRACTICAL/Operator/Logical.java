/*
 * Logical Operators
 * Date:- 10/10/22
 */
package operators;
import java.util.Scanner;
class Logical {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the First Number");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the Second Number");
		int num2 = sc.nextInt();
		
		System.out.println("Enter the Third Number");
		int num3 = sc.nextInt();
		
		System.out.println("Performing AND Operation");
		//using logical AND to verify two constraints
		
		if((num1<num2)&&(num2==num3))
		{
			int sum = num1+num2+num3;
			System.out.println("Sum is:"+sum);
		}
		
		else
		{
			System.out.println("False Condition.");
		}
		
		System.out.println("Performing OR Operation");
		//using logical OR to verify two constraints
		
		if((num1<num2)||(num2==num3))
		{
			int sum = num1+num2+num3;
			System.out.println("Sum is:"+sum);
		}
		
		else
		{
			System.out.println("False Condition.");
		}
		
		System.out.println("Performing NOT Operation");
		//using logical NOT to verify two constraints
		
		System.out.println("!(num1<num2)"+!(num1<num2));
		System.out.println("!(num2==num3)"+!(num2==num3));
		sc.close();
	}

}