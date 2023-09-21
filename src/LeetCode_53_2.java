import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Enki
 * @ClassName LeetCode_53_2
 * @Description: TODO
 * @Date 2023/9/19 10:43
 * @Version 1.0
 */
public class LeetCode_53_2 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] nums = new int[n];
//        for (int i = 0; i < n; i++) {
//            nums[i] = scanner.nextInt();
//        }
        Solution solution = new Solution();
        System.out.println(solution.maxSubArray(new int[]{5, 4, -1, 7, 8}));

    }

    /**
     * 求连续不能用回溯 使用滑动窗口 无法判断何时扩张
     */
    static class Solution2 {
        public int maxSubArray(int[] nums) {
            int left = 0;
            int right = 0;
            int max = Integer.MIN_VALUE;
            int sum = 0;
            for (int i = 0; i < nums.length; i++) {
                sum = 0;
                right = i;
                while (right < nums.length) {
                    sum += nums[right];
                    max = Math.max(max, sum);
                    right++;
                }
            }
            return max;
        }
    }

    /**
     * dp[i] = max (dp[i-1] + nums[i], dp[i-1])
     */
    static class Solution {

        public int maxSubArray(int[] nums) {
            int[] dp = new int[nums.length];
            dp[0] = nums[0];
            int max = Integer.MIN_VALUE;
            for (int j = 1; j < nums.length; j++) {
//                从开始进行累加 发现变小 将保存当前未变小的最大值存入继续累加
                dp[j] = Math.max(dp[j - 1] + nums[j], nums[j]);
            }
            for (int i : dp) {
                max = Math.max(i, max);
            }
            return max;

        }
    }
}
