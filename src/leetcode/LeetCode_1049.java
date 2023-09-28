package leetcode;

import java.util.Arrays;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_1049 {
    public static void main(String[] args) {


    }

    class Solution {
        public int lastStoneWeightII(int[] stones) {
            Arrays.sort(stones);
            if (stones.length == 1) {
                return stones[0];
            }
            if (stones.length == 2) {
                return Math.abs(stones[1] - stones[0]);
            }
            int s = 0;
            int sum = 0;
            for (int a :
                    stones) {
                s += a;
            }

//            得到背包容量
            sum = s / 2;
//            初始化dp数组
            int[][] dp = new int[stones.length][sum + 1];
//            初始化第一列
            for (int i = 0; i < stones.length; i++) {
                dp[i][0] = 0;
            }
//            初始化第一行
            for (int i = 0; i <= sum; i++) {
//                背包是否放到下第一个重量 >=
                if (i >= stones[0]) {
                    dp[0][i] = stones[0];
                } else {
                    dp[0][i] = 0;
                }
            }
            for (int i = 1; i < stones.length; i++) {
                for (int j = 1; j <= sum; j++) {
                    if (j < stones[i]) {
//                        回到当前背包的上一个状态
                        dp[i][j] = dp[i - 1][j];
                    } else {
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - stones[i]] + stones[i]);
                    }
                }

            }
            System.out.println(dp[stones.length - 1][sum]);
            return s - 2 * dp[stones.length - 1][sum];
        }
    }

}
