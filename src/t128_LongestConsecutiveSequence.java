import java.util.Arrays;

public class t128_LongestConsecutiveSequence {
    public int longestConsecutive(int[] arr) {
        if (arr.length == 0)
            return 0;
        Arrays.sort(arr);
        int result = 1;
        int temp = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] + 1 == arr[i])
                temp++;
            else if (arr[i - 1] < arr[i]) {
                result = Math.max(temp, result);
                temp = 1;
            }
        }
        return Math.max(temp, result);
    }
}
