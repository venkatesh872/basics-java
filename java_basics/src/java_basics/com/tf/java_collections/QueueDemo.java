package java_basics.com.tf.java_collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		PriorityQueue q = new PriorityQueue();

		// adding elements add() offer()

		q.add(123);
		q.add(145);
		q.add(13456);
		q.add(153);
		q.offer(678.788);

		System.out.println(q);

		// get head element element() peek()

		System.out.println(q.element());// if empty returns nosuchelement exception
		System.out.println(q.peek());  // if empty returns null
		
		//return & remove elements from queue remove() poll()
		
		System.out.println(q.remove()); // if empty returns nosuchelement exception
		System.out.println(q);
		System.out.println(q.poll());   // if empty returns null
		
		//Iterator method
		
		Iterator it = q.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}

	}

}
