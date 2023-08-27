/**
 * @author Enki
 * @ClassName LeetCode_62_2
 * @Description: TODO
 * @Date 2023/8/23 10:55
 * @Version 1.0
 */
public class LeetCode_62_2 {
    public static void main(String[] args) {

    }

    /**
     * 动态规划
     */
    class Solution {
        public int uniquePaths(int m, int n) {
            int[][] dp = new int[m][n];
//            初始化列
            for (int i = 0; i < n; i++) {
                dp[0][i] = 0;
            }
//            初始化行
            for (int i = 0; i < m; i++) {
                dp[i][0] = 0;
            }
            for (int i = 1; i < m; i++) {
                for (int j = 1; j < n; j++) {
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
            return dp[m][n];
        }
    }
}
