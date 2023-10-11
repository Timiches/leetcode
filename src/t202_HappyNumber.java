public class t202_HappyNumber {
    int squareDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += (int) (Math.pow(n % 10, 2));
            n /= 10;
        }
        return sum;
    }

    boolean isHappy(int n) {
        while (n != 0) {
            if (n == 1 || n == 7)
                return true;
            if ((n >= 2 && n <= 6) || (n >= 8 && n <= 9))
                return false;
            n = squareDigits(n);
        }
        return false;
    }
}
