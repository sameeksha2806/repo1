import java.util.TreeSet;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

class BST {
    Node root;

    void insert(int data) {
        root = insertRec(root, data);
    }

    Node insertRec(Node node, int data) {
        if (node == null) return new Node(data);
        if (data < node.data)
            node.left = insertRec(node.left, data);
        else if (data > node.data)
            node.right = insertRec(node.right, data);
        return node;
    }

    void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }

    void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data + " ");
        }
    }
}
public class BSTApp {
    public static void main(String[] args) {
        // Using TreeSet (Collection API)
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(40);

        System.out.println("TreeSet (auto-sorted): " + treeSet); // Only supports in-order

        // Using custom BST for all traversals
        BST bst = new BST();
        for (int num : treeSet)
            bst.insert(num);

        System.out.print("InOrder: ");
        bst.inOrder(bst.root);       // 10 20 30 40
        System.out.print("\nPreOrder: ");
        bst.preOrder(bst.root);      // 30 10 20 40
        System.out.print("\nPostOrder: ");
        bst.postOrder(bst.root);     // 20 10 40 30
    }
}
