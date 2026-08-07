package BinaryDataStracture;

public class PathSum {
    public int maximumsum = Integer.MIN_VALUE;

    static void main(String[] args) {
        int[] values = {1, 2, 3};
        Node root = BinaryTree.buildTree(values);

//        System.out.println(maxPathSum(root));
    }

    public static boolean hasPathSum(Node root, int targetSum) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null) {
            return targetSum == root.data;
        }

        int sum = targetSum - root.data;

        return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
    }

//    public static int maxPathSum(Node root) {
//        mainfunction(root);
//        return maximumsum;
//    }

//    public static int mainfunction(Node root) {
//
//        if (root == null) {
//            return 0;
//        }
//
//        int leftmax = Math.max(0, mainfunction(root.left));
//        int rightmax = Math.max(0, mainfunction(root.right));
//
//        int totalsum = root.data + leftmax + rightmax;
//
//        Maximumsum = Math.max(Maximumsum, totalsum);
//
//        return root.data + Math.max(leftmax, rightmax);
//    }


    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int[] nodes) {
            idx++;
            if (idx >= nodes.length) {
                return null;
            }

            Node newdata = new Node(nodes[idx]);
            newdata.left = buildTree(nodes);
            newdata.right = buildTree(nodes);

            return newdata;
        }
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
