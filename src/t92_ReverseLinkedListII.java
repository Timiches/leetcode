public class t92_ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (right == 1)
            return head;
        ListNode dummy = new ListNode();
        ListNode l = dummy;
        ListNode r;
        dummy.next = head;

        for (int i = 0; i < left - 1; i++)
            l = l.next;
        r = l.next;
        for (int i = left; i < right; i++) {
            ListNode rev = r.next;
            r.next = rev.next;
            rev.next = l.next;
            l.next = rev;
        }
        return dummy.next;
    }
}
