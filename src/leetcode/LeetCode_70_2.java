package leetcode;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_70_2 {
    public static void main(String[] args) {

    }

    /**
     * 动态规划 计算所有爬楼的台阶数
     */
    class Solution {
        public int climbStairs(int n) {
//            dp数组
            int[] dp = new int[n+1];
            if (n==0) {
                return 0;
            }
            if (n==1) {
                return 1;
            }
            if (n==2) {
                return 2;
            }
            dp[1] = 1;
            dp[2] = 2;

            for (int i = 3; i <=n; i++) {
                dp[i] = dp[i-1]+dp[i-2];//2 1
            }
            return dp[n];

        }
    }
}
