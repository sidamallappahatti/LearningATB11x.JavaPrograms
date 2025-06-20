package ex_32_Collection_Framework_DSA.QUEUE;

import java.util.PriorityQueue;

public class Lab258_QUEUE {
    public static void main(String[] args) {
        PriorityQueue q = new PriorityQueue();
        q.add("Siddu");
        q.add("Hatti");
        q.add("Bijapur");
        q.add("Goa");
        // PQ -> Natural - Sorting

        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);

    }
}
