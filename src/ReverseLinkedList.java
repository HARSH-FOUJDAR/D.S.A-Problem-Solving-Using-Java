//Create a Seprate Class for a LinkedList

public class ReverseLinkedList {

    //Print LinkedList Function

    public static void printList(ReverseLinkedListsts.ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println();
    }

    //This is Reverse LinkedList Using the Recursion Function
    public static ReverseLinkedListsts.ListNode ReverseRec(ReverseLinkedListsts.ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ReverseLinkedListsts.ListNode newnode = ReverseRec(head.next);
        head.next.next = head;
        head.next = null;

        return newnode;
    }

    //This is the Mian Function For a Overall code

    static void main(String[] args) {
        ReverseLinkedListsts.ListNode head = new ReverseLinkedListsts.ListNode(1);
        head.next = new ReverseLinkedListsts.ListNode(2);
        head.next.next = new ReverseLinkedListsts.ListNode(3);
        printList(head);

        head = ReverseRec(head);
        printList(head);
    }

}
