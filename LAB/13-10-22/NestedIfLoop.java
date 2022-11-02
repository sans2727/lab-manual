 class NestedIfLoop {

	public static void main(String[] args) 
	{
       int percentage;
       Scanner sc = new Scanner(System.in);
  	   System.out.println("Enter the percentage: ");
  	   percentage = sc.nextInt();
  	   sc.close();
  	   
  	   if(percentage>=85)
  	   {
  		   System.out.println("If percentage:-" +percentage+ " "+"Grade A");
  	   }
  	   else if(percentage>=75)
	   {
		   System.out.println("If percentage:-" +percentage+ " "+"Grade A1");
	   }
  	 else if(percentage>=65)
	   {
		   System.out.println("If percentage:-" +percentage+ " "+"Grade B");
		   
	   }

  	else if(percentage>=45)
	   {
		   System.out.println("If percentage:-" +percentage+ " "+"Grade C");
	   }
  	   
  	else if(percentage>=35)
	   {
		   System.out.println("If percentage:-" +percentage+ " "+"Grade c");
	   }
  	else if(percentage<35)
	   {
		   System.out.println("If percentage:-" +percentage+ " "+"Fail");
	   }  
  	
	}

}

