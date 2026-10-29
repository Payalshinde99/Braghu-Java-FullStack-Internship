import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueuePrograms {

    public static void main(String[] args) {

        // Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        queue.offer("Payal");
        queue.offer("Rahul");
        queue.offer("Priya");

        System.out.println("Queue: " + queue);

        // Peek first element
        System.out.println("Front: " + queue.peek());

        // Remove first element
        System.out.println("Removed: " + queue.poll());

        System.out.println("Queue after poll: "
                + queue);


        // PriorityQueue example
        PriorityQueue<Integer> pq =
                new PriorityQueue<>();

        pq.offer(30);
        pq.offer(10);
        pq.offer(20);
        pq.offer(5);

        System.out.println("\nPriorityQueue:");

        while (!pq.isEmpty()) {

            System.out.println(pq.poll());
        }
    }
}