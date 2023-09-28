package leetcode;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_62 {
    public static void main(String[] args) {
        int[][] dp = new int[3][7];
        int i = Solution.uniquePaths(3, 7);
        System.out.println(i);

    }

   static class Solution {
        public static int uniquePaths(int m, int n) {
            int[][] dp = new int[m][n];
            if (n == 1 || m == 1) {
                return 1;
            }
            for (int i = 0; i < m; i++) {
                dp[i][0] = 1;
            }
            for (int i = 0; i < n; i++) {
                dp[0][i] = 1;
            }
            for (int i = 1; i <m; i++) {
                for (int j = 1; j <n; j++) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
            return dp[m-1][n-1];
        }
    }
}
