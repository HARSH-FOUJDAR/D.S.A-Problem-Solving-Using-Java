public class StudyTreeConcepts {

    static void main(String[] args) {
        int[] Array = {5, 3, 8, 1, 4, -1, 9};
        Binary tree = new Binary();
        Node root = Binary.buildtree(Array);
        System.out.println(count(root));
    }

    public static int count(Node root) {

        if (root == null) {
            return 0;
        }

        int leftside = count(root.left);
        int rightside = count(root.right);


        return leftside + rightside + 1;
    }

//    public static Node insert(Node root, int val) {
//        if (root == null) {
//            return null;
//        }
//
//        if (root.data > val) {
//            root.left = insert(root.left, val);
//        } else {
//            root.right = insert(root.right, val);
//        }
//        return root;
//    }

    static class Binary {
        static int idx = -1;

        public static Node buildtree(int[] node) {
            idx++;

            if (idx >= node.length || node[idx] == -1) {
                return null;
            }

            Node newnode = new Node(node[idx]);

            newnode.left = buildtree(node);
            newnode.right = buildtree(node);
            return newnode;
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
