package Queues;
import java.util.*;
public class QueuewithJCF {
    public static void main(String[] args) {
        // Queue<Integer>q= new LinkedList<>();//using LinkedList
        Queue<Integer>q=new ArrayDeque<>();//using Arrays
        q.add(10);
        q.add(20);
        q.add(30);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
