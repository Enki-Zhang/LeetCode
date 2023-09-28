package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_416_2 {
    public static void main(String[] args) {
        int[] sum = {3,3,3,4,5};
        Solution solution = new Solution();
        System.out.println(solution.canPartition(sum));
    }

    //    一维滚动数组
    static class Solution1 {

        public static boolean canPartition(int[] nums) {
            Arrays.sort(nums);
            int sum = 0;
            for (int a :
                    nums) {
                sum += a;
            }
            if (sum % 2 != 0) {
                return false;
            }
            sum /= 2;
            int[] dp = new int[sum + 1];
            dp[0] = 0;
//            在每一个背包内一次放入物品 背包容量从大到小 防止重复
            for (int i = 1; i < nums.length; i++) {
                for (int j = sum; j >= nums[i]; j--) {
                    dp[j] = Math.max(dp[j], dp[j - nums[i]] + nums[i]);
                    if (dp[j] == sum) {
                        return true;
                    }
                }
            }

            return dp[sum] == sum;


        }
    }

    static class Solution {
        public boolean canPartition(int[] nums) {
//            计算数组目标和
            int sum = 0;
            for (int a :
                    nums) {
                sum += a;
            }
            Arrays.sort(nums);
            int tar = sum / 2;
            if (sum % 2 != 0|| nums[0] > tar ) {
                return false;
            }
//            背包问题将数组放入到目标和的背包中
            int[][] dp = new int[nums.length + 1][tar + 1];
//            初始化背包
            for (int i = 0; i < dp.length; i++) {
                dp[i][0] = 0;
            }
            for (int i = 1; i < dp[0].length; i++) {
                if (i >= nums[0]) {
                    dp[0][i] = nums[0];
                } else dp[0][i] = 0;
            }
//            i == 重量
            for (int i = 1; i < nums.length; i++) {
                for (int j = 1; j <= tar; j++) {
                    if (nums[i] > j) {
                        dp[i][j] = dp[i - 1][j];
                    } else {
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - nums[i]] + nums[i]);
                    }
                    if (dp[i][j] == tar) {
                        return true;
                    }
                    System.out.println(dp[i][j]+ " ");
                }
            }
            return false;

        }
    }
}
