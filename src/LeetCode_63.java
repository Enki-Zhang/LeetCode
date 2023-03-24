/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_63 {
    public static void main(String[] args) {

    }

    class Solution {
        public int uniquePathsWithObstacles(int[][] obstacleGrid) {

            int m = obstacleGrid.length;
            int n = obstacleGrid[0].length;
            int[][] dp = new int[m][n];
            if (obstacleGrid[m - 1][n - 1] == 1) {
                return 0;
            }
            if (obstacleGrid[0][0] == 1) {
                return 0;
            }
            for (int i = 0; i < m && obstacleGrid[i][0] == 0; i++) {
                dp[i][0] = 1;
            }
            for (int i = 0; i < n && obstacleGrid[0][i] == 0; i++) {
                dp[0][i] = 1;
            }

            for (int i = 1; i < m; i++) {
                for (int j = 1; j < n; j++) {
                    if (obstacleGrid[i - 1][j] == 1) {
                        dp[i - 1][j] = 0;
                    }
                    if (obstacleGrid[i][j - 1] == 1) {
                        dp[i][j - 1] = 0;
                    }
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
            return dp[m - 1][n - 1];
        }
    }
}
