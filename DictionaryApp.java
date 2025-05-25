import java.util.Scanner;

class Entry {
    String key;
    String value;
    boolean isDeleted;

    Entry(String key, String value) {
        this.key = key;
        this.value = value;
        this.isDeleted = false;
    }
}

class Dictionary {
    private Entry[] table;
    private int capacity;

    public Dictionary(int size) {
        this.capacity = size;
        table = new Entry[capacity];
    }

    private int hash(String key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    public void insert(String key, String value) {
        int index = hash(key);
        int originalIndex = index;
        int i = 0;

        while (table[index] != null && !table[index].isDeleted && !table[index].key.equals(key)) {
            i++;
            index = (originalIndex + i) % capacity;

            if (i == capacity) {
                System.out.println("Table is full. Cannot insert.");
                return;
            }
        }

        table[index] = new Entry(key, value);
        System.out.println("Inserted (" + key + ", " + value + ") at index " + index);
    }

    public String get(String key) {
        int index = hash(key);
        int originalIndex = index;
        int i = 0;

        while (table[index] != null) {
            if (!table[index].isDeleted && table[index].key.equals(key)) {
                return table[index].value;
            }
            i++;
            index = (originalIndex + i) % capacity;

            if (i == capacity) break;
        }

        return null;
    }

    public void delete(String key) {
        int index = hash(key);
        int originalIndex = index;
        int i = 0;

        while (table[index] != null) {
            if (!table[index].isDeleted && table[index].key.equals(key)) {
                table[index].isDeleted = true;
                System.out.println("Deleted key: " + key + " at index " + index);
                return;
            }
            i++;
            index = (originalIndex + i) % capacity;

            if (i == capacity) break;
        }

        System.out.println("Key not found: " + key);
    }

    public void display() {
        System.out.println("\nDictionary Contents:");
        for (int i = 0; i < capacity; i++) {
            if (table[i] != null && !table[i].isDeleted) {
                System.out.println(i + ": (" + table[i].key + ", " + table[i].value + ")");
            } else {
                System.out.println(i + ": ---");
            }
        }
    }
}

public class DictionaryApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dictionary dict = new Dictionary(10);  // Capacity of 10

        while (true) {
            System.out.println("\n1. Insert\n2. Get\n3. Delete\n4. Display\n5. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter key: ");
                    String k1 = sc.nextLine();
                    System.out.print("Enter value: ");
                    String v1 = sc.nextLine();
                    dict.insert(k1, v1);
                    break;
                case 2:
                    System.out.print("Enter key to get value: ");
                    String k2 = sc.nextLine();
                    String val = dict.get(k2);
                    System.out.println(val != null ? "Value: " + val : "Key not found.");
                    break;
                case 3:
                    System.out.print("Enter key to delete: ");
                    String k3 = sc.nextLine();
                    dict.delete(k3);
                    break;
                case 4:
                    dict.display();
                    break;
                case 5:
                    System.out.println("Exiting.");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
