public class SortTheArraysAssendingOrederFromLinkedList {
    static void main(String[] args) {

        RemoveDuplicatesfromSortedList.ListNode newNode = new RemoveDuplicatesfromSortedList.ListNode(0);
        RemoveDuplicatesfromSortedList.ListNode current = newNode;
        current.next = new RemoveDuplicatesfromSortedList.ListNode(1);
        current.next.next = new RemoveDuplicatesfromSortedList.ListNode(2);
        current.next.next.next = new RemoveDuplicatesfromSortedList.ListNode(3);
        RemoveDuplicatesfromSortedList.ListNode revrse = reverse(newNode);

        printNode(revrse);

    }


    public static RemoveDuplicatesfromSortedList.ListNode reverse(RemoveDuplicatesfromSortedList.ListNode head) {
        RemoveDuplicatesfromSortedList.ListNode curr = head;
        RemoveDuplicatesfromSortedList.ListNode prev = null;
        RemoveDuplicatesfromSortedList.ListNode next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void printNode(RemoveDuplicatesfromSortedList.ListNode head) {
        while (head != null) {
            System.out.println(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}
