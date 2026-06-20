public class InsertationSort {
    static void main(String[] args) {
        int[] arr = {7, 8, 3, 1, 2};


        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static class LinkedListCycle {
        static void main(String[] args) {
            RemoveDuplicatesfromSortedList.ListNode ans = new RemoveDuplicatesfromSortedList.ListNode(3);
            RemoveDuplicatesfromSortedList.ListNode cuurent = ans;
            cuurent.next = new RemoveDuplicatesfromSortedList.ListNode(2);
            cuurent.next.next = new RemoveDuplicatesfromSortedList.ListNode(0);
            cuurent.next.next = new RemoveDuplicatesfromSortedList.ListNode(-4);
            //        cuurent.next.next.next = new RemoveDuplicatesfromSortedList.findthefactorial.ListNode(4);

            boolean result = Solution(ans);
            System.out.println(result);
        }

        public static boolean Solution(RemoveDuplicatesfromSortedList.ListNode head) {
            RemoveDuplicatesfromSortedList.ListNode slow = head;
            RemoveDuplicatesfromSortedList.ListNode fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast) {
                    return true;
                }
            }
            return false;
        }

        public static void printlist(RemoveDuplicatesfromSortedList.ListNode head) {
            while (head != null) {
                System.out.println(head.val);
                head = head.next;
            }
        }

        public static void print(RemoveDuplicatesfromSortedList.ListNode head) {
            while (head != null) {
                System.out.println(head.val + " ");
                head = head.next;
            }

        }
    }
}
