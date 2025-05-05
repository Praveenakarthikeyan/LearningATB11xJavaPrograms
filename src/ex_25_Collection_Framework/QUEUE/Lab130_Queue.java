package ex_25_Collection_Framework.QUEUE;

import java.util.PriorityQueue;

public class Lab130_Queue {
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue();
        q.add("Seyon");
        q.add("Minnoli");
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
    }
}
