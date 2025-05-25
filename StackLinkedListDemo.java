// Generic Stack using Linked List
class LinkedStack<T> {
    private class Node {
        T data;
        Node next;
        Node(T data) { this.data = data; }
    }

    private Node top = null;

    public void push(T item) {
        Node newNode = new Node(item);
        newNode.next = top;
        top = newNode;
    }

    public T pop() {
        if (top == null) {
            System.out.println("Stack Underflow!");
            return null;
        }
        T item = top.data;
        top = top.next;
        return item;
    }

    public boolean isEmpty() {
        return top == null;
    }
}

// Demo
public class StackLinkedListDemo {
    public static void main(String[] args) {
        LinkedStack<Integer> intStack = new LinkedStack<>();
        intStack.push(100);
        intStack.push(200);
        System.out.println("Popped: " + intStack.pop());

        LinkedStack<String> stringStack = new LinkedStack<>();
        stringStack.push("Java");
        stringStack.push("Generics");
        System.out.println("Popped: " + stringStack.pop());

        LinkedStack<Double> doubleStack = new LinkedStack<>();
        doubleStack.push(9.81);
        System.out.println("Popped: " + doubleStack.pop());
    }
}
