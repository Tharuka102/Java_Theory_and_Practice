package Java_Collection_Framework_Demo.src;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Add elements to the queue.
        queue.offer("First");
        queue.offer("Second");
        queue.offer("Third");

        System.out.println("Queue: " + queue);

        // Remove the head element.
        System.out.println("Removed: " + queue.poll());
        System.out.println("After removal: " + queue);
    }
}
