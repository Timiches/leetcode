public class t542_Matrix01 {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++) {
                int i_prev = (i == 0) ? 10001 : mat[i - 1][j];
                int j_prev = (j == 0) ? 10001 : mat[i][j - 1];
                mat[i][j] = (mat[i][j] == 0) ? 0 : 1 + Math.min(i_prev, j_prev);
            }

        for (int i = n - 1; i >= 0; i--)
            for (int j = m - 1; j >= 0; j--) {
                int i_prev = (i == n - 1) ? 10001 : mat[i + 1][j];
                int j_prev = (j == m - 1) ? 10001 : mat[i][j + 1];
                int tmp = 1 + Math.min(i_prev, j_prev);
                mat[i][j] = Math.min(tmp, mat[i][j]);
            }

        return mat;
    }
}
