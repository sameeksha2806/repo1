class SimpleArrayQueue<T> {
    private Object[] data;
    private int front = 0, rear = 0, size = 0;

    public SimpleArrayQueue(int capacity) {
        data = new Object[capacity];
    }

    public void enqueue(T item) {
        if (size == data.length) {
            System.out.println("Queue is full!");
            return;
        }
        data[rear++] = item;
        size++;
    }

    public T dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return null;
        }
        T item = (T) data[front++];
        size--;
        return item;
    }
}

// Demo
public class SimpleArrayQueueDemo {
    public static void main(String[] args) {
        SimpleArrayQueue<String> queue = new SimpleArrayQueue<>(3);
        queue.enqueue("A");
        queue.enqueue("B");
        System.out.println(queue.dequeue()); // A
    }
}
