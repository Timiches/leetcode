import java.util.HashMap;

public class t146_LRUCache {
    static class Node {
        int key;
        int value;
        Node next;
        Node prev;

        Node(int key, int value) {
            this.value = value;
            this.key = key;
        }
    }

    static class LinkList {
        Node head;
        Node tail;

        public void addFirst(Node item) {
            if (head != null) {
                item.next = head;
                head.prev = item;
            }

            if (tail == null) {
                tail = item;
            }
            head = item;
        }

        public void unlink(Node item) {
            if (item == null)
                return;

            Node prev = item.prev;
            Node next = item.next;

            if (prev != null)
                prev.next = next;

            if (next != null)
                next.prev = prev;

            if (head == item)
                head = next;

            if (tail == item)
                tail = prev;

            item.prev = null;
            item.next = null;
        }
    }

    int capacity;
    HashMap<Integer, Node> map;
    LinkList history;

    public t146_LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        history = new LinkList();
    }

    public int get(int key) {
        if (!map.containsKey(key))
            return -1;

        Node valueNode = map.get(key);

        if (history.head != valueNode) {
            history.unlink(valueNode);
            history.addFirst(valueNode);
        }
        return valueNode.value;
    }

    public void put(int key, int value) {
        Node valueNode = new Node(key, value);

        if (map.containsKey(key)) removeItem(map.get(key));
        if (map.size() >= capacity) removeOldestItem();

        history.addFirst(valueNode);
        map.put(key, valueNode);
    }

    private void removeItem(Node item) {
        history.unlink(item);
        map.remove(item.key);
    }

    private void removeOldestItem() {
        Node oldest = history.tail;

        if (oldest == null)
            return;

        removeItem(oldest);
    }
}
