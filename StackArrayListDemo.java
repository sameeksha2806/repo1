import java.util.ArrayList;

class GenericStackArrayList<T> {
    private ArrayList<T> stack = new ArrayList<>();

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        if (!stack.isEmpty()) {
            return stack.remove(stack.size() - 1);
        }
        return null;
    }

    public T peek() {
        if (!stack.isEmpty()) {
            return stack.get(stack.size() - 1);
        }
        return null;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}

public class StackArrayListDemo {
    public static void main(String[] args) {
        GenericStackArrayList<String> stringStack = new GenericStackArrayList<>();
        stringStack.push("Hello");
        stringStack.push("World");
        System.out.println("Popped: " + stringStack.pop());

        GenericStackArrayList<Integer> intStack = new GenericStackArrayList<>();
        intStack.push(10);
        intStack.push(20);
        System.out.println("Popped: " + intStack.pop());

        GenericStackArrayList<Double> doubleStack = new GenericStackArrayList<>();
        doubleStack.push(1.1);
        doubleStack.push(2.2);
        System.out.println("Popped: " + doubleStack.pop());
    }
}
