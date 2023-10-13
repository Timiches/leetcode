public class t920_NumberOfMusicPlaylists {
    public int numMusicPlaylists(int n, int goal, int k) {
        final int MOD = 1000000007;

        long[][] map = new long[goal + 1][n + 1];
        map[0][0] = 1;

        for (int i = 1; i <= goal; i++) {
            for (int j = 1; j <= Math.min(i, n); j++) {
                map[i][j] = map[i - 1][j - 1] * (n - j + 1) % MOD;
                if (j > k) {
                    map[i][j] = (map[i][j] + map[i - 1][j] * (j - k)) % MOD;
                }
            }
        }

        return (int) map[goal][n];
    }
}
