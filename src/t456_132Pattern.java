import java.util.Stack;

public class t456_132Pattern {
    public boolean find132pattern(int[] arr) {
        int n = arr.length;
        if (n < 3)
            return false;
        Stack<Integer> n_k = new Stack<>();
        int[] n_i = new int[n];
        n_i[0] = arr[0];

        for (int i = 1; i < n; i++)
            n_i[i] = Math.min(n_i[i - 1], arr[i]);

        for (int j = n - 1; j > 0; j--) {
            if (arr[j] <= n_i[j])
                continue;
            while (!n_k.empty() && n_k.peek() <= n_i[j])
                n_k.pop();
            if (!n_k.empty() && n_k.peek() < arr[j]) {
                return true;
            }
            n_k.push(arr[j]);
        }
        return false;
    }
}
