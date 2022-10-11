
 class MultiplicationTable {

	public static void main(String[] args)
	{
		int num;
		// taking values from user 
		Scanner sc = new Scanner(System.in);
		System.out.println(" Please enter number: ");
		num = sc.nextInt();
		sc.close();
		
		// using for loop
        for (int i = 1; i <= 10; i++) {
            // printing the table in proper format
            System.out.println(num + " * " + i + " = "
                               + num * i);
        }
	}
}