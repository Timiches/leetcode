public class t21_MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null)
            return null;
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        ListNode head;
        ListNode cur;

        if (list1.val >= list2.val) {
            head = list2;
            cur = list2;
            list2 = list2.next;
        } else {
            head = list1;
            cur = list1;
            list1 = list1.next;
        }

        while (list1 != null && list2 != null) {
            if (list1.val >= list2.val) {
                cur.next = list2;
                cur = list2;
                list2 = list2.next;
            } else {
                cur.next = list1;
                cur = list1;
                list1 = list1.next;
            }
        }

        if (list1 != null) {
            cur.next = list1;
        }

        if (list2 != null) {
            cur.next = list2;
        }

        return head;
    }
}