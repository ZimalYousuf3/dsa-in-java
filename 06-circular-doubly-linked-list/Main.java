public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        // Creating nodes
        DNode node_1 = new DNode(20);
        DNode node_2 = new DNode(30);
        DNode node_3 = new DNode(40);

        // Linking nodes
        list.head = node_1;
        node_1.next = node_2;
        node_2.next = node_3;
        node_3.next = list.head;  // Making it circular

        node_3.prev = node_2;
        node_2.prev = node_1;
        node_1.prev = node_3;  // Making it circular

        // Displaying the linked list
        System.out.println("\nInitial linked list:");
        list.display();

        // Inserting nodes at the front
        list.insert_at_front(10);

        // Inserting nodes at the end
        list.insert_at_end(50);

        // Displaying the linked list after insertions
        System.out.println("\nLinked list after insertions:");
        list.display();

        // Deleting nodes from the front
        list.delete_at_front();

        // Deleting nodes from the end
        list.delete_at_end();

        // Displaying the linked list after deletions
        System.out.println("\nLinked list after deletions:");
        list.display();

    }
}
