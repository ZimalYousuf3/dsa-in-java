public class LinkedList {

    Node head;

    LinkedList() {
        this.head = null;
    }

    void insert_at_front(int x) {
        Node newNode = new Node(x);

        if (head == null) {
            head = newNode;
            return; 
        }

        newNode.next = head;
        head = newNode;
    }

    void insert_at_end(int x) {
        Node newNode = new Node(x);

        if (head == null) {
            head = newNode;
            return; 
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void delete_at_front() {

        if (head == null) {
            System.out.println("List is empty");
            return; 
        }

        if (head.next == null) {
            System.out.println(" \nDeleted value: " + head.data);
            head = null;
            return;
        }

        Node deletedNode = head;
        head = head.next;
        int value = deletedNode.data;
        deletedNode = null;
        System.out.println(" \nDeleted value: " + value);
    }

    void delete_at_end() {

        if (head == null) {
            System.out.println("List is empty");
            return; 
        }

        if (head.next == null) {
            System.out.println(" \nDeleted value: " + head.data);
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }
        int value = temp.next.data;
        System.out.println(" \nDeleted value: " + value);
        temp.next = null;
    }

    void display() {

        if (head == null) {
            System.out.println("List is empty");
            return; 
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
