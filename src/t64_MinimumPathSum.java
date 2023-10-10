import java.util.Arrays;

public class t64_MinimumPathSum {
    int m = 0;
    int n = 0;
    public int minPathSum(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        int[][] memo = new int[m][n];
        for (int i = 0; i < m; ++i) {
            Arrays.fill(memo[i], -1);
        }
        return find3(grid, 0, 0, memo);
    }

    private int find3(int[][] grid, int i, int j, int[][] memo) {
        if (i == m || j == n)
            return Integer.MAX_VALUE;
        if (i == m - 1 && j == n - 1)
            return memo[i][j] = grid[i][j];
        if (memo[i][j] != -1)
            return memo[i][j];
        return memo[i][j] = Math.min(find3(grid, i + 1, j, memo), find3(grid, i, j + 1, memo)) + grid[i][j];
    }
}
