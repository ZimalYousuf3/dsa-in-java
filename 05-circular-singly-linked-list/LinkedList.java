public class LinkedList {

    Node head;

    LinkedList() {
        this.head = null;
    }

    void insert_at_front(int x) {
        Node newNode = new Node(x);

        if (head == null) {
            head = newNode;
            newNode.next = head;
            return; 
        }

        Node temp = head;

        while (temp.next != head) {
            temp = temp.next;
        }

        newNode.next = head;
        head = newNode;
        temp.next = head;
    }

    void insert_at_end(int x) {
        Node newNode = new Node(x);

        if (head == null) {
            head = newNode;
            return; 
        }

        Node temp = head;

        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }

    void delete_at_front() {

        if (head == null) {
            System.out.println("List is empty");
            return; 
        }

        if (head.next == head) {
            System.out.println(" \nDeleted value: " + head.data);
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next != head) {
            temp = temp.next;
        }

        System.out.println(" \nDeleted value: " + head.data);
        head = head.next;
        temp.next = head;
    }

    void delete_at_end() {

        if (head == null) {
            System.out.println("List is empty");
            return; 
        }

        if (head.next == head) {
            System.out.println(" \nDeleted value: " + head.data);
            head = null;
            return;
        }

        Node temp = head;

        while (temp.next.next != head) {
            temp = temp.next;
        }

        System.out.println(" \nDeleted value: " + temp.next.data);
        temp.next = head;
    }

    void display() {

        if (head == null) {
            System.out.println("List is empty");
            return; 
        }

        Node temp = head;

        do{
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
}