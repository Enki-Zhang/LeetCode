/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_509 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int fib = solution.fib(5);


    }

    /**
     * 动态规划
     */
    static class Solution {
        public int fib(int n) {
//            确定dp数组
            int[] dp = new int[n + 1];
            dp[0] = 0;
            dp[1] = 1;
            if (n >= 2) {
                for (int i = 2; i <= n; i++) {
                    dp[i] = dp[i - 1] + dp[i - 2];
                }
            }
//            for (int i = 0; i <=n; i++) {
//                System.out.println(dp[i]);
//            }
            if (n == 0) {
                return 0;
            }

            return dp[n];
        }
    }
}
