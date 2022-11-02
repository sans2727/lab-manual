class Bank
{  
int getRateOfInterest()
{
return 0;
}  
}  
 
class SBI extends Bank
{  
int getRateOfInterest()
{
return 10;
}  
}  
class AXIS extends Bank
{  
int getRateOfInterest()
{
return 6;
}  
}  

class Test
{  
public static void main(String args[])
{  
SBI s=new SBI();  
AXIS a=new AXIS();  
System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  
System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());  
}  
}  