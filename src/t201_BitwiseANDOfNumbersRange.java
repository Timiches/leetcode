public class t201_BitwiseANDOfNumbersRange {
    public int rangeBitwiseAnd(int left, int right) {
        int offset = 0;
        while(left > 0){
            if(left == right)
                return left << offset;
            left = left >> 1;
            right = right >> 1;
            offset++;
        }
        return 0;
    }
}
