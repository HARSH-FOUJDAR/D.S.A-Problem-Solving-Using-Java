import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicatesfromSortedList {
    static void main(String[] args) {
        int[] arr1 = {1, 2, 4};
        int[] arr2 = {1, 3, 4};
        System.out.print(BruteMergeSort(arr1, arr2));
    }

    //Using the HashSet
    public static HashSet<Integer> List(int[] arr) {
        HashSet<Integer> newans = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            newans.add(arr[i]);
        }
        return newans;
    }

    //Brute Force Approach
    public static List<Integer> BruteMergeSort(int[] arr1, int[] arr2) {
        List<Integer> nearr = new ArrayList<>();

        int first = arr1.length - 1;
        int sec = arr2.length - 1;


        while (sec >= 0) {
            if (first >= 0 && arr1[first] >= arr2[sec]) {
                nearr.add(arr1[first]);
                first--;

            } else {
                nearr.add(arr2[sec]);
                sec--;
            }

        }
        return nearr.reversed();
    }


    //Using the LinkedList DataStracture
//    public ReverseLinkedListsts.ListNode mergeTwoLists(ReverseLinkedListsts.ListNode list1, ReverseLinkedListsts.ListNode list2) {
//        ReverseLinkedListsts.ListNode first = list1.next;
//        ReverseLinkedListsts.ListNode second = list2.next;
//        ReverseLinkedListsts.ListNode newnode = null;
//        int f = 0;
//        int s = 0;
//        while (first != null || second != null) {
//            first = first.next;
//            second = second.next;
//            f++;
//            s++;
//        }
//
//        int size = f + s;
//
//        while (first != null || second != null) {
//            if (first.val < second.val) {
//
//            }
//        }
//        return ReverseLinkedListsts.ListNode;
//    }

}
