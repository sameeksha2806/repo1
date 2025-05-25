import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIteratorDemoiterator {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();

        // Add elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Original LinkedList: " + numbers);

        // Forward iteration
        System.out.println("Forward Iteration:");
        ListIterator<Integer> iterator = numbers.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Backward iteration
        System.out.println("Backward Iteration:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }

        // Adding element using iterator
        iterator = numbers.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next() == 20) {
                iterator.add(25);
            }
        }

        System.out.println("After Adding 25 after 20: " + numbers);

        // Removing element using iterator
        iterator = numbers.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next() == 30) {
                iterator.remove();
            }
        }

        System.out.println("After Removing 30: " + numbers);
    }
}
