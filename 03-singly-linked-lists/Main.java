public class Main {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        // Creating nodes
        Node node_1 = new Node(20);
        Node node_2 = new Node(30);
        Node node_3 = new Node(40);

        // Linking nodes
        list.head = node_1;
        node_1.next = node_2;
        node_2.next = node_3;

        // Displaying the linked list
        System.out.println(" \nLinked List: ");
        list.display();

        // Inserting nodes at the front
        list.insert_at_front(10);

        // Inserting nodes at the end
        list.insert_at_end(50);

        // Displaying the linked list after insertions
        System.out.println(" \nLinked List after insertions: ");
        list.display();

        // Deleting nodes from the front
        list.delete_at_front();

        // Deleting nodes from the end
        list.delete_at_end();

        // Displaying the linked list after deletions
        System.out.println(" \nLinked List after deletions: ");
        list.display();

    }
}