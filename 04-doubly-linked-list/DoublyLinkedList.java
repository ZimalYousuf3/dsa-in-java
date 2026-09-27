public class DoublyLinkedList {
    int data;
    DoublyLinkedList next;
    DoublyLinkedList prev;

    DoublyLinkedList(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public static void main(String[] args) {

        // Creating Nodes
        DoublyLinkedList first = new DoublyLinkedList(10);
        DoublyLinkedList second = new DoublyLinkedList(20);
        DoublyLinkedList third = new DoublyLinkedList(30);
        DoublyLinkedList fourth = new DoublyLinkedList(40);

        // Setting the previous pointers
        first.prev = null;
        second.prev = first;
        third.prev = second;
        fourth.prev = third;

        // Setting the next pointers
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;

        DoublyLinkedList temp = first;

        // Printing the elements of the linked list
        System.out.println("Elements of the linked list:");

        while (temp != null) {

            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        temp = fourth;

        System.out.println("\nElements of the linked list in reverse order:");

        while (temp != null) {
            
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
    }
}
