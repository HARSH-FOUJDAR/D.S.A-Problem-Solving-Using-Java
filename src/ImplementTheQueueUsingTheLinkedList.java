public class ImplementTheQueueUsingTheLinkedList {
    static void main(String[] args) {

    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = next;
        }

        static class Queue {
            static Node head = null;
            static Node tail = null;


            public static boolean isEmpty() {
                return head == null &&
                        tail == null;
            }

//            public static void add(int data) {
//                Node newNode = new Node(data);
//                if (tail == null) {
//                    tail = head = newNode;
//                    return;
//                }
//                tail.next = newNode;
//                tail = newNode;
//            }


            public static int remove() {
                if (isEmpty()) {
                    System.out.println("Empty Queue");
                    return -1;
                }

                int front = head.data;
                if (head == tail) {
                    tail = null;
                }
                head = head.next;
                return front;
            }
        }
    }

}
