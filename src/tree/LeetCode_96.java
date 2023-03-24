package tree;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_96 {
    public static void main(String[] args) {

        Solution.numTrees(3);

    }

   static class Solution {
        public static int numTrees(int n) {
            int[] dp = new int[n+1];
            dp[0] = 1;
            for (int i = 1; i <=n; i++) {
                for (int j = 1; j <=i; j++) {
                    dp[i] += dp[j - 1] * dp[i - j];
//                    System.out.println(dp[i]);
                }
            }

            return dp[n];

        }
    }
}
