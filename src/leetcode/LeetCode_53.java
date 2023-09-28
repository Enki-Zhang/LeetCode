package leetcode;

import java.nio.file.Paths;
import java.util.Arrays;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_53 {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int[] ints = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int i = solution2.maxSubArray(ints);
        System.out.println(i);
    }
// 双指针 和>0 移动右指针 <0 缩小窗口

    /**
     * 滑动窗口 找到最大连续子序列 有指针滑动 扩大后比前面的max大则满足 小则移动左指针
     */
    static class Solution {
        public int maxSubArray(int[] nums) {
            int left = 0;
            int sum = 0;
            int max = Integer.MIN_VALUE;
            for (int num :
                    nums) {
                sum += num;
                max = Math.max(sum, max);

            }


            return max;
        }
    }

    /**
     * 动态规划 每个小连续数组新加元素后是否变大 是则新增 否 则弃掉之前的数组 从新选择
     */
    static class Solution2 {

        public int maxSubArray(int[] nums) {
            int max = Integer.MIN_VALUE;
            int dp[] = new int[nums.length];
//            初始化dp
            dp[0] = nums[0];
//            dp[i] = dp[i-1] + num;
            for (int i = 1; i < nums.length; i++) {
                dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
            }
            Arrays.sort(dp);
            return dp[dp.length - 1];
        }
    }

    /**
     * 贪心 这题不需要返回子数组 那么选择累加元素的数组起点 将后面的数组进行累加 当累加出现负数则更新累加数组的起点为当前下一个元素 并不断更新最大值
     */
    class Solution3 {
        public int maxSubArray(int[] nums) {

            int max = Integer.MIN_VALUE;
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                count += nums[i];
                max = Math.max(count, max);
                if (count < 0) {
                    count = 0;
                }
            }
            return max;

        }
    }


}
