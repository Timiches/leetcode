public class t1658_MinimumOperationsToReduceXtoZero {
    int minOperations(int[] arr, int x) {
        int n = arr.length;
        int prefix = arr[0];
        int sz = n;
        for (int i = 1; i < n; i++) {
            if (prefix > x) {
                sz = i;
                break;
            }
            prefix += arr[i];
        }

        if (sz == n && prefix < x)
            return -1;

        prefix -= arr[sz - 1];
        int idx = sz - 1;
        int ans = Integer.MAX_VALUE;
        if (idx >= 0 && prefix == x) ans = sz - 1;

        int suffix = 0;

        for (int j = n - 1; j >= 0; j--) {
            suffix += arr[j];
            while (suffix + prefix > x && prefix > 0) {
                idx--;
                prefix -= arr[idx];
                if (suffix + prefix <= x) break;
            }
            if (suffix + prefix == x) {
                ans = Math.min(ans, (n - j) + idx);
            }
            if (suffix >= x) break;
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
