/*
 * Unary Operators
 * Date:- 10/10/22
 */
package operators;
import java.util.Scanner;
class Unary_Operator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter First Number:");
		int num1 = sc.nextInt();
		sc.close();
		
		//performing pre increment operation
		++num1;
		System.out.println("pre increment value:"+num1);
		
		//performing post increment operation
		num1++;
		System.out.println("post increment Value:"+num1);
		
		//performing pre decrement operation
		--num1;
		System.out.println("pre decrement value:"+num1);
		
		//performing post decrement operation
		num1--;
		System.out.println("post decrement Value:"+num1);
	}

}