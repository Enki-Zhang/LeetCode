/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_188 {
    public static void main(String[] args) {
    }

    class Solution {
        public int maxProfit(int k, int[] prices) {
            int[][] dp = new int[k][prices.length];
            for (int i = 1; i < k; i++) {
                int tem = -1;
                for (int j = 1; j < prices.length; j++) {
                    tem = Math.max(tem, prices[j] - dp[i - 1][j - 1]);
                    dp[i][j] = Math.max(dp[i][j - 1], prices[j] + tem);

                }


            }
            return 0;

        }
    }
}
