package niuke;

/**
 * @author Enki
 * @ClassName NK_4
 * @Description: TODO
 * @Date 2023/9/10 13:14
 * @Version 1.0
 */
public class NK_4 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.uniquePaths(3, 3));


    }

    public static class Solution {
        /**
         * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
         *
         * @param m int整型
         * @param n int整型
         * @return int整型
         */
        public int uniquePaths(int m, int n) {
            // write code here
            int[][] dp = new int[m][n];
            for (int i = 0; i < n; i++) {
                dp[0][i] = 1;
            }
            for (int i = 0; i < m; i++) {
                dp[i][0] = 1;
            }
            for (int i = 1; i < m; i++) {
                for (int j = 1; j < n; j++) {
                    dp[i][j] = dp[i-1][j]+dp[i][j-1];
                }
            }
            return dp[m-1][n-1];
        }
    }
}
