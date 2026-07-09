class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class IntersectionofTwoLinkedLists {
    static void main(String[] args) {


    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode list1 = headA;
        ListNode list2 = headB;
        while (list1 != list2) {
            list1 = (list1 == null) ? headB : list1.next;
            list2 = (list2 == null) ? headA : list2.next;
        }
        return list1;
    }
}
