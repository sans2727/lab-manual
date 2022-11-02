package Casting;

public class Player_Main {

	public static void main(String[] args) {

		
		Player p1= new Cricketer();
		
		p1.jersey();
		p1.stadium();
		
		if(p1 instanceof Cricketer)
		{
			((Cricketer) p1).Batting();
			((Cricketer) p1).balling();
		}
		
	   p1=new Footballer();
	   p1.jersey();
	   p1.stadium();
	   
	   if(p1 instanceof Footballer)
	   {
		   ((Footballer) p1).defence();
		   ((Footballer) p1).goal();
	   }

	}

}


-