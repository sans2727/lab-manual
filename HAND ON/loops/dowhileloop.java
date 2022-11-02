
//program to demonstrate (do-while)and print the reverse counting from the user input number. 

class DoWhileLoop {

	public static void main(String[] args)
	{
		int num,i,reversed = 30;
	    // taking values from user at run time
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the any Numbers: ");
	   num = sc.nextInt();
	   
	   sc.close();
	   //condition for printing reverse of given numbers
	   do{
		    i=num%10;
		    reversed=reversed*10+i;
		    num=num/10;
		}
	   while(num>30);
		
		System.out.println("Reverse of the number is: "+reversed);
	   
	}

}