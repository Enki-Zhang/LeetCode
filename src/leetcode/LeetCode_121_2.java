package leetcode;

/**
 * @author Enki
 * @ClassName LeetCode_121_2
 * @Description: TODO
 * @Date 2023/10/6 9:53
 * @Version 1.0
 */
public class LeetCode_121_2 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));

    }

    /**
     * 买卖股票 dp[i] = dp[i-1]-num[i] , dp[i-1]
     * 选择在最小价格买入并在最大价格卖出
     */
    static class Solution {
        public int maxProfit(int[] prices) {
            int min = prices[0];//维护当天之前的最小价格
            int[] dp = new int[prices.length];//计算可得到的利润
            dp[0] = 0;
            for (int i = 1; i < prices.length; i++) {
                min = Math.min(prices[i], min);
                dp[i] = Math.max(prices[i] - min, dp[i - 1]);
            }
            return dp[prices.length-1];
        }
    }
}
