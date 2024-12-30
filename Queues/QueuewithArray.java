package Queues;

public class QueuewithArray {
    static class queue{
        static int arr[];
        static int size;
        static int rear;

        queue(int n){
            arr = new int[n];
            size = n;
            rear=-1;

        }
        public  boolean isEmpty(){
            return rear ==-1;
        }
        public  void add(int data){
            if(rear == size-1){
                System.out.println("Queue is full");
                return;
            }
            arr[++rear]= data;
        }
        public  int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int temp = arr[0];
            for(int i =0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            return temp;
        }
        public  int peek()
        {
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {
           queue q = new queue(5);
           q.add(10);
           q.add(20);
           q.add(30);
           while(!q.isEmpty()){
               System.out.println(q.peek());
                q.remove();
           }

    }
}
