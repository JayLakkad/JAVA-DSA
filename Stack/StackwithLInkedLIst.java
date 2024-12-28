package Stack;

public class StackwithLInkedLIst {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next= null;
        }
    }
    public static class stack{
        static Node head=null;
        public  boolean isEmpty(){
            return head == null;
        }
        public  void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
            }
            else{
                newNode.next= head;
                head = newNode;
            }
        }
        public  int pop(){
            if(isEmpty()){
                return -1;
            }
            else{
                int top = head.data;
                head = head.next;
                return top;
            }
        }
        public  int peek(){
            if(isEmpty()){
                return -1;
            }
            else{
                return head.data;
            }
        }
        public static void main(String[] args) {
            stack s = new stack();
            System.out.println(s.isEmpty());
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);
            s.push(5);
            System.out.println(s.peek());
            System.out.println(s.pop());
            System.out.println(s.pop());
            System.out.println(s.peek());

        }
    }
}

