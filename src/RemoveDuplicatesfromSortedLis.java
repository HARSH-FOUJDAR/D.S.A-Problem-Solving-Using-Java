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
}
