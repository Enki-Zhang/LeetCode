import java.util.Arrays;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_322 {
    public static void main(String[] args) {

    }

    /**
     * 动态规划 自顶向下的搜索 将amount对硬币进行扣减 每次扣掉对大的硬币值
     */
    class Solution {
        public int coinChange(int[] coins, int amount) {
//            Arrays.sort(coins);//升序排序
            return dp(coins, amount);
        }


        public int dp(int[] coins, int amount) {
            if (amount == 0) {
                return 0;
            }
            if (amount <0) {
                return -1;
            }

            int result = Integer.MAX_VALUE;

            for (int coin :
                    coins) {
                int sub = dp(coins, amount - coin);
                if (sub <= -1) {
                    continue;
                }
                result = Math.min(result, sub + 1);
            }

            return result == Integer.MAX_VALUE ? -1 : result;


        }
    }
}
