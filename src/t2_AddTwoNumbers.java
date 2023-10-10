public class t2_AddTwoNumbers {
    int temp = 0;
    ListNode result = new ListNode();

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode fin = result;
        ListNode it1 = l1;
        ListNode it2 = l2;

        int sum;


        while (it1.next != null && it2.next != null) {

            sum = it1.val + it2.val + temp;
            result.val = sum % 10;
            temp = sum / 10;

            it1 = it1.next;
            it2 = it2.next;

            result.next = new ListNode();
            result = result.next;
        }
        ;

        sum = it1.val + it2.val + temp;
        result.val = sum % 10;
        temp = sum / 10;

        if (it1.next != null) {
            redo(it1.next);
        } else if (it2.next != null) {
            redo(it2.next);
        }

        if (temp > 0) {
            result.next = new ListNode(temp);
        }

        return fin;
    }

    public void redo(ListNode it) {
        do {
            result.next = new ListNode();
            result = result.next;

            result.val = (temp + it.val) % 10;
            temp = (temp + it.val) / 10;

            it = it.next;
        } while (it != null);
    }
}
