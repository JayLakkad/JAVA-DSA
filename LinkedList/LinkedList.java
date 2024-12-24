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
    public static int size;

    // Add a node at the beginning
    public void addFirst(int data) {
        Node newnode = new Node(data);
        size++;
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
        size++;
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
    public void addAtIndex(int index,int data)
    {
        if(index == 0)
        {
            addFirst(data);
            return;
        }
        Node newnode = new Node(data);
        size++;
        Node temp = head;
        int i =0;
        while (i <index-1)
        {
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }
    public int removeFirst()
    {
        if(size==0)
        {
            System.out.println("LinkedList is emply");
            return Integer.MIN_VALUE;
        }
        else if(size == 1)
        {
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast()
    {
        if(size == 0)
        {
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        }
        else if(size ==1)
        {
            int val = head.data;
            head = tail = null;
            return val;

        }
        Node temp = head;
        for(int i =0;i<size-2;i++)
        {
            temp = temp.next;
        }
        int val = temp.next.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }
    public int searchIterative(int val)
    {
        Node temp = head;
        int i =0;
        while(temp!=null)
        {
            if(temp.data == val)
            {
                return i ;
            }
            i++;
            temp = temp.next;
        }
        return -1;
    }
    public int helper(Node head,int val){//O(n)
        if(head == null)
        {
            return -1;

        }
        if(head.data == val){
            return 0;
        }
        int index = helper(head.next,val);
        if(index ==-1){
            return -1;
        }
        return index +1;

    }
    public int searchRecursive(int val)
    {
        return helper(head,val);
    }

    public void reverseList()
    {
        Node prev = null;
        Node curr =tail =  head;
        Node next;
        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev =curr;
            curr =next;
        }
        head = prev;
    }
    
    public void removeNthFromLast(int n){
        int sz = 0;
        Node temp = head;
        while(temp!=null)
        {
            temp = temp.next;
            sz++;
        }
        if(n==sz)
        {
            head = head.next;
            return;
        }
        int i = 1;
        int iToFind =sz-n;
        Node prev = head;
        while(i<iToFind)
        {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;

    }
    //Slow-Fast approach
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;//slow is my middle Node

    }
    public boolean checkPalindrom(){
        if(head == null || head.next == null)
        {
            return true;

        }

        //step 1: find mid
        Node midNode = findMid(head);

        //step 2: reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr !=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right= prev;//head of right half
        Node left = head;//head of left half
        //step 3: chack left and right half
        while(right != null)
        {
            if(left.data != right.data)
            {
                return false;

            }
            left= left.next;
            right = right.next;
        }
        return true;

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);
        
        // ll.addAtIndex(2, 5);
        // ll.printList();
        // System.out.println("Sixe of the list is: "+size);
        // ll.removeFirst();
        // ll.printList();
        // System.out.println("Size of the list is: "+size);
        // ll.removeLast();
        // ll.printList();
        // System.out.println("Size of the list is: "+size);
        // System.out.println(ll.searchIterative(3));
        // System.out.println(ll.searchIterative(10));
        // System.out.println(ll.searchRecursive(3));
        // System.out.println(ll.searchRecursive(10));
        // ll.reverseList();
        // ll.removeNthFromLast(2);
        ll.printList();
        System.out.println(ll.checkPalindrom());

    }
}
