/*
 * Relational Operators
 * Date:- 10/10/22
 */
package operators;
import java.util.Scanner;
class Relational_Operators {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter First Number");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Second Number");
		int num2 = sc.nextInt();
		sc.close();
		
		//Performing equal to operation
		System.out.println("num1==num2:"+(num1==num2));
		
		//Performing is not equal to Operation
		System.out.println("num1!=num2:"+(num1!=num2));
		
		//Performing greater than operation
		System.out.println("num1>num2:"+(num1>num2));
		
		//Performing less than operation
		System.out.println("num1<num2:"+(num1<num2));
		
		//Performing less than  equal to Operation
		System.out.println("num1<=num2:"+(num1<=num2));
				
		//Performing greater than equal to operation
		System.out.println("num1>=num2:"+(num1>=num2));
	}

}