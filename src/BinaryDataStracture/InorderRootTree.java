package BinaryDataStracture;

import java.util.List;

public class InorderRootTree {
    static void main(String[] args) {
        int[] nodes = {1, 2, 3, 4, 5, -1, 8, -1, -1, 6, 7, 9};
        BinaryTree tree = new BinaryTree();
        Node root = BinaryTree.buildTree(nodes);
        System.out.println(root);
    }

    public static void inorder(List<Integer> ans, Node root) {

    }

//    public List<Integer> inorderTraversal(Node root) {
//        List<Integer> ans = new ArrayList<>();
//
//    }

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

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int[] node) {
            idx++;
            if (node[idx] == -1) {
                return null;
            }

            Node newNode = new Node(node[idx]);
            newNode.left = buildTree(node);
            newNode.right = buildTree(node);
            return newNode;
        }
    }
}
