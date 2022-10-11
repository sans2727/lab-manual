 class Student {
    public static void main(String[] args) {
        System.out.println("Enter the marks of five subjects::\n");

        // To store the values of five subjects
        int sub_1 = sc.nextInt();
        int sub_2 = sc.nextInt();;
        int sub_3 = sc.nextInt();
        int sub_4 = sc.nextInt();
        int sub_5 = sc.nextInt();
        int total;
        int percentage;
       

        // Calculate total and percentage
        total = sub_1 + sub_2 + sub_3 + sub_4 + sub_5;
       
        percentage = (int)((total / 500.0) * 100);

        // printing you are pass or not
        if (percentage >=60)
        {
          System.out.println("You Are pass");
        }
        else
        {
           System.out.println("Your are Fail");
        }

        
    }
}