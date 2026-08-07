package BinaryDataStracture;

import java.util.ArrayList;
import java.util.List;

public class BinaryPostOrderTraversal {
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
            int[] nodes = {1, 2, 3};
            Node tree = BinaryTree.buildtree(nodes);
            System.out.println(postorderTraversal(tree));

        }

        public static void postorder(Node root, List<Integer> result) {
            if (root == null) {
                return;
            }
            postorder(root.left, result);
            postorder(root.right, result);
            result.add(root.data);
        }

        public static List<Integer> postorderTraversal(Node root) {
            List<Integer> finalreult = new ArrayList<>();
            postorder(root, finalreult);
            return finalreult;
        }

        static class BinaryTree {
            static int index = -1;

            public static Node buildtree(int[] nodes) {
                index++;
                if (index > nodes.length - 1) {
                    return null;
                }

                Node newnode = new Node(nodes[index]);

                newnode.left = buildtree(nodes);
                newnode.right = buildtree(nodes);
                return newnode;
            }

        }
    }
}
