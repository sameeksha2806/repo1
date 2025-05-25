import java.util.LinkedList;

class GenericStackLinkedList<T> {
    private LinkedList<T> stack = new LinkedList<>();

    public void push(T item) {
        stack.addFirst(item); // Stack: push to top
    }

    public T pop() {
        if (stack.isEmpty()) {
            return null;
        } else {
            return stack.removeFirst();
        }
    }

    public T peek() {
        if (stack.isEmpty()) {
            return null;
        } else {
            return stack.getFirst();
        }
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}

public class StackLinkedListDemoo {
    public static void main(String[] args) {
        GenericStackLinkedList<String> stringStack = new GenericStackLinkedList<>();
        stringStack.push("Foo");
        stringStack.push("Bar");
        System.out.println("Popped: " + stringStack.pop());

        GenericStackLinkedList<Integer> intStack = new GenericStackLinkedList<>();
        intStack.push(100);
        intStack.push(200);
        System.out.println("Popped: " + intStack.pop());

        GenericStackLinkedList<Double> doubleStack = new GenericStackLinkedList<>();
        doubleStack.push(3.14);
        doubleStack.push(1.618);
        System.out.println("Popped: " + doubleStack.pop());
    }
}
