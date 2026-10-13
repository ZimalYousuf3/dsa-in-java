class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Stack {
    Node top;

    Stack () {
        top = null;
    }

    // Function for inserting element in stack
    void push (int x) {
        Node temp = new Node(x);
        temp.next = top;
        top = temp;
    }

    // Function for removing element from stack
    int pop () {
        
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        
        Node temp = top;
        top = top.next;
        int value = temp.data;
        temp = null;
        return value;
    }

    // Function for checking if stack is empty
    boolean isEmpty () {

        return top == null;

    }

    // Function for returning top element in stack
    int peek () {
        
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        
        return top.data;
    }

    // Function for returning size of stack
    int size() {

        int count = 0;
        Node temp = top;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
        
    }
}

class StackUsingLinkedList {
    public static void main(String[] args) {
        Stack s1 = new Stack();

        // Pushing elements to stack
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);

        // Displaying top element of stack
        System.out.println("\nTop element: " + s1.peek());
        
        // Popping elements from stack
        System.out.println("\nPopped element: " + s1.pop());
        
        // Displaying top element of stack after pop
        System.out.println("\nTop element after pop: " + s1.peek());
        
        // Checking if stack is empty
        System.out.println("\nIs stack empty? " + (s1.isEmpty() ? "Yes" : "No"));
        
        // Checking size of stack
        System.out.println("\nSize of stack: " + s1.size());
    }
}
