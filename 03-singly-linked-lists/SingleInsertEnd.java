public class SingleInsertEnd {
    int data;
    SingleInsertEnd next;

    SingleInsertEnd(int data) {
        this.data = data;
        this.next = null;
    }

    public static void main(String[] args) {

        // Creating Nodes
        SingleInsertEnd head = new SingleInsertEnd(10);
        SingleInsertEnd first = new SingleInsertEnd(20);
        SingleInsertEnd second = new SingleInsertEnd(30);
        SingleInsertEnd tail = new SingleInsertEnd(40);

        // Linking Nodes
        head.next = first;
        first.next = second;
        second.next = tail;

        SingleInsertEnd temp = head;

        // Printing the elements of the linked list
        System.out.println("Elements of the linked list:");

        while (temp != null) {

            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        SingleInsertEnd newNode = new SingleInsertEnd(50);
        tail.next = newNode;
        tail = newNode;
        
        temp = head;

        // Printing the elements of the linked list after insertion at the end
        System.out.println("\nElements of the linked list after insertion:");

        while (temp != null) {

            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }

}

