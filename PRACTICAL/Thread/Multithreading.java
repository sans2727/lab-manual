Date:7-11-22
package test;
public class Examplel implements Runnable{

public static void main(String[] args) {
Thread Example1 = new Thread("Demo1"); 
Thread Example2 = new Thread("Demo2");
Example1.start(); 
Example2.start();
System.out.println("Thread names are following: "); 
System.out.println(Example1.getName());
System.out.println(Example2.getName());  
}
 @Override 
public void run() {
}
}