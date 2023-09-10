import java.nio.file.Path;

/**
 * @author Enki
 * @ClassName LeetCode_494
 * @Date 2023/8/11 12:27
 * @Version 1.0
 */
public class LeetCode_494 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findTargetSumWays(new int[]{1}, 1));


    }

    /**
     * 目标和 回溯整数分割问题
     */
    static class Solution {
        public int findTargetSumWays(int[] nums, int target) {
            int sum = 0;
            for (int a :
                    nums) {
                sum += a;
            }
            int size = (sum + target) / 2;
            if (target > sum || sum % 2 != 0) {
                return 0;
            }
            int[][] dp = new int[nums.length + 1][size + 1];
//            for (int i = 0; i <=nums.length; i++) {
//                dp[i][0] = 0;
//            }
//            for (int i = 0; i <=size; i++) {
//                if (i > nums[0]) {
//                    dp[0][i] = nums[0];
//                } else {
//                    dp[0][i] = 0;
//                }
//            }
            dp[0][0] = 1;
            for (int i = 1; i <= nums.length; i++) {
                for (int j = 1; j <= size; j++) {
                    if (j < nums[i - 1]) {
                        dp[i][j] = dp[i - 1][j];
                    } else {
                        dp[i][j] = dp[i - 1][j] + dp[i - 1][j - nums[i - 1]];
                    }
                }

            }
            return dp[nums.length][size];
        }
    }
}
