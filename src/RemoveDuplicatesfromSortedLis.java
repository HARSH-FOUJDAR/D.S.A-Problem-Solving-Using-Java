public class RemoveDuplicatesfromSortedLis {
    static void main(String[] args) {

        ReverseLinkedListsts.ListNode dummy = new ReverseLinkedListsts.ListNode(0);
        ReverseLinkedListsts.ListNode current = dummy;

        int[] arr = {1, 1, 2, 3, 4, 5};
        for (int num : arr) {
            current.next = new ReverseLinkedListsts.ListNode(num);
            current = current.next;
        }
        ReverseLinkedListsts.ListNode result = deletduplicate(dummy.next);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }

    }

    public static ReverseLinkedListsts.ListNode deletduplicate(ReverseLinkedListsts.ListNode head) {
        ReverseLinkedListsts.ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    public static class RemoveCycleInLinkedList {

        public static void removeCycle(RemoveDuplicatesfromSortedList.ListNode head) {
            if (head == null || head.next == null) {
                return;
            }

            RemoveDuplicatesfromSortedList.ListNode slow = head;
            RemoveDuplicatesfromSortedList.ListNode fast = head;
            boolean found = false;

            // Detect cycle
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast) {
                    found = true;
                    break;
                }
            }

            // No cycle found
            if (!found) {
                return;
            }

            // Find start of cycle
            slow = head;

            // Special case: cycle starts at head
            if (slow == fast) {
                while (fast.next != slow) {
                    fast = fast.next;
                }
                fast.next = null;
                return;
            }

            // Find node before cycle start
            while (slow.next != fast.next) {
                slow = slow.next;
                fast = fast.next;
            }

            // Remove cycle
            fast.next = null;
        }
    }
}
