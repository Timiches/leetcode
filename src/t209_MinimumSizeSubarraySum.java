public class t209_MinimumSizeSubarraySum {
    public int minSubArrayLen(int target, int[] arr) {
        int n = arr.length;
        int res = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += arr[i];
            while(sum >= target){
                res = Math.min(res, i + 1 - left);
                sum -= arr[left++];
            }
        }
        return res != Integer.MAX_VALUE ? res : 0;
    }
}
