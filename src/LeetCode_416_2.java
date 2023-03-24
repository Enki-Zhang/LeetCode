import java.util.Arrays;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_416_2 {
    public static void main(String[] args) {
        int[] sum = {1, 2, 3, 5};
        Solution.canPartition(sum);
    }

    //    一维滚动数组
    static class Solution {
        public static boolean canPartition(int[] nums) {
            Arrays.sort(nums);
            int sum = 0;
            for (int a :
                    nums) {
                sum += a;
            }
            if (sum % 2 != 0) {
                return false;
            }
            sum /= 2;
            int[] dp = new int[sum + 1];
            dp[0] = 0;
//            在每一个背包内一次放入物品 背包容量从大到小 防止重复
            for (int i = 1; i < nums.length; i++) {
                for (int j = sum; j >= nums[i]; j--) {
                    dp[j] = Math.max(dp[j], dp[j - nums[i]] + nums[i]);
                    if (dp[j] == sum) {
                        return true;
                    }
                }
            }

            return dp[sum] == sum;


        }
    }
}
