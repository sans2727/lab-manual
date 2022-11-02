package Encapsulation;

public class Sales_dept {
	
	String dept_head;
	int no_of_employees;
	private int profit;
	private int loss;
	private int stock;
	
	public Sales_dept(String dept_head, int no_of_employees) {
		this.dept_head = dept_head;
		this.no_of_employees = no_of_employees;
		System.out.println("Dept head:"+dept_head+"    "+"Number of employees in dept:"+ no_of_employees);
	}

	public int getProfit() {
		return profit;
	}

	public void setProfit(int profit) {
		this.profit = profit;
	}

	public int getLoss() {
		return loss;
	}

	public void setLoss(int loss) {
		this.loss = loss;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	

}