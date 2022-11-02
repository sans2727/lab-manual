//program to demonstrate(switch)and printing week days
package Operators_ex;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the day number( 1to6):"); //enter number which day you print
		int days=sc.nextInt();
		
		//using swich case
		switch( days){
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
	        break;
	    default:
	    	System.out.println("yayy..!! its sunday...Enjoy holiday..!!");
			
		}
		
		
	}

}