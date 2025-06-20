package ex_32_Collection_Framework_DSA.QUEUE;

import java.util.ArrayDeque;
import java.util.Deque;

public class Lab260_ARRAY_Deque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque();
        deque.push(15);
        deque.push(07);

        System.out.println(deque);
    }
}
