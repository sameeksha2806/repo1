// Generic Node class
class Node<K extends Comparable<K>, V> {
    K key;
    V value;
    Node<K, V> left, right;

    Node(K key, V value) {
        this.key = key;
        this.value = value;
    }
}

// Generic BST Dictionary class
class BSTDictionary<K extends Comparable<K>, V> {
    Node<K, V> root;

    // Insert key-value pair
    void insert(K key, V value) {
        root = insertRec(root, key, value);
    }

    Node<K, V> insertRec(Node<K, V> node, K key, V value) {
        if (node == null) return new Node<>(key, value);
        int cmp = key.compareTo(node.key);
        if (cmp < 0)
            node.left = insertRec(node.left, key, value);
        else if (cmp > 0)
            node.right = insertRec(node.right, key, value);
        else
            node.value = value; // update if key already exists
        return node;
    }

    // InOrder traversal
    void inOrder(Node<K, V> node) {
        if (node != null) {
            inOrder(node.left);
            System.out.println(node.key + " => " + node.value);
            inOrder(node.right);
        }
    }

    // PreOrder traversal
    void preOrder(Node<K, V> node) {
        if (node != null) {
            System.out.println(node.key + " => " + node.value);
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    // PostOrder traversal
    void postOrder(Node<K, V> node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(node.key + " => " + node.value);
        }
    }
}
public class RBTreeApp {
    public static void main(String[] args) {
        RedBlackTree tree = new RedBlackTree();
        int[] values = {10, 20, 30, 15, 25, 5};

        for (int val : values)
            tree.insert(val);

        System.out.print("InOrder: ");
        tree.inOrder(tree.getRoot());

        System.out.print("\nPreOrder: ");
        tree.preOrder(tree.getRoot());

        System.out.print("\nPostOrder: ");
        tree.postOrder(tree.getRoot());

        int key = 25;
        System.out.println("\nSearch " + key + ": " + (tree.search(key) ? "Found" : "Not Found"));
    }
}
