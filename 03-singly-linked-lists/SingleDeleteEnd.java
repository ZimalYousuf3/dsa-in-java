public class SingleDeleteEnd {
    int data;
    SingleDeleteEnd next;

    SingleDeleteEnd(int data) {
        this.data = data;
        this.next = null;
    }

    public static void main(String[] args) {

        // Creating Nodes
        SingleDeleteEnd head = new SingleDeleteEnd(10);
        SingleDeleteEnd first = new SingleDeleteEnd(20);
        SingleDeleteEnd second = new SingleDeleteEnd(30);
        SingleDeleteEnd tail = new SingleDeleteEnd(40);

        // Linking Nodes
        head.next = first;
        first.next = second;
        second.next = tail;

        SingleDeleteEnd temp = head;

        // Printing the elements of the linked list
        System.out.println("Elements of the linked list:");

        while (temp != null) {

            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        // Deleting the end node
        second.next = null;
        tail = second;

        temp = head;

        // Printing the elements of the linked list after deletion
        System.out.println("\nElements of the linked list after deletion:");

        while (temp != null) {

            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }

}


