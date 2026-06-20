class Linkedlist {
    int val;
    ListNode next;

    Linkedlist(int val) {
        this.val = val;
        next = null;
    }
}


public class DetectCycleInLiNKEDlIST {
    static void main(String[] args) {
        ListNode ans = new ListNode(3);
        ListNode cuurent = ans;
        cuurent.next = new ListNode(2);
        cuurent.next.next = new ListNode(0);
        cuurent.next.next = new ListNode(-4);

        ListNode result = Soluction(ans);
        System.out.println(result);

    }

    public static ListNode Soluction(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean found = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                found = true;
                break;
            }
        }
        if (!found) {
            return null;
        }
        slow = head;

        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
