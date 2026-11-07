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

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    void insert_at_end(int x) {
        DNode newNode = new DNode(x);

        if (head == null) {
            head = newNode;
            return; 
        }

        DNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    void delete_at_front() {

        if (head == null) {
            System.out.println("\nList is empty");
            return; 
        }

        if (head.next == null) {
            System.out.println("\nDeleted value: " + head.data);
            head = null;
            return;
        }

        DNode deletedNode = head;
        head = head.next;
        head.prev = null;
        int value = deletedNode.data;
        deletedNode = null;
        System.out.println("\nDeleted value: " + value);
    }

    void delete_at_end() {

        if (head == null) {
            System.out.println("\nList is empty");
            return; 
        }

        if (head.next == null) {
            System.out.println("\nDeleted value: " + head.data);
            head = null;
            return;
        }

        DNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        int value = temp.data;
        temp = temp.prev;
        temp.next = null;
        System.out.println("\nDeleted value: " + value);
        
    }

    void display() {

        if (head == null) {
            System.out.println("\nList is empty");
            return; 
        }

        DNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}