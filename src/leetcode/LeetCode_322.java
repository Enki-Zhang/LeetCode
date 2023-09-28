package leetcode;

import java.util.Arrays;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_322 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.coinChange(new int[]{2}, 3));

    }

    /**
     * 动态规划 自顶向下的搜索 将amount对硬币进行扣减 每次扣掉对大的硬币值
     */
    static class Solution {
        public int coinChange(int[] coins, int amount) {
//            对应amount的最少硬币
            int[] dp = new int[amount + 1];

            for (int i = 0; i < dp.length; i++) {
                dp[i] = amount + 1;
            }
            dp[0] = 0;
            for (int i = 1; i < dp.length; i++) {
                for (int coin :
                        coins) {
                    if (i - coin >= 0) {
                        dp[i] = Math.min(dp[i - coin] + 1, dp[i]);
                    }
                }
            }
            return (dp[amount] > amount) ? -1 : dp[amount];
        }
    }
}
