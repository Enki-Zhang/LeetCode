import java.util.Arrays;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_416 {
    public static void main(String[] args) {
        int[] sum = {1, 2, 3, 5};
////        int[][] ints = Solution.canPartition(sum);
//        for (int[] a :
//                ints) {
//            for (int b :
//                    a) {
//                System.out.print(b + " ");
//            }
//            System.out.println();
//        }

    }

    static class Solution {
        public static boolean canPartition(int[] nums) {
            Arrays.sort(nums);

//            计算背包容量
            int sum = 0;
            for (int a :
                    nums) {
                sum += a;
            }
            if (sum % 2 != 0) {
                return false;
            }
            sum = sum / 2;

            int[][] dp = new int[nums.length][sum + 1];
            for (int i = 0; i < nums.length; i++) {
                dp[i][0] = 0;
            }
            for (int i = 0; i <= sum; i++) {
                if (i > nums[0]) {
                    dp[0][i] = nums[0];
                } else {
                    dp[0][i] = 0;
                }

            }
            for (int i = 1; i < nums.length; i++) {
                for (int j = 1; j <= sum; j++) {
                    if (j < nums[i]) {
                        dp[i][j] = dp[i - 1][j];
                    } else {
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - nums[i]] + nums[i]);
                    }
                    if (dp[i][j] == sum) {
                        return true;
                    }
                }
            }
            return false;

        }
    }
}
