public class ReverseString {
    static void main(String[] args) {
        String str = "Harsh";
        revsersestr(str);
//        System.out.print(str);
    }

    public static void revsersestr(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i) + " ");
        }
    }

    static class ListNodeLinked {
        int val;
        ReverseLinkedListsts.ListNode next;

        ListNodeLinked(int val) {
            this.val = val;
            this.next = null;
        }
    }
}
