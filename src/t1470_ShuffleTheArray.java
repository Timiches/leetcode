public class t1470_ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[n*2];
        int i = 0;
        int j = 0;
        while(j < n*2){
            res[j] = nums[i];
            res[j+1] = nums[i+n];
            i++;
            j += 2;
        }
        return res;
    }
}
