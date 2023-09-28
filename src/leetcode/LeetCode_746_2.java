package leetcode;

import java.util.Scanner;

/**
 * @author Enki
 * @ClassName LeetCode_746_2
 * @Description: TODO
 * @Date 2023/8/26 21:07
 * @Version 1.0
 */
public class LeetCode_746_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


    }

    /**
     *
     */
    class Solution {
        public int minCostClimbingStairs(int[] cost) {
            int[] dp = new int[cost.length+1];
            dp[0] = 0;
            dp[1] = 0;
            if (cost.length <= 2) {
                return Math.min(cost[0],cost[1]);
            }
            for (int i = 2; i <= cost.length; i++) {

                    dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);

            }
            return dp[cost.length];
        }
    }
}
