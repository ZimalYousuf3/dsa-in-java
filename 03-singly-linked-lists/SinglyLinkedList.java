public class SinglyLinkedList {
    int data;
    SinglyLinkedList next;

    SinglyLinkedList(int data) {
        this.data = data;
        this.next = null;
    }

    public static void main(String[] args) {

        // Creating Nodes
        SinglyLinkedList head = new SinglyLinkedList(10);
        head.next = new SinglyLinkedList(20);
        head.next.next = new SinglyLinkedList(30);
        head.next.next.next = new SinglyLinkedList(40);

        SinglyLinkedList temp = head;

        // Printing the elements of the linked list
        System.out.println("Elements of the linked list:");

        while (temp != null) {

            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

}
