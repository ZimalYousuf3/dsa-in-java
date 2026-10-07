import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String [] args) {
		Queue<Integer> q = new LinkedList<>();
		
		// Checking if the queue is empty
		System.out.println("Is the queue empty? " + (q.isEmpty()? " Yes " : " No "));
		
		// Inserting Elements at rear
		q.add(10);
		q.add(20);
		q.add(30);
		
		// Removing Elements from front
		System.out.println("\nDeleted: " + q.remove());
		
		// Peeking front element
		System.out.println("\nFront Element element: " + q.peek());
		
		// Checking if the queue is empty
		System.out.println("\nIs the queue empty? " + (q.isEmpty()? " Yes " : " No "));
	}
}
