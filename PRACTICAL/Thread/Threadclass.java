Date:7-11-22 
package thread;
/*
 * If a class extends the Thread class,
 *  the thread can be run by creating an instance of the class
 *  and call its start() method.
  */
 class Main extends Thread
 {
	public static void main(String[] args)
	{
	Main thread=new Main(); // creating object of class Main
	thread.start();
	System.out.println("This code is outside of the thread");

	}
	public void run()
	{
		System.out.println("This code is running in the thread");
	}

}


