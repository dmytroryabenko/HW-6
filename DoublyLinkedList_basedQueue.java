package HW_6;

import java.util.LinkedList;
import java.util.Queue;

public class DoublyLinkedList_basedQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        System.out.println("Queue is Empty: " + queue.isEmpty());

        queue.add("10");
        queue.add("20");
        queue.add("30");
        queue.add("40");
        queue.add("50");
        queue.add("60");
        queue.add("70");

        System.out.println(queue);
        System.out.println("Size of queue: " + queue.size() + " elements");
        System.out.println("First in First Out: ");
        while (!queue.isEmpty()) {
            System.out.println(queue.remove() + " ");
        }
    }
}

