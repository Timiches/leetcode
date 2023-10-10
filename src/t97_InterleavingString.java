public class t97_InterleavingString {
    boolean isInterleave(String s1, String s2, String s3) {
        int m = s1.length(), n = s2.length(), l = s3.length();
        if (m > n)
            return isInterleave(s2, s1, s3);
        if (l != m + n)
            return false;
        boolean[] dp = new boolean[m + 1];
        dp[0] = true;
        for (int i = 1; i <= m; i++)
            dp[i] = dp[i - 1] && s3.charAt(i - 1) == s1.charAt(i - 1);
        for (int j = 1; j <= n; j++) {
            dp[0] = dp[0] && s3.charAt(j - 1) == s2.charAt(j - 1);
            for (int i = 1; i <= m; i++)
                dp[i] = (dp[i - 1] && s3.charAt(i + j - 1) == s1.charAt(i - 1)) ||
                        (dp[i] && s3.charAt(i + j - 1) == s2.charAt(j - 1));
        }
        return dp[m];
    }
}
