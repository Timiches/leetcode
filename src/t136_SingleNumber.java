public class t136_SingleNumber {
    public int singleNumber(int[] nums) {
        int sum = 0;
        for (int num : nums ) {
            sum = sum ^ num;
        }
        return sum;
    }
}
