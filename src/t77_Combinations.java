import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class t77_Combinations {
    public List<List<Integer>> combine(int n, int k) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        find(1, n, k, result, stack);
        return result;
    }

    private void find(int from, int n, int k, ArrayList<List<Integer>> result, Stack<Integer> stack) {
        if (stack.size() == k) {
            result.add(new Vector<>(stack));
            return;
        }
        for (int i = from; i <= n; i++) {
            stack.push(i);
            find(i + 1, n, k, result, stack);
            stack.pop();
        }
    }
}
