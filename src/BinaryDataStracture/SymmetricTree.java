package BinaryDataStracture;

public class SymmetricTree {
    static void main(String[] args) {
        int[] nodes = {1, 2, 2, 3, 4, 4, 3};
        BinaryTree tree = new BinaryTree();
        Node root = BinaryTree.buildtree(nodes);
        System.out.print(isSymmetric(root));

    }

    public static boolean isMirror(Node left, Node right) {
        if (left == null && right == null)
            return true;
        if (left == null || right == null)
            return false;

        if (left.data != right.data)
            return false;

        return isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }

    public static boolean isSymmetric(Node root) {
        if (root == null)
            return true;

        return isMirror(root.left, root.right);
    }

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildtree(int[] node) {
            idx++;

            if (node[idx] == -1) {
                return null;
            }

            Node newnode = new Node(node[idx]);
            newnode.left = buildtree(node);
            newnode.right = buildtree(node);

            return newnode;

        }
    }

}
