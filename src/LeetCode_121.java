import java.util.Arrays;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_121 {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int[] ints = {7,6,4,3,1};
        int i = solution2.maxProfit(ints);
        System.out.println(i);

    }

    /**
     * 找到最大值和最小值  最大值的下标大于最小值下标 超时
     */
    static class Solution {
        public int maxProfit(int[] prices) {
            int buy = 0;
            int sell = 0;

            int max = Integer.MIN_VALUE;
            for (int i = 0; i < prices.length; i++) {
                buy = prices[i];
                max = Integer.MIN_VALUE;
                for (int j = i+1; j < prices.length; j++) {
                    max = Math.max(prices[j], max);
                    if (max > buy) {
                        sell = Math.max(max - buy, sell);
                    }
                }
            }

            return sell;
        }
    }

    /**
     * 动态规划 for遍历会超时 找到当前位置元素前的最小值和最大值 并不断更新
     */
    static class Solution2 {
        public int maxProfit(int[] prices) {
            int min  = prices[0];
            int sell =0;
            for (int i = 0; i < prices.length; i++) {
                min = Math.min(min,prices[i]);
                sell = Math.max(prices[i]-min,sell);
            }

            return sell;

        }
    }
}
