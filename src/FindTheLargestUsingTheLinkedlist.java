class ListNode {
    int val;
    ListNode next;

    //Constructor

    ListNode(int val) {
        this.val = val;

    }
}


public class FindTheLargestUsingTheLinkedlist {
    static void main(String[] args) {
        ListNode newans = new ListNode(0);
        ListNode current = newans;
        current.next = new ListNode(1);
        current.next.next = new ListNode(2);
        System.out.println(max(newans));

    }

    public static int max(ListNode head) {
        int max = head.val;
        ListNode current = head;

        while (current != null) {
            if (current.val > max) {
                max = current.val;
            }
            current = current.next;
        }
        return max;
    }
}
