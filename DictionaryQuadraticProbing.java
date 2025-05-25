import java.util.Scanner;

class Dictionary {
    private String[] keys;
    private String[] values;
    private int size;

    public Dictionary(int capacity) {
        size = capacity;
        keys = new String[size];
        values = new String[size];
    }

    private int hash(String key) {
        return Math.abs(key.hashCode()) % size;
    }

    public void insert(String key, String value) {
        int index = hash(key);

        for (int i = 0; i < size; i++) {
            int probeIndex = (index + i * i) % size;
            if (keys[probeIndex] == null || keys[probeIndex].equals(key)) {
                keys[probeIndex] = key;
                values[probeIndex] = value;
                System.out.println("Inserted: " + key + " => " + value);
                return;
            }
        }

        System.out.println("Table is full. Cannot insert.");
    }

    public String get(String key) {
        int index = hash(key);

        for (int i = 0; i < size; i++) {
            int probeIndex = (index + i * i) % size;
            if (keys[probeIndex] == null) break;
            if (keys[probeIndex].equals(key)) {
                return values[probeIndex];
            }
        }

        return null;
    }

    public void display() {
        System.out.println("\nDictionary Contents:");
        for (int i = 0; i < size; i++) {
            if (keys[i] != null) {
                System.out.println(i + ": " + keys[i] + " => " + values[i]);
            } else {
                System.out.println(i + ": ---");
            }
        }
    }
}

public class DictionaryQuadraticProbing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dictionary dict = new Dictionary(10);

        while (true) {
            System.out.println("\n1. Insert\n2. Get\n3. Display\n4. Exit");
            System.out.print("Choice: ");
            int ch = sc.nextInt();
            sc.nextLine();  // consume newline

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
