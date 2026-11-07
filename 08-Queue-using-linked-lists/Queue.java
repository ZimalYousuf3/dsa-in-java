public class Queue {
	
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

    // Displaying the queue
    void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        Node temp = front;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
	
}