import java.util.ArrayList;

class GenericQueueArrayList<T> {
    private ArrayList<T> queue = new ArrayList<>();

    public void enqueue(T item) {
        queue.add(item); // Add at the end
    }

    public T dequeue() {
        if (!queue.isEmpty()) {
            return queue.remove(0); // Remove from the front
        }
        return null;
    }

    public T peek() {
        if (!queue.isEmpty()) {
            return queue.get(0);
        }
        return null;
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}

public class QueueArrayListDemoo {
    public static void main(String[] args) {
        GenericQueueArrayList<String> stringQueue = new GenericQueueArrayList<>();
        stringQueue.enqueue("Hello");
        stringQueue.enqueue("World");
        System.out.println("Dequeued: " + stringQueue.dequeue());

        GenericQueueArrayList<Integer> intQueue = new GenericQueueArrayList<>();
        intQueue.enqueue(10);
        intQueue.enqueue(20);
        System.out.println("Dequeued: " + intQueue.dequeue());

        GenericQueueArrayList<Double> doubleQueue = new GenericQueueArrayList<>();
        doubleQueue.enqueue(1.1);
        doubleQueue.enqueue(2.2);
        System.out.println("Dequeued: " + doubleQueue.dequeue());
    }
}
