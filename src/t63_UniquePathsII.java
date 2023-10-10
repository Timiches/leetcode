import java.util.Arrays;

public class t63_UniquePathsII {
    int m = 0;
    int n = 0;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        m = obstacleGrid.length;
        n = obstacleGrid[0].length;
        int[][] memo = new int[m][n];
        for (int i = 0; i < m; ++i) {
            Arrays.fill(memo[i], -1);
        }
        return find(obstacleGrid, 0,0,memo);
    }

    private int find(int[][] grid, int i, int j, int[][] memo){
        if(i == m || j == n)
            return 0;
        if(grid[i][j] == 1)
            return 0;
        if(i == m - 1 && j == n - 1)
            return 1;
        if(memo[i][j] != -1)
            return memo[i][j];
        return memo[i][j] = find(grid, i + 1, j, memo) + find(grid, i, j + 1, memo);
    }
}
