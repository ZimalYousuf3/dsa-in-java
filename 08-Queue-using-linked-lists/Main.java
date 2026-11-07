public class Main {
    public static void main(String[] args) {
		Queue q = new Queue();
		
		// Checking if the queue is empty
		System.out.println("Is the queue empty? " + (q.isEmpty()? " Yes " : " No "));
		
		// Adding elements in queue
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);

        // Displaying the queue
        System.out.println("\nQueue elements: ");
        q.display();
		
		// Removing an element
		System.out.println("\nRemoved element: " + q.dequeue());
		
		// Displaying the queue after removal
		System.out.println("\nQueue elements after removal: ");
		q.display();
		
		// Peeking front element
		System.out.println("\nFront element: " + q.peek());
		
		// Checking if the queue is empty
		System.out.println("\nIs the queue empty? " + (q.isEmpty()? " Yes " : " No "));
	}
}
