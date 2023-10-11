import java.util.ArrayDeque;
import java.util.Deque;

public class t239_SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] arr, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int[] result = new int[arr.length - k + 1];
        int j = 0;

        for (int i = 0; i < k; i++) {
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()])
                dq.pollLast();
            dq.offerLast(i);
        }
        result[j++] = arr[dq.peekFirst()];

        for (int i = k; i < arr.length; i++) {
            if (dq.peekFirst() == i - k)
                dq.pollFirst();
            while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()])
                dq.pollLast();
            dq.offerLast(i);
            result[j++] = arr[dq.peekFirst()];
        }
        return result;
    }
}
