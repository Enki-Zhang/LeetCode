import java.lang.annotation.Native;

/**
 * @author Enki
 * @ClassName LeetCode_152
 * @Description: TODO
 * @Date 2023/9/9 9:02
 * @Version 1.0
 */
public class LeetCode_152 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxProduct(new int[]{2,3,-2,4}));
    }

    /**
     * dp[i][j] = dp[i][j-1] * nums[i], dp[i][j]
     */
    static class Solution {
//        public int maxProduct(int[] nums) {
//            int[][] dp = new int[nums.length][nums.length];
//            int max = Integer.MIN_VALUE;
//            for (int i = 0; i < nums.length; i++) {
//                for (int j = 0; j < nums.length; j++) {
//                    if (i > j) {
//                        dp[i][j] = Integer.MIN_VALUE;
//                    } else if (i == j) {
//                        dp[i][j] = nums[i];
//                    } else {
//                        dp[i][j] = dp[i][j - 1] * nums[j];
//                    }
//                    if (j >= i) {
//                        max = Math.max(max, dp[i][j]);
//                    }
////                    System.out.print(dp[i][j] + " ");
//                }
////                System.out.println();
//            }
//
//            return max;
//
//        }

        public int maxProduct(int[] nums) {
            int min = nums[0];
            int max = nums[0];
            int a = nums[0];
            for (int i = 1; i < nums.length; i++) {
                int maxX = max;
                int minX = min;
                max = Math.max(nums[i] * maxX, Math.max(nums[i], minX * nums[i]));
                min = Math.min(minX * nums[i], Math.min(nums[i], maxX * nums[i]));
                a = Math.max(max, a);
            }
            return a;


        }
    }
}
