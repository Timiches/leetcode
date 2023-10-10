public class t70_ClimbingStairs {
    public int climbStairs(int n) {
        if (n < 2) {
            return n;
        }

        int first = 1;
        int second = 2;
        int tmp = 0;

        for (int i = 3; i <= n; i++) {
            tmp = second;
            second += first;
            first = tmp;
        }
        return second;
    }
}
