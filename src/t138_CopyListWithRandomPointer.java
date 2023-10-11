import java.util.HashMap;

public class t138_CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {
        if(head == null)
            return null;
        HashMap<Node, Node> map = new HashMap<>();
        Node cur = head;
        Node newHead = new Node(head.val);
        Node newCur = newHead;
        Node temp;

        map.put(cur, newCur);
        cur = cur.next;

        while (cur != null) {
            temp = new Node(cur.val);
            newCur.next = temp;
            newCur = temp;
            map.put(cur, newCur);
            cur = cur.next;
        }

        cur = head;
        newCur = newHead;

        while(cur != null){
            if(map.containsKey(cur.random)){
                newCur.random = map.get(cur.random);
            }
            cur = cur.next;
            newCur = newCur.next;
        }

        return newHead;
    }
}
