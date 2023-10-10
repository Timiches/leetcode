import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class t46_Permutations {
    public List<List<Integer>> permute(int[] arr) {
        ArrayList<List<Integer>> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        find(arr, result, stack);
        return result;
    }

    private void find(int[] arr, ArrayList<List<Integer>> result, Stack<Integer> stack) {
        if (stack.size() == arr.length) {
            result.add(new Vector<>(stack));
            return;
        }
        for (int num : arr) {
            if (!stack.contains(num)) {
                stack.push(num);
                find(arr, result, stack);
                stack.pop();
            }
        }
    }
}
