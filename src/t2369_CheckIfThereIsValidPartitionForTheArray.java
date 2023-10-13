public class t2369_CheckIfThereIsValidPartitionForTheArray {
    public boolean validPartition(int[] arr) {
        boolean[] dp = new boolean[]{true, false, false};

        for (int i = 0; i < arr.length; i++) {
            int dpIndex = i + 1;
            boolean result = false;

            if (i > 0 && arr[i] == arr[i - 1])
                result |= dp[(dpIndex - 2) % 3];
            if (i > 1 && arr[i] == arr[i - 1] && arr[i] == arr[i - 2])
                result |= dp[(dpIndex - 3) % 3];
            if (i > 1 && arr[i] == arr[i - 1] + 1 && arr[i] == arr[i - 2] + 2)
                result |= dp[(dpIndex - 3) % 3];
            dp[dpIndex % 3] = result;
        }
        return dp[arr.length % 3];
    }
}
