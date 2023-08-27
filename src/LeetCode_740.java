import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @author Enki
 * @ClassName LeetCode_740
 * @Description: TODO
 * @Date 2023/8/27 8:45
 * @Version 1.0
 */
public class LeetCode_740 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.deleteAndEarn(new int[]{3,4,2}));

    }

    /**
     * 打家劫舍问题
     */
    static class Solution {
        public int deleteAndEarn(int[] nums) {
            Arrays.sort(nums);
            int[] dp = new int[nums.length];
            int max = 0;
            for (int a :
                    nums) {
                max = Math.max(max, a);
            }
//            记录a在nums中出现次数和元素总和
            int[] sum = new int[max + 1];
            for (int a :
                    nums) {
                sum[a] += a;
            }
            return removeNum(sum);
        }

        private int removeNum(int[] nums) {
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
