class ListNodeLinked {
    int val;
    ListNode next;

    ListNodeLinked(int val) {
        this.val = val;
        this.next = null;
    }
}

class ReverseLinkedListsts {
    public static ListNode Reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = Reverse(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public static void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original: ");
        print(head);

        head = Reverse(head);

        System.out.print("Reversed: ");
        print(head);
    }
}