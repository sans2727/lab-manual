/*Write a Java program to change priorityQueue to maximum priorityqueue.*/
import java.util.*;
  public class priorityqueue{
  public static void main(String[] args) {
  PriorityQueue<Integer> pq1 = new PriorityQueue<>(10, Collections.reverseOrder());
      
   // Add numbers in the Queue
   pq1.add(10);
   pq1.add(22);
   pq1.add(36);
   pq1.add(25);
   pq1.add(16);
  
   System.out.println("\nOriginal Priority Queue: "+pq1);

System.out.print("\nMaximum Priority Queue: ");
Integer val = null;
while( (val = pq1.poll()) != null) {
    System.out.print(val+"  ");
      }
	  System.out.print("\n");
  }
}

