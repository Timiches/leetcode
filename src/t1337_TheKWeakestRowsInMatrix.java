import java.util.Arrays;

public class t1337_TheKWeakestRowsInMatrix {
    public int[] kWeakestRows(int[][] mat, int k) {
        return goThrough(mat, k);
    }

    private int[] goThrough(int[][] mat, int k) {
        int count = 0;
        int[] result = new int[k];
        for (int j = 0; j < mat[0].length; j++) {
            for (int i = 0; i < mat.length; i++) {
                if (count == k)
                    return result;
                if (mat[i][j] == 0) {
                    Arrays.fill(mat[i], -1);
                    result[count++] = i;
                }
            }
        }

        if (count != k) {
            for (int i = 0; i < mat.length; i++) {
                if (mat[i][0] != -1 && count < k) {
                    result[count++] = i;
                }
            }
        }
        return result;
    }
}
