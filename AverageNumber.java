class AverageNumber
{
	public static void main(String[] args)
	{
	int No_of_employee=3;
	int average_salary=10000;
	int total_average_salary=No_of_employee*average_salary;
	int one_emplyoee_earns=11000;
	int other_emplyoee_earns=5000;
	int third_emplyoee_earns=total_average_salary-(one_emplyoee_earns+other_emplyoee_earns);

System.out.println("Total average salary of 3 employees:  " +total_average_salary);

System.out.println("first employee earns:  "  +one_emplyoee_earns);

System.out.println("second employee earns:  "  +other_emplyoee_earns);

System.out.println("Third employee earns:  "  +third_emplyoee_earns);

}

}