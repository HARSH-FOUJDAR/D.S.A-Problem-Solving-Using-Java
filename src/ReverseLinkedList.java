//Create a Seprate Class for a LinkedList

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class ReverseLinkedList {

    //Print LinkedList Function

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println();
    }

    //This is Reverse LinkedList Using the Recursion Function
    public static ListNode ReverseRec(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newnode = ReverseRec(head.next);
        head.next.next = head;
        head.next = null;

        return newnode;
    }

    //This is the Mian Function For a Overall code

    static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        printList(head);

        head = ReverseRec(head);
        printList(head);
    }

}
