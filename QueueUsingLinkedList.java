
class Node {
	
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}

}


class Queue {
	
	Node front;
	Node rear;
	
	public Queue() {
		front = null;
		rear = null;
	}
	
	// Adding elements at the end
	void enqueue(int x) {
	
		Node temp = new Node(x);
		
		if(isEmpty()) {
			front = rear = temp;
		}

		rear.next = temp ;
		rear = temp ;
	}
	
	// Removing elements from front
	int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue Underflow");
			return -1;
		}
		Node temp = front ;
		front = front.next ;
		int value = temp.data;
		temp = null;
		return value;
	}
	
	// Checking front element
	int peek() {
		if(front == null) {
			System.out.println("Queue is empty.");
			return -1;
		}
		return front.data;
	}
	
	// Checking if queue is empty or not
	boolean isEmpty() {
		return (front == null);
	}
	
}

class Main {

	public static void main(String[] args) {
		Queue q = new Queue();
		
		// Checking if the queue is empty
		System.out.println("Is the queue empty? " + (q.isEmpty()? " Yes " : " No "));
		
		// Adding elements in queue
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		
		// Removing an element
		System.out.println("\nRemoved element: " + q.dequeue());
		
		// Peeking front element
		System.out.println("\nFront Element element: " + q.peek());
		
		// Checking if the queue is empty
		System.out.println("\nIs the queue empty? " + (q.isEmpty()? " Yes " : " No "));
	}

}


