package encapsulation;

 class Main_Encapsulation {

	 public static void main(String[] args) {
		 
		  // calling setter method using object of class
		 
		 Encapsulation e1 = new Encapsulation();
		 e1.setId(101);
		 e1.setName("ravi");
		 e1.setAge(27);
		 
		// calling getter method using object of class
		 
		 System.out.println("id is :-"+ e1.getId());
		 System.out.println("name is :-"+ e1.getName());
		 System.out.println("age is :-"+ e1.getAge());
		

	}

}