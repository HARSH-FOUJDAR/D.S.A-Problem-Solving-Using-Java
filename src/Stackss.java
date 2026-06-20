public class Stackss {
    static void main(String[] args) {
        Stacks.push(1);
        Stacks.push(2);
        Stacks.push(3);
        Stacks.push(4);

        while (!Stacks.isEmpty()) {
            System.out.println(Stacks.pop());
        }

    }

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stacks {
        public static Node head = null;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }

    static class ListNodes {
        int val;
        RemoveDuplicatesfromSortedList.ListNode next;

        // Constructour

        ListNodes(int val) {
            this.val = val;
            next = null;
        }

    }
}
