import java.util.LinkedList;

public class t445_AddTwoNumbersII {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l1Head = l1;
        ListNode l2Head = l2;
        ListNode resultHead;
        ListNode temp;
        ListNode tempNext;

        LinkedList<Integer> l1List = new LinkedList<>();
        LinkedList<Integer> l2List = new LinkedList<>();
        LinkedList<Integer> resultList = new LinkedList<>();

        do {
            l1List.addFirst(l1.val);
            l1 = l1.next;
        } while (l1 != null);

        do {
            l2List.addFirst(l2.val);
            l2 = l2.next;
        } while (l2 != null);

        LinkedList<Integer> longer;
        LinkedList<Integer> shorter;

        if (l1List.size() >= l2List.size()) {
            longer = l1List;
            shorter = l2List;
        } else {
            longer = l2List;
            shorter = l1List;
        }

        int i = 0;
        int lSize = longer.size();
        int sSize = shorter.size();
        int inMind = 0;
        int sum = 0;

        for (i = 0; i < sSize; i++) {
            sum = shorter.get(i) + longer.get(i) + inMind;
            resultList.addFirst(sum % 10);
            inMind = sum / 10;
        }

        while (i < lSize) {
            sum = longer.get(i) + inMind;
            resultList.addFirst(sum % 10);
            inMind = sum / 10;
            i++;
        }

        if (inMind == 1) {
            resultList.addFirst(inMind);
            lSize++;
        }

        resultHead = new ListNode(resultList.get(0));
        temp = resultHead;
        i = 1;

        while (i < lSize) {
            tempNext = new ListNode(resultList.get(i));
            temp.next = tempNext;
            temp = tempNext;
            i++;
        }
        return resultHead;
    }
}
