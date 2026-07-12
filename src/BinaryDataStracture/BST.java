package BinaryDataStracture;

public class BST {
    static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Node root = null;
        int key = 4;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        printRange(root, 2, 8);

    }

    public static int count(Node root) {
        if (root == null) {
            return 0;
        }

        if (root.data == -1) {
            return 0;
        }

        int leftnode = count(root.left);
        int rightnode = count(root.right);

        return leftnode + rightnode + 1;
    }


    public static Node delete(Node root, int val) {
        if (root.data > val) {
            root.left = delete(root.left, val);
        }

        if (root.data < val) {
            root.right = delete(root.right, val);
        } else {

            // Case 1
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2

            if (root.left == null) {
                return root.right;
            }

            //Case 3
            Node Is = inorderSuccessr(root.right);
            root.data = Is.data;
            root.right = delete(root.right, Is.data);
        }
        return root;

    }

    public static Node inorderSuccessr(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void printRange(Node root, int x, int y) {

        if (root == null) {
            return;
        }
        if (root.data >= x && root.data <= y) {
            printRange(root.left, x, y);
            System.out.print(root.data + " ");
            printRange(root.right, x, y);
        } else if (root.data >= x) {
            printRange(root.left, x, y);
        } else {
            printRange(root.right, x, y);
        }

    }

    public static Node insert(Node root, int val) {

        if (root == null) {
            root = new Node(val);
            return root;
        }


        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data > key) {
            return search(root.left, key);
        } else if (root.data == key) {
            return true;
        } else {
            return search(root.right, key);
        }
    }

    public static void Inorder(Node root) {
        if (root == null) {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;

        }
    }
}
