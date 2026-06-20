import java.util.Scanner;

public class FirstOccurrenceofCharacter {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char a = sc.next().charAt(0);
        System.out.println(findchar(str, a));
    }

    public static int findchar(String str, char a) {
        int ans = -1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a) {
                ans = i + 1;
                break;
            }
        }
        return ans;
    }

    public static class FindTheLargestUsingTheLinkedlist {
        static void main(String[] args) {
            RemoveDuplicatesfromSortedList.ListNode newans = new RemoveDuplicatesfromSortedList.ListNode(0);
            RemoveDuplicatesfromSortedList.ListNode current = newans;
            current.next = new RemoveDuplicatesfromSortedList.ListNode(1);
            current.next.next = new RemoveDuplicatesfromSortedList.ListNode(2);
            System.out.println(max(newans));

        }

        public static int max(RemoveDuplicatesfromSortedList.ListNode head) {
            int max = head.val;
            RemoveDuplicatesfromSortedList.ListNode current = head;

            while (current != null) {
                if (current.val > max) {
                    max = current.val;
                }
                current = current.next;
            }
            return max;
        }
    }
}
