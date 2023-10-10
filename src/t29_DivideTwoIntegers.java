public class t29_DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1)
            return dividend + divisor;
        return dividend / divisor;
    }
}
