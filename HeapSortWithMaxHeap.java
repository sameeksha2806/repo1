import java.util.*;

public class HeapSortWithMaxHeap {
    public static void main(String[] args) {
        int[] arr = {40, 10, 50, 20, 60, 30};

        // Step 1: Add all elements to Max-Heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : arr) {
            maxHeap.offer(num);
        }

        // Step 2: Poll elements to get sorted order (descending)
        int i = 0;
        while (!maxHeap.isEmpty()) {
            arr[i++] = maxHeap.poll();
        }

        System.out.println("Sorted array (Descending using HeapSort + MaxHeap):");
        System.out.println(Arrays.toString(arr));
    }
}
