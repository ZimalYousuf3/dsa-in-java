public class Main {
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
