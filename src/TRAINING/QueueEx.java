package TRAINING;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	
	
	
	
	
	public static void main(String arg[]) {
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		queue.offer(23);
		queue.offer(24);
		
		
		System.out.println(queue);
		//queue.retainAll(queue);
		//System.out.println(queue.retainAll(queue));
		queue.clear();
		
	}

}
