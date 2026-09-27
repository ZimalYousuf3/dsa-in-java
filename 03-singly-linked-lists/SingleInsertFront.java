public class SingleInsertFront {
    int data;
    SingleInsertFront next;

    SingleInsertFront(int data) {
        this.data = data;
        this.next = null;
    }

    public static void main(String[] args) {

        // Creating Nodes
        SingleInsertFront head = new SingleInsertFront(10);
        head.next = new SingleInsertFront(20);
        head.next.next = new SingleInsertFront(30);
        head.next.next.next = new SingleInsertFront(40);

        SingleInsertFront temp = head;

        // Printing the elements of the linked list
        System.out.println("Elements of the linked list:");

        while (temp != null) {

            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        SingleInsertFront newNode = new SingleInsertFront(5);
        newNode.next = head;
        head = newNode;

        temp = head;

        // Printing the elements of the linked list after insertion
        System.out.println("\nElements of the linked list after insertion:");

        while (temp != null) {

            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

}

