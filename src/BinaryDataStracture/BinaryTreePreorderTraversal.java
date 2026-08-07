package BinaryDataStracture;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        static void main(String[] args) {
            int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9};
            Node root = Binary.buildtree(values);

            System.out.println(postorderTraversal(root));
        }

        public static void PostOrder(Node root, List<Integer> result) {
            if (root == null) {
                return;
            }

            PostOrder(root.left, result);
            PostOrder(root.right, result);
            result.add(root.data);

        }

        public static List<Integer> postorderTraversal(Node root) {
            List<Integer> newans = new ArrayList<>();
            PostOrder(root, newans);
            return newans;
        }

        static class Binary {
            static int index = -1;

            public static Node buildtree(int[] node) {
                index++;
                if (index > node.length - 1) {
                    return null;
                }
                Node newnode = new Node(node[index]);
                newnode.left = buildtree(node);
                newnode.right = buildtree(node);

                return newnode;
            }
        }
    }
}
