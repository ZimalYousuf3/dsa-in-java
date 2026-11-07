public class Queue {
	
	Node front;
	Node rear;

	Queue() {
		front = null;
		rear = null;
	}
	
	// Adding elements at correct position according to priority
	void enqueue(int data, int priority) {
		
		Node newNode = new Node(data, priority);
		
		// Queue is empty
		if(front == null) {
			
			front = newNode;
			rear = newNode;
			
			return;
		}
		
		// New node has highest priority
		if (priority < front.priority) {
			
			newNode.next = front;
			front = newNode;
			
			return;
		}

		// New node has lowest priority
        if (priority > rear.priority) {
            rear.next = newNode;
            rear = newNode;
        }
		
		// Find correct position
		Node temp = front;
		
		while(temp.next != null && temp.next.priority <= priority) {
			temp = temp.next;
		}
		
		newNode.next = temp.next;
		temp.next = newNode;
		
		// New node reached the rear
		if (newNode.next == null) {
			rear = newNode;
		}
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
