public class BalancedBinaryTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        public static Node insert(Node root, int val) {
            return root;
        }
    }
}
