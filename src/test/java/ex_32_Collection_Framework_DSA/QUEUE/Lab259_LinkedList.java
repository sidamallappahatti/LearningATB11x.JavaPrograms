package ex_32_Collection_Framework_DSA.QUEUE;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Lab259_LinkedList {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList();
        queue.add(6);
        queue.add(7);
        queue.add(3);

        Iterator<Integer> iterator = queue.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println(value);
        }
    }
}
