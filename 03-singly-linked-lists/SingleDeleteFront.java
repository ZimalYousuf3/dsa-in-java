public class SingleDeleteFront {
    int data;
    SingleDeleteFront next;

    SingleDeleteFront(int data) {
        this.data = data;
        this.next = null;
    }

    public static void main(String[] args) {

        // Creating Nodes
        SingleDeleteFront head = new SingleDeleteFront(10);
        SingleDeleteFront first = new SingleDeleteFront(20);
        SingleDeleteFront second = new SingleDeleteFront(30);
        SingleDeleteFront tail = new SingleDeleteFront(40);

        // Linking Nodes
        head.next = first;
        first.next = second;
        second.next = tail;

        SingleDeleteFront temp = head;

        // Printing the elements of the linked list
        System.out.println("Elements of the linked list:");

        while (temp != null) {

            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        // Deleting the first node
        head = head.next;

        temp = head;

        // Printing the elements of the linked list after deletion
        System.out.println("\nElements of the linked list after deletion:");

        while (temp != null) {

            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }

}


