// Generic Stack using Arrays
class ArrayStack<T> {
    private T[] stack;
    private int top;
    private int capacity;


    public ArrayStack(int size) {
        capacity = size;
        stack = (T[]) new Object[capacity];
        top = -1;
    }

    public void push(T item) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow!");
            return;
        }
        stack[++top] = item;
    }

    public T pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
            return null;
        }
        return stack[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

// Demo
public class StackArrayDemo {
    public static void main(String[] args) {
        ArrayStack<Integer> intStack = new ArrayStack<>(5);
        intStack.push(10);
        intStack.push(20);
        System.out.println("Popped: " + intStack.pop());

        ArrayStack<String> stringStack = new ArrayStack<>(5);
        stringStack.push("Hello");
        stringStack.push("World");
        System.out.println("Popped: " + stringStack.pop());

        ArrayStack<Double> doubleStack = new ArrayStack<>(5);
        doubleStack.push(3.14);
        System.out.println("Popped: " + doubleStack.pop());
    }
}
