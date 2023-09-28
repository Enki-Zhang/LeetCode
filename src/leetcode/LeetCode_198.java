package leetcode;

/**
 * @author Enki
 * @ClassName LeetCode_198
 * @Description: TODO
 * @Date 2023/8/26 21:46
 * @Version 1.0
 */
public class LeetCode_198 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.rob(new int[]{2,7,9,3,1}));

    }

    /**
     * 打家劫舍 不取连续两个连续数组情况下 和最大
     * dp[i] 判断i是否可偷 i-1偷过则
     */
    static class Solution {
        public int rob(int[] nums) {
            if (nums.length == 1) {
                return nums[0];
            }
            if (nums.length == 2) {
                return Math.max(nums[0], nums[1]);
            }
            int[] dp = new int[nums.length];
            dp[0] = nums[0];
            dp[1] = Math.max(nums[0], nums[1]);
            for (int i = 2; i < nums.length; i++) {
                dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
            }
            return dp[nums.length - 1];
        }
    }
}
