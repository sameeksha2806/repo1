class Node {
    int data;
    Node next;
    Node(int data) { this.data = data; }
}

class SortedLinkedList {
    Node head;

    void insert(int data) {
        Node newNode = new Node(data);
        if (head == null || data < head.data) {
            newNode.next = head;
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null && temp.next.data < data)
                temp = temp.next;
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    void delete(int data) {
        if (head == null) return;
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != data)
            temp = temp.next;
        if (temp.next != null)
            temp.next = temp.next.next;
    }

    boolean search(int data) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == data) return true;
            temp = temp.next;
        }
        return false;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class SimpleSortedListDemo {
    public static void main(String[] args) {
        SortedLinkedList list = new SortedLinkedList();

        list.insert(20);
        list.insert(10);
        list.insert(30);
        list.display(); // 10 20 30

        list.delete(20);
        list.display(); // 10 30

        System.out.println("Search 30: " + list.search(30)); // true
    }
}
