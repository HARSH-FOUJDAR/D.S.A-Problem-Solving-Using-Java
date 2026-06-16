public class BackTrakiks {
    static void main(String[] args) {
        String str = "ABC";
        Premutation(str, "", 0);
    }


    public static void Premutation(String str, String prem, int idex) {
        if (str.length() == 0) {
            System.out.println(prem);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i + 1);
            Premutation(newstr, prem + currChar, idex + 1);
        }
    }

    public static class AddTwoNumbers {
        static void main(String[] args) {

        }

        public ReverseLinkedListsts.ListNode Addsum(ReverseLinkedListsts.ListNode l1, ReverseLinkedListsts.ListNode l2) {
            ReverseLinkedListsts.ListNode dummy = new ReverseLinkedListsts.ListNode(0);
            ReverseLinkedListsts.ListNode current = dummy;
            int carry = 0;

            while (l1 != null || l2 != null || carry != 0) {
                int sum = carry;

                if (l1 != null) {
                    sum += l1.val;
                    l1 = l1.next;
                }

                if (l2 != null) {
                    sum += l2.val;
                    l2 = l2.next;
                }

                carry = sum / 10;
                current.next = new ReverseLinkedListsts.ListNode(sum % 10);
                current = current.next;

            }
            return dummy.next;
        }

    }
}
