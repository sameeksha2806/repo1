import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        // a) HashSet - unordered
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(5);
        hashSet.add(4);
        hashSet.add(3);
        hashSet.add(4); // duplicate
        System.out.println("HashSet (Unordered, No duplicates): " + hashSet);

        // b) LinkedHashSet - maintains insertion order
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(5);
        linkedHashSet.add(4);
        linkedHashSet.add(3);
        linkedHashSet.add(4); // duplicate
        System.out.println("LinkedHashSet (Insertion Order): " + linkedHashSet);

        // c) TreeSet - sorted order
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(4);
        treeSet.add(3);
        treeSet.add(4); // duplicate
        System.out.println("TreeSet (Sorted Order): " + treeSet);
    }
}
