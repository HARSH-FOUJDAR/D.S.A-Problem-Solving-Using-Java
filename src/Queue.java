public class Queue {
    static void main(String[] args) {
        Queues q = new Queues(5);
        Queues.add(5);
        Queues.add(10);
        Queues.add(15);
        Queues.add(20);
        Queues.add(25);


        while (!Queues.isEmpty()) {
            System.out.println(Queues.peek());
            Queues.remove();
        }
    }

    static class Queues {
        static int[] arr;
        static int size;
        static int rear = -1;
        static int front = -1;


        Queues(int n) {
            arr = new int[n];
            size = n;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // Add function
        //enques operations
        public static void add(int data) {
            if (isFull()) {
                System.out.println("Full Queue");
                return;
            }
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // deques operations
        public static int remove() {
            if (isEmpty()) {
                System.out.println();
                return -1;
            }
            int result = arr[front];
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }

            return result;
        }

        //peek function
        public static int peek() {
            if (isEmpty()) {
                System.out.println("empty  queue");
                return -1;
            }
            return arr[front];
        }
    }
}
