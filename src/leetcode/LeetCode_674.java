package leetcode;

/**
 * @author Enki
 * @ClassName LeetCode_674
 * @Description: TODO
 * @Date 2023/8/27 11:20
 * @Version 1.0
 */
public class LeetCode_674 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findLengthOfLCIS(new int[]{1,3,5,4,7}));
    }

    /**
     *
     */
    static class Solution {
        public int findLengthOfLCIS(int[] nums) {
            int[] dp = new int[nums.length];
            dp[0] = 1;
            int max = 0;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i-1] < nums[i]) {
                    dp[i] = dp[i - 1] + 1;
//                    max = Math.max(dp.length, max);
                } else {
                    dp[i] = 1;
                }

            }
            for (int j : dp) {
                max = Math.max(j, max);
            }
            return max;
        }
    }
}
