public class t238_ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        if(0 == n)
            return result;

        result[0] = 1;
        int prod = 1;
        for(int i = 1; i < n; i++){
            prod = prod * nums[i - 1];
            result[i] = prod;
        }

        prod = 1;
        for(int i = n - 1; i >= 0; i--){
            result[i] = prod * result[i];
            prod = nums[i] * prod;
        }

        return result;
    }
}
