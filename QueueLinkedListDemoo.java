import java.util.LinkedList;

class GenericQueueLinkedList<T> {
    private LinkedList<T> queue = new LinkedList<>();

    public void enqueue(T item) {
        queue.addLast(item); // Add to the end
    }

    public T dequeue() {
        if (queue.isEmpty()) {
            return null;
        } else {
            return queue.removeFirst(); // Remove from front
        }
    }

    public T peek() {
        if (queue.isEmpty()) {
            return null;
        } else {
            return queue.getFirst();
        }
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}

public class QueueLinkedListDemoo {
    public static void main(String[] args) {
        GenericQueueLinkedList<String> stringQueue = new GenericQueueLinkedList<>();
        stringQueue.enqueue("Foo");
        stringQueue.enqueue("Bar");
        System.out.println("Dequeued: " + stringQueue.dequeue());

        GenericQueueLinkedList<Integer> intQueue = new GenericQueueLinkedList<>();
        intQueue.enqueue(100);
        intQueue.enqueue(200);
        System.out.println("Dequeued: " + intQueue.dequeue());

        GenericQueueLinkedList<Double> doubleQueue = new GenericQueueLinkedList<>();
        doubleQueue.enqueue(3.14);
        doubleQueue.enqueue(2.71);
        System.out.println("Dequeued: " + doubleQueue.dequeue());
    }
}
