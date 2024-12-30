package Queues;

import java.util.*;

public class QueueusingDeque {
    static class Queue{
        Deque<Integer> q = new LinkedList<>();

        public void add(int data){
            q.addLast(data);
        }
        public int remove(){
            return q.removeFirst();
        }
        public int peek(){
            return q.getFirst();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}
