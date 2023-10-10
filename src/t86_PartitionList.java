public class t86_PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode ghostS = new ListNode(0, head);
        ListNode ghostG = new ListNode(0, null);
        ListNode cur = head;
        ListNode greater = ghostG;
        ListNode smaller= ghostS;

        while(cur != null){
            if(cur.val >= x){
                greater.next = cur;
                greater = cur;
            } else {
                smaller.next = cur;
                smaller = cur;
            }
            cur = cur.next;
        }

        greater.next = null;
        smaller.next = ghostG.next;

        return ghostS.next;
    }
}
