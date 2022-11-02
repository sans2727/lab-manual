/*
 * Bitwise Operators
 * Date:- 10/10/22
 */
package operators;
import java.util.Scanner;
class Bitwise_Operator {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter First Number:");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Second Number:");
		int num2 = sc.nextInt();
		
		sc.close();
		 // Bitwise AND operator
		System.out.println("num1&num2="+(num1&num2));
		// 0 1 0 1
		// 0 1 1 0
		//---------
		// 0 1 0 0 = 4
		
		// Bitwise OR operator
		System.out.println("num1|num2="+(num1|num2));
		// 0 1 0 1
		// 0 1 1 0
		//---------
		// 0 1 1 1 = 7
		
		// Bitwise XOR operator
		System.out.println("num1^num2="+(num1^num2));
		// 0 1 0 1
		// 0 1 1 0
		//---------
		// 0 0 1 1 = 3
		

	}

}9