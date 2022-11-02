class MethodEx
{
	static void addinfo(int pin)
	{
	 System.out.println("pincode:"+pin);
	}
        String addinfo(int pin,String Ps)
	{
	  System.out.println("pincode:"+pin +"  "+"Police station:"+Ps );
	  return "Police station is very far" ;
	  
	}
	static void addinfo(int pin,String Ps,String assembly)
	{
    	   System.out.println("pincode:"+pin +"  "+"Police station:"+ Ps +"   "+"Assembly:"+ assembly);
	}
	
	public static void main (String[] args)
	{
	  MethodEx obj1=new MethodEx();
	  addinfo(421003);
	  addinfo(421003,"Thane","Kalyan");
	  System.out.println(obj1.addinfo(421004,"Mumbai"));		   
    	}
}