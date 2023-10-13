public class t725_SplitLinkedListInParts {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] result = new ListNode[k];
        if(head == null)
            return result;

        ListNode cur = head;
        ListNode prev;
        int length = 0;

        while(cur != null ){
            length++;
            cur = cur.next;
        }

        int quantity = length / k;
        int remain = length % k;
        cur = head;

        for(int i = 0; i < k; i++){
            ListNode localHead = cur;
            for(int j = 0; j < quantity + (i < remain ? 1 : 0) - 1; j++){
                if (cur != null)
                    cur = cur.next;
            }
            if(cur != null){
                result[i] = localHead;
                prev = cur;
                cur = cur.next;
                prev.next = null;
            }
        }

        return result;
    }
}
