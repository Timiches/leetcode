public class t338_CountingBits {
    public int[] countBits(int n) {
        int[] result = new int[n+1];
        result[0] = 0;

        for(int i = 1; i <= n; i++){
            int bit = (int)(Math.log(i) / Math.log(2));
            int cur = (int)Math.pow(2, bit);
            result[i] = 1+ result[i - cur];
        }
        return result;
    }
}
