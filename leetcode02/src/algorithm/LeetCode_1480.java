package algorithm;

/**
 * @ClassName LeetCode_1480
 * @Description 前缀和
 * @Author Enki
 * @Date 2025/1/14 16:26
 * @Verison 1.0
 **/
public class LeetCode_1480 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(new Solution().runningSum(nums).toString());

    }

    static class Solution {
        /**
         * 遍历数组 每次将更新当前元素累加前一个元素的值
         *
         * @param nums
         * @return
         */
        public int[] runningSum(int[] nums) {
            for (int i = 1; i < nums.length; i++) {
                nums[i] += nums[i - 1];
            }
            return nums;
        }
    }

}
