package leetcode;

/**
 * @author Enki
 * @ClassName LeetCode_122_2
 * @Description: TODO
 * @Date 2023/10/6 10:12
 * @Version 1.0
 */
public class LeetCode_122_2 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    /**
     * 可以多次买卖股票将利润累加 只要有利润就卖
     */
    static class Solution {
        public int maxProfit(int[] prices) {
            int sell = 0;
            for (int i = 1; i < prices.length; i++) {
                if (prices[i] > prices[i - 1]) {
                    sell += prices[i] - prices[i - 1];
                }
            }
            return sell;

        }
    }
}
