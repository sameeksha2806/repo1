import java.util.*;

public class MaxHeapWithPriorityQueue {
    public static void main(String[] args) {
        // Max-Heap using reverse order
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Add elements
        maxHeap.offer(5);
        maxHeap.offer(15);
        maxHeap.offer(10);
        maxHeap.offer(30);

        // Remove and print elements in descending order
        System.out.println("Max-Heap (using PriorityQueue):");
        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " ");
        }
    }
}
