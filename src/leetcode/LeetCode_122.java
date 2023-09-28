package leetcode;

/**
 * @author Enki
 * @ClassName LeetCode_122
 * @Description: TODO
 * @Date 2023/8/17 11:38
 * @Version 1.0
 */
public class LeetCode_122 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));

    }

    /**
     * 买卖股票 当前价格比昨天高就卖出
     */
    static class Solution {
        public int maxProfit(int[] prices) {
            int sum = 0;
            for (int i = 1; i < prices.length; i++) {
                if (prices[i] - prices[i - 1] > 0) {
                    sum += prices[i] - prices[i - 1];
                }
            }
            return sum;

        }
    }
}
