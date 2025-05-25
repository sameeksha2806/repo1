import java.util.*;

public class MinMaxHeapDemo {
    public static void main(String[] args) {
        // Min Priority Queue (default)
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();
        // Max Priority Queue using reverse order
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());

        int[] values = {40, 10, 20, 60, 30};

        for (int val : values) {
            minPQ.offer(val);
            maxPQ.offer(val);
        }

        System.out.println("Min Priority Queue (Min Heap):");
        while (!minPQ.isEmpty()) {
            System.out.print(minPQ.poll() + " ");
        }

        System.out.println("\nMax Priority Queue (Max Heap):");
        while (!maxPQ.isEmpty()) {
            System.out.print(maxPQ.poll() + " ");
        }
    }
}
