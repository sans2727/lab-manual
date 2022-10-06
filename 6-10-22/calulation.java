
package labsession6;
import java.util.Scanner;

public class Calculation {

	public static void main(String[] args)
    {
        // stores two numbers
        double num1, num2;
  
        // Take input from the user
        Scanner sc = new Scanner(System.in);
  
        System.out.println("Enter the first number:-");
  
        // take the inputs
        num1 = sc.nextDouble();
        System.out.println("Enter the second number:-");
        num2 = sc.nextDouble();
  //select the operand for calculation
        System.out.println("For Addtion: Press 1;  For Subtraction: Press 2;   For Multiplication: Press 3;   For Division: Press 4");
      
       
        
       
        int op = sc.nextInt();
        double o = 0;
       
  
        switch (op) {
        
        // case to add two numbers
        case 1:
  
            o = num1 + num2;
  
            break;
  
        // case to subtract two numbers
        case 2:
  
            o = num1 - num2;
        
  
            break;
  
        // case to multiply two numbers
        case 3:
  
            o = num1 * num2;
  
            break;
  
        // case to divide two numbers
        case 4:
  
            o = num1 / num2;
  
            break;
  
        default:
  
            System.out.println("You enter wrong input");
  
            break;
        }
  
        System.out.println("The final result:");
  
        System.out.println();
  
        // print the final result
        System.out.println(num1 + " " +  " " + num2
                           + " = " + o);
    }