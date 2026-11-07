public class Stack {
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
