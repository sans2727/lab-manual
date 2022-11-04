/*Write a Program on NullPointerException*/
Date:4-11-22
package Exceptions;

public class NullPointer {

	public static void main(String[] args) {
		 try{    
			 // Setting s as null
             String s=null;  
             System.out.println(s.length());  
            }    
            catch(NullPointerException  e)  
               {  
                System.out.println("NullPointerException String S is Null");  
               }             
            System.out.println("rest of the code");      
	}

}