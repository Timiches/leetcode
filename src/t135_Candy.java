public class t135_Candy {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int result = 1;
        int up = 0;
        int down = 0;
        int peak = 0;
        for (int i = 1; i < n; i++) {
            if (ratings[i - 1] < ratings[i]) {
                peak = ++up;
                down = 0;
                result += 1 + peak;
            } else if (ratings[i - 1] == ratings[i]) {
                peak = up = down = 0;
                result++;
            } else {
                up = 0;
                down++;
                result += (peak < down) ? down + 1 : down;
            }
        }
        return result;
    }
}
