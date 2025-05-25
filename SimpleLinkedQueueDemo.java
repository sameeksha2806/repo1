class SimpleLinkedQueue<T> {
    class Node {
        T data;
        Node next;
        Node(T data) { this.data = data; }
    }

    Node front = null, rear = null;

    public void enqueue(T item) {
        Node newNode = new Node(item);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public T dequeue() {
        if (front == null) {
            System.out.println("Queue is empty!");
            return null;
        }
        T item = front.data;
        front = front.next;
        if (front == null) rear = null;
        return item;
    }
}

// Demo
public class SimpleLinkedQueueDemo {
    public static void main(String[] args) {
        SimpleLinkedQueue<Integer> queue = new SimpleLinkedQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        System.out.println(queue.dequeue()); // 1
    }
}
