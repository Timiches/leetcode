public class t191_NumberOf1Bits {
    public int hammingWeight(int n) {
        return n == 0 ? 0 : (n & 1) + hammingWeight(n >>> 1);
    }
}
