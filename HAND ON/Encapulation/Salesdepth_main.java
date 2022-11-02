package Encapsulation;

public class Sales_dept_main {

	public static void main(String[] args) {
		
		Sales_dept s=new Sales_dept("Mr.Raju Shrivastav",25);
		System.out.println();
		
		s.setStock(300);
		s.setProfit(10000);
		s.setLoss(2000);
		
		System.out.println("Stock in dept:"+s.getStock()+" boxes");
		System.out.println("profit value:"+s.getProfit()+" rs");
		System.out.println("loss value :"+s.getLoss()+" rs");

	}

}