import java.util.Scanner;
 class do whileloop 
{

	public static void main(String[] args) {
		{
        Scanner sc = new Scanner(System.in);
        int sum = 0;
		 int num = 0; 
		    
		    do
		    {
		      
		      sum += num;
		      System.out.print("Enter a number");
		      num = sc.nextInt();
		    }
		    while(num >= 0); 
			   
		    System.out.println("Sum = " + sum);
		    sc.close();
		   
		  }
	}
		
	}

