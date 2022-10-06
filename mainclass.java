package labsession6;

public class MainClass 
{
	public static void main(String[] args) 
	{

	    // create an object of the subclass
	    Child c1 = new Child();
	    Child c2 = new Child();

	    // access field of superclass
	    c1.name = "Bhakti";
	    c1.display();

	    // call method of superclass
	    // using object of subclass
	   c1.home();
	   
	   c2.name = "Pooja";
	   c2.display();
	   c2.home();

	  }

}