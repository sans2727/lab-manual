/*
 * Arithmetic Operators
 * Date:- 10/10/22
 */

package operators;
import java.util.Scanner;
class Arithmetic {

	public static void main(String[] args) {
		//Creating scanner class object to take the input from the user
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the First Number");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second Number");
		int num2 = sc.nextInt();
		
		// writing operation (+,-,/,*)
		int add,sub,mul,mod;
		double div;
		add = num1+num2;
		sub = num1-num2;
		mul = num1*num2;
		div = num1/num2;
		mod = num1%num2;
		
		// printing values
		System.out.println("Addition:"+add);
		System.out.println("Subtraction:"+sub);
		System.out.println("Multiplication:"+mul);
		System.out.println("Division:"+div);
		System.out.println("modules:"+mod);
			
		sc.close();
	}

}