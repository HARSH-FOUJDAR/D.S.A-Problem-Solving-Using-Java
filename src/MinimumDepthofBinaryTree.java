public class MinimumDepthofBinaryTree {
    static void main(String[] args) {
        int[] nodes = {2, -1, 3, -1, 4, -1, 5, -1, 6};
        Node root = null;
        for (int i = 0; i < nodes.length; i++) {
            root = insert(root, nodes[i]);
        }

        System.out.println();
        System.out.println(Height(root));
    }

    public static int Height(Node root) {
        if (root == null) {
            return 0;
        }

        int leftNode = Height(root.left);
        int rightNode = Height(root.right);

        return leftNode + 1;

    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
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


    static class Node {
        int data;
        Node left;
        Node right;


        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
}
