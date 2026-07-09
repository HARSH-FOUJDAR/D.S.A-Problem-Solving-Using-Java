package BinaryDataStracture;

import java.util.LinkedList;
import java.util.Queue;

public class Example {
    static void main(String[] args) {
        int[] node = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = BinaryTree.buildTree(node);
        System.out.println(diameter2(root).diam);
    }

    public static void preorder(Node root) {

        if (root == null) {
            return;
        }
        System.out.println(root.data + " ");
        preorder(root.left);
        preorder(root.rigth);
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.println(root.data + " ");
        inorder(root.rigth);
    }

    public static void postorder(Node root) {
        if (root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.rigth);
        System.out.println(root.data);
    }

    public static int Nodecount(Node root) {
        if (root == null) {
            return 0;
        }
        int leftNode = Nodecount(root.left);
        int rightNode = Nodecount(root.rigth);

        return leftNode + rightNode + 1;
    }

    public static int sumOfNode(Node root) {
        if (root == null) {
            return 0;
        }

        int leftsum = sumOfNode(root.left);
        int rightsum = sumOfNode(root.rigth);

        return leftsum + rightsum + root.data;

    }

    public static void laveloder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node currNode = q.remove();

            if (currNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    q.add(currNode.left);
                }
                if (currNode.rigth != null) {
                    q.add(currNode.rigth);
                }
            }
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int leftheight = height(root.left);
        int rightheight = height(root.rigth);

        int myheight = Math.max(leftheight, rightheight) + 1;
        return myheight;
    }

    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int diam1 = diameter(root.left);
        int diam2 = diameter(root.rigth);
        int diam3 = height(root.left) + height(root.rigth) + 1;

        return Math.max(diam3, Math.max(diam1, diam2));
    }

    public static Threeinfo diameter2(Node root) {

        if (root == null) {
            return new Threeinfo(0, 0);
        }

        Threeinfo left = diameter2(root.left);
        Threeinfo right = diameter2(root.rigth);

        int myheight = Math.max(left.ht, right.ht) + 1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;

        int mydiam = Math.max(Math.max(diam1, diam2), diam3);

        Threeinfo myInfo = new Threeinfo(myheight, mydiam);
        return myInfo;
    }

    static class Node {
        int data;
        Node left;
        Node rigth;

        Node(int data) {
            this.data = data;
            this.rigth = null;
            this.left = null;
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
            newNode.rigth = buildTree(node);

            return newNode;
        }
    }

    static class Threeinfo {
        int ht;
        int diam;

        Threeinfo(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
        }
    }

}
