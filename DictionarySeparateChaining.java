import java.util.LinkedList;
import java.util.Scanner;

class Node {
    String key;
    String value;

    Node(String key, String value) {
        this.key = key;
        this.value = value;
    }
}

class Dictionary {
    private final int size;
    private LinkedList<Node>[] table;

    public Dictionary(int size) {
        this.size = size;
        table = new LinkedList[size];

        // Initialize each bucket with an empty linked list
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }
    }

    private int hash(String key) {
        return Math.abs(key.hashCode()) % size;
    }

    public void insert(String key, String value) {
        int index = hash(key);
        for (Node node : table[index]) {
            if (node.key.equals(key)) {
                node.value = value;
                System.out.println("Updated: " + key + " => " + value);
                return;
            }
        }
        table[index].add(new Node(key, value));
        System.out.println("Inserted: " + key + " => " + value);
    }

    public String get(String key) {
        int index = hash(key);
        for (Node node : table[index]) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }
        return null;
    }

    public void display() {
        System.out.println("\nDictionary Contents:");
        for (int i = 0; i < size; i++) {
            System.out.print(i + ": ");
            for (Node node : table[i]) {
                System.out.print("[" + node.key + " => " + node.value + "] ");
            }
            System.out.println();
        }
    }
}
public class DictionarySeparateChaining {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dictionary dict = new Dictionary(10);

        while (true) {
            System.out.println("\n1. Insert\n2. Get\n3. Display\n4. Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (ch) {
                case 1:
                    System.out.print("Enter key: ");
                    String key = sc.nextLine();
                    System.out.print("Enter value: ");
                    String value = sc.nextLine();
                    dict.insert(key, value);
                    break;
                case 2:
                    System.out.print("Enter key to search: ");
                    String search = sc.nextLine();
                    String result = dict.get(search);
                    if (result != null) {
                        System.out.println("Found: " + search + " => " + result);
                    } else {
                        System.out.println("Key not found.");
                    }
                    break;
                case 3:
                    dict.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
