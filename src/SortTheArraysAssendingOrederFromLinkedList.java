class ListNodes {
    int val;
    ListNode next;

    // Constructour

    ListNodes(int val) {
        this.val = val;
        next = null;
    }

}

public class SortTheArraysAssendingOrederFromLinkedList {
    static void main(String[] args) {

        ListNode newNode = new ListNode(0);
        ListNode current = newNode;
        current.next = new ListNode(1);
        current.next.next = new ListNode(2);
        current.next.next.next = new ListNode(3);
        ListNode revrse = reverse(newNode);

        printNode(revrse);

    }


    public static ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void printNode(ListNode head) {
        while (head != null) {
            System.out.println(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}
