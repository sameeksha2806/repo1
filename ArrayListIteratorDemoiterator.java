import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListIteratorDemoiterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("Original ArrayList: " + list);

        // Forward iteration
        System.out.println("Forward Iteration:");
        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Backward iteration
        System.out.println("Backward Iteration:");
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }

        // Adding element using iterator
        iterator = list.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("Banana")) {
                iterator.add("Mango");
            }
        }

        System.out.println("After Adding 'Mango' after 'Banana': " + list);

        // Removing element using iterator
        iterator = list.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("Cherry")) {
                iterator.remove();
            }
        }

        System.out.println("After Removing 'Cherry': " + list);
    }
}
