public class LinkedList {

    DNode head;

    LinkedList() {
        this.head = null;
    }

    void insert_at_front(int x) {
        DNode newNode = new DNode(x);

        if (head == null) {
            head = newNode;
            return; 
        }

        DNode temp = head;

        while (temp.next != head) {
            temp = temp.next;
        }

        newNode.next = head;
        head.prev = newNode;
        temp.next = newNode;
        head = newNode;
    }

    void insert_at_end(int x) {
        DNode newNode = new DNode(x);

        if (head == null) {
            head = newNode;
            return; 
        }

        DNode temp = head;

        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        newNode.next = head;
    }

    void delete_at_front() {

        if (head == null) {
            System.out.println("\nList is empty");
            return; 
        }

        if (head.next == head) {
            System.out.println("\nDeleted value: " + head.data);
            head = null;
            return;
        }

        DNode temp = head;

        while (temp.next != head) {
            temp = temp.next;
        }

        System.out.println("\nDeleted value: " + head.data);
        head = head.next;
        head.prev = temp;
        temp.next = head;
        
    }

    void delete_at_end() {

        if (head == null) {
            System.out.println("\nList is empty");
            return; 
        }

        if (head.next == head) {
            System.out.println("\nDeleted value: " + head.data);
            head = null;
            return;
        }

        DNode temp = head;

        while (temp.next != head) {
            temp = temp.next;
        }

        System.out.println("\nDeleted value: " + temp.data);
        temp = temp.prev;
        temp.next = head;
        head.prev = temp;
        
    }

    void display() {

        if (head == null) {
            System.out.println("\nList is empty");
            return; 
        }

        DNode temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        
        System.out.println();
    }
}
