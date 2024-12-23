package LinkedList;

class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // Add a node at the beginning
    public void addFirst(int data) {
        Node newnode = new Node(data);

        if (head == null) {
            head = tail = newnode;
            return;
        }

        newnode.next = head; // Link new node to the current head
        head = newnode;      // Update head to the new node
    }

    // Add a node at the end
    public void addLast(int data) {
        Node newnode = new Node(data);

        if (head == null) {
            head = tail = newnode;
            return;
        }

        tail.next = newnode; // Link current tail to the new node
        tail = newnode;      // Update tail to the new node
    }

    // Print the linked list
    public void printList() {//Complexity : O(n)
        if (head == null) {
            System.out.println("LinkedList is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.printList();       // Should print: LinkedList is empty
        ll.addFirst(1);
        ll.printList();       // Should print: 1 -> null
        ll.addFirst(2);
        ll.printList();       // Should print: 2 -> 1 -> null
        ll.addLast(3);
        ll.printList();       // Should print: 2 -> 1 -> 3 -> null
        ll.addLast(4);
        ll.printList();       // Should print: 2 -> 1 -> 3 -> 4 -> null
    }
}
