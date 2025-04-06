package algorithm;

/**
 * @ClassName LeetCode_643
 * @Description TODO
 * @Author Enki
 * @Date 2025/1/16 10:54
 * @Verison 1.0
 **/
public class LeetCode_643 {
    public static void main(String[] args) {
        double maxAverage = new Solution().findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4);
        System.out.println(maxAverage);
    }

    static class Solution {
        /**
         * 计算 长度为kd的最大平均数  只要sum 区间最大即可
         *
         * @param nums
         * @param k
         * @return
         */
        public double findMaxAverage(int[] nums, int k) {
            // 计算前缀和
            int[] result = new int[nums.length + 1];
            result[0] = 0;
            for (int i = 0; i < nums.length; i++) {
                result[i + 1] = result[i] + nums[i];
            }
            // 遍历步长为k
            int sum = Integer.MIN_VALUE;
            for (int i = 0; i < nums.length; i++) {
                int j = i + k;
                if (j < result.length) {
                    sum = Math.max(result[j] - result[i], sum);
                }
            }
            return (double) sum / k;
        }
    }
}
