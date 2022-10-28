package collections_framework;

import java.util.*;

 class Priority_Queue {

	public static void main(String[] args) {
		//using linked list class to create queue
		Queue<Integer> obj1=new PriorityQueue<>();
				
		//offer element to the queue act as add 
		obj1.offer(23);
		obj1.offer(24);
		obj1.offer(25);
		System.out.println("Queue is:"+obj1);
		//access element of queue using peek method
		int a = obj1.peek();
		System.out.println("access element:"+a);
		//remove element from the queue using poll() method
		int j=obj1.poll();
		System.out.println("removed element:"+j);
		System.out.println("Updated Queue is :"+obj1);

	}

}
