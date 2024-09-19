package algorithm;

/**
 * @author Enki
 * @ClassName LeetCode_209
 * @Description: TODO
 * @Date 2024/9/19 20:41
 * @Version 1.0
 */
public class LeetCode_209 {
    public static void main(String[] args) {

    }

    /**
     * 长度最小的子串
     */
    class Solution {
        public int minSubArrayLen(int target, int[] nums) {
//            找到合适的子数组 -> 滑动窗口 sum 加上有边界的数值 当条件大于目标后 缩小边界
            int left = 0;
            int right = 0;
            int sum = 0;
            int len = Integer.MAX_VALUE;
//            滑动窗口将数据进行记录 当数据大于目标值时候 进行缩小窗口 并更新长度 直到不满足条件
            for (right = 0; right < nums.length; right++) {
                sum += nums[right];
                while (sum > target && left < right) {
                    sum -= nums[left];
                    left++;
                    len = Math.min(len, right - left + 1);
                }
            }
            return len == Integer.MAX_VALUE ? 0 : len;

        }
    }
}
