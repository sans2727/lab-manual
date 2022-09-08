class PrimeNumber
{
  public static void main(String[] args) 
  {
    java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.println("Enter a no: ");
    int num = sc.nextInt();
    boolean flag = false;
    for (int i = 2; i <= num / 2; ++i) 
    {
      if (num % i == 0) 
      {
        flag = true;
       break;
     }
    }
    if (!flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }
} 
