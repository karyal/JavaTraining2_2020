package collections.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		Queue<String> pqueue = new PriorityQueue<>(); 
		pqueue.add("SUN");
		pqueue.add("MON");
		pqueue.add("TUE");
		pqueue.add("WED");
		pqueue.add("THU");
		pqueue.add("FRI");
		pqueue.add("SAT");
		System.out.println(pqueue.size());
		System.out.println(pqueue.element());
		System.out.println(pqueue.peek());
		System.out.println(pqueue.poll());
		pqueue.remove();
		System.out.println(pqueue.size());
	}

}
