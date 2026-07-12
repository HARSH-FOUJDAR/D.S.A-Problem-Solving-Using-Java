package BinaryDataStracture;

import java.util.LinkedList;
import java.util.Queue;

public class Binary {
    static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
//        BinaryTree trees = new BinaryTree();
        Node root = BinaryTree.buildTree(nodes);
        System.out.print(sumofNode(root));

    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void postOrder(Node root) {

        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + "  ");
    }

    public static int countNode(Node root) {
        if (root == null) {
            return 0;
        }
        int leftNode = countNode(root.left);
        int rightNode = countNode(root.right);
        return leftNode + rightNode + 1;
    }

    public static int sumofNode(Node root) {

        int sum = 0;

        if (root == null) {
            return 0;
        }

        int leftnode = sumofNode(root.left);
        int rightnode = sumofNode(root.right);
        return sum + leftnode + rightnode + root.data;
    }

    public static void lavelorderTravarsal(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currnode = q.remove();

            if (currnode == null) {
                System.out.println();

                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currnode.data + " ");

                if (currnode.left != null) {
                    q.add(currnode.left);
                }
                if (currnode.right != null) {
                    q.add(currnode.right);
                }
            }
        }
    }

    public boolean isSameTree(Node p, Node q) {
        if (p == null && q == null)
            return true;

        if (p == null || q == null)
            return false;

        if (p.data != q.data) {
            return false;
        }

        boolean left = isSameTree(p.left, q.left);
        boolean right = isSameTree(p.right, q.right);
        return left == right;
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

    public class BinaryTree {

        static int index = -1;

        // Build tree from preorder array
        static Node buildTree(int[] nodes) {
            index++;

            if (nodes[index] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }
}
