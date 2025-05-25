import java.util.List;

public class GenericListPrinter {

    // Method that accepts a list of any type using unbounded wildcard
    public static void printList(List<?> list) {
        for (Object element : list) {
            System.out.print(element + " ");
        }
        System.out.println(); // newline
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(10, 20, 30);
        List<String> strList = List.of("Java", "Python", "C++");
        List<Double> doubleList = List.of(1.1, 2.2, 3.3);

        printList(intList);    // Output: 10 20 30 
        printList(strList);    // Output: Java Python C++ 
        printList(doubleList); // Output: 1.1 2.2 3.3 
    }
}
