public class Main {

	public static void main(String[] args) {
		Queue q = new Queue();
		
		// Checking if the queue is empty
		System.out.println("Is the queue empty? " + (q.isEmpty()? " Yes " : " No "));
		
		// Adding elements in queue
		q.enqueue(10, 1);
		q.enqueue(20, 3);
		q.enqueue(30, 4);
		q.enqueue(40, 2);
		
		// Removing an element
		System.out.println("\nRemoved element: " + q.dequeue());
		
		// Peeking front element
		System.out.println("\nFront Element element: " + q.peek());
		
		// Checking if the queue is empty
		System.out.println("\nIs the queue empty? " + (q.isEmpty()? " Yes " : " No "));
	}

}
