class ListLiked {
    int val;
    ListNode next;

    ListLiked(int val) {
        this.val = val;
        next = null;
    }
}

public class LinkedListCycle {
    static void main(String[] args) {
        ListNode ans = new ListNode(3);
        ListNode cuurent = ans;
        cuurent.next = new ListNode(2);
        cuurent.next.next = new ListNode(0);
        cuurent.next.next = new ListNode(-4);
//        cuurent.next.next.next = new ListNode(4);

        boolean result = Solution(ans);
        System.out.println(result);
    }

    public static boolean Solution(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void printlist(ListNode head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static void print(ListNode head) {
        while (head != null) {
            System.out.println(head.val + " ");
            head = head.next;
        }

    }
}
