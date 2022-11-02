

package Collections_codes;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Iterator {

	public static void main(String[] args) {
		
		ArrayList<String> Flowers=new ArrayList<>();
		//using add method
		Flowers.add("Rose");
		Flowers.add("Mogra");
		Flowers.add("Lotus");
		Flowers.add("sunflower");
		
		System.out.println("ArrayList of flowers are:"+Flowers);
		
		//calling iterator() method

		Iterator<String>obj2=Flowers.iterator();
		System.out.println("Flowers using iterator:");
		while(obj2.hasNext())
		{
			System.out.print(obj2.next()+",");
		}

	}

}