package LinkedList;

public class DoubleLL {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next= null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //add
    public void addFirst(int data){
        Node newnode = new Node(data);
        if(head == null)
        {
            head = tail = newnode;
            size++;
            return;
        }
        newnode.next = head;
        head.prev = newnode;
        head = newnode;
        size++;
    }

    //print
    public void print(){
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data +" <--> ");
            temp = temp.next;
        }
        System.out.println("null");

    }
    //remove last
    public int removeLast(){
        if(head == null)
        {
            System.out.println("Doubly linkedlist is empty");
            return Integer.MIN_VALUE;
        }
        if(size ==1)
        {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = tail.data;
        Node last=tail.prev;
        last.next = null;
        tail = last;
        size--;
        return val;

    }
    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next ;
        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev  = curr;
            curr= next;
        }
        head = prev;
    }
    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        // System.out.println(size);
        // dll.removeLast();
        // dll.print();
        // System.out.println(size);
        dll.reverse();
        dll.print();
        
    }
}
