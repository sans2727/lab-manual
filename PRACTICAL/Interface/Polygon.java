/*in the above example we have created an interface named polygon the interface contains
 * and abstract methods get area()
 * here the rectangle class implements polygon and provide the implementation of the get area()
 * method
 * Date:- 07/10/22
 */
interface Polygon {
	
	//abstract method of interface
	
	void getArea(int length,int breadth);

}
// implement the polygon interface
class Rectangle implements Polygon {

	// implementation of abstract method.
	
	public void getArea(int length, int breadth)
	{
		System.out.println("the area of rectangle is :"+(length*breadth));
		
	}

}	