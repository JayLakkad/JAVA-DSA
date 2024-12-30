package Queues;

import java.util.*;

public class MyDeque {
    public static void main(String[] args) {
         Deque<Integer> deque = new LinkedList<>();
         deque.addFirst(1);
         deque.addFirst(2);
         deque.addLast(3);
         deque.addLast(4);
         System.out.println(deque);
         deque.removeFirst();
            System.out.println(deque);
    }
}
