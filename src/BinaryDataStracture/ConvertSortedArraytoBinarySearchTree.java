package BinaryDataStracture;

class ConvertSortedArraytoBinarySearchTree {
    static void main(String[] args) {
        int[] values = {-10, -3, 0, 5, 9};
        int left = 0;
        int right = values.length - 1;
        System.out.println(Bst(values, left, right));

    }

    public static Node Bst(int[] arr, int left, int right) {
        if (left > right) {
            return null;
        }

        int mid = left + (right - left) / 2;

        Node newans = new Node(arr[mid]);

        newans.left = Bst(arr, left, mid - 1);
        newans.right = Bst(arr, mid + 1, right);

        return newans;
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
