public class RemoveNthNodeFromEndofList {
    static void main(String[] args) {

    }

    public ReverseLinkedListsts.ListNode removeNthFromEnd(ReverseLinkedListsts.ListNode head, int n) {
        int length = 0;
        while (head != null) {
            head = head.next;
            length++;
        }
        int indextoSerach = length - n;
        int i = 0;
        ReverseLinkedListsts.ListNode prev = head;
        while (i < indextoSerach) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return head;
    }
}
