import java.util.LinkedList;

public class t225_ImplementStackUsingQueues {
    LinkedList<Integer> list;
    public t225_ImplementStackUsingQueues() {
        list = new LinkedList<>();
    }

    public void push(int x) {
        list.addLast(x);
    }

    public int pop() {
        int obj = list.getLast();
        list.removeLast();
        return obj;
    }

    public int top() {
        return list.getLast();
    }

    public boolean empty() {
        return list.isEmpty();
    }
}
