import java.util.Arrays;

public class t62_UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] memo = new int[m][n];
        for (int i = 0; i < m; ++i) {
            Arrays.fill(memo[i], -1);
        }
        return find(memo, 0, 0, m, n);
    }

    private int find(int[][] memo, int i, int j, int m, int n) {
        if (i == m || j == n)
            return 0;
        if (i == m - 1 && j == n - 1)
            return 1;
        if (memo[i][j] != -1)
            return memo[i][j];
        return memo[i][j] = find(memo, i + 1, j, m, n) + find(memo, i, j + 1, m, n);
    }
}
