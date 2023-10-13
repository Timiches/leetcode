import java.util.Arrays;

public class t1584_MinCostToConnectAllPoints {
    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j)
                    mat[i][j] = Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1]);
            }
        }
        return prim(mat, n);
    }

    public int minKey(int key[], boolean[] visited) {
        int min = Integer.MAX_VALUE;
        int minI = -1;
        for (int i = 0; i < key.length; i++) {
            if (!visited[i] && key[i] < min) {
                min = key[i];
                minI = i;
            }
        }
        return minI;
    }

    public int prim(int[][] mat, int n) {
        int parent[] = new int[n];
        int key[] = new int[n];
        boolean visited[] = new boolean[n];
        Arrays.fill(key, Integer.MAX_VALUE);
        key[0] = 0;
        parent[0] = -1;
        for (int i = 0; i < n - 1; i++) {
            int temp = minKey(key, visited);
            visited[temp] = true;
            for (int j = 0; j < n; j++) {
                if (mat[temp][j] != 0 && !visited[j] && mat[temp][j] < key[j]) {
                    parent[j] = temp;
                    key[j] = mat[temp][j];
                }
            }
        }
        int answer = 0;
        for (int i = 1; i < n; i++) {
            answer += mat[i][parent[i]];
        }
        return answer;
    }
}
