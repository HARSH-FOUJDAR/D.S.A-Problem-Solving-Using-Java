import java.util.Scanner;

public class DeleteLastKArrayElements {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];


        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        if (N == K) {
            return;
        }

        if (N > K) {
            for (int i = 0; i < arr.length - K; i++) {
                System.out.print(arr[i] + " ");
            }
        } else if (N < K) {
        }

    }

    public static class DetectCycleInLiNKEDlIST {
        static void main(String[] args) {
            RemoveDuplicatesfromSortedList.ListNode ans = new RemoveDuplicatesfromSortedList.ListNode(3);
            RemoveDuplicatesfromSortedList.ListNode cuurent = ans;
            cuurent.next = new RemoveDuplicatesfromSortedList.ListNode(2);
            cuurent.next.next = new RemoveDuplicatesfromSortedList.ListNode(0);
            cuurent.next.next = new RemoveDuplicatesfromSortedList.ListNode(-4);

            RemoveDuplicatesfromSortedList.ListNode result = Soluction(ans);
            System.out.println(result);

        }

        public static RemoveDuplicatesfromSortedList.ListNode Soluction(RemoveDuplicatesfromSortedList.ListNode head) {
            RemoveDuplicatesfromSortedList.ListNode slow = head;
            RemoveDuplicatesfromSortedList.ListNode fast = head;
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
}
