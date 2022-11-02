/*
 * Assignment Operators
 * Date:- 10/10/22
 */
package operators;
import java.util.Scanner;
class Assignment_Operator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter First Number");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Second Number");
		int num2 = sc.nextInt();
		sc.close();
		
		// Adding and Assigning values
		
		num1+=num2;
		System.out.println("num1=:"+num1);
		num1-=num2;
		System.out.println("num1=:"+num1);
		num1*=num2;
		System.out.println("num1=:"+num1);
		num1/=num2;
		System.out.println("num1=:"+num1);
		num1%=num2;
		System.out.println("num1=:" +num1);

	}

}