package leetcode;

/**
 * @author Enki
 * @ClassName LeetCode_931
 * @Description: TODO
 * @Date 2023/8/27 10:43
 * @Version 1.0
 */
public class LeetCode_931 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minFallingPathSum(new int[][]{{2, 1, 3}, {6, 5, 4}, {7, 8, 9}}));

    }

    /**
     *
     */
    static class Solution {
        public int minFallingPathSum(int[][] matrix) {
            int length = matrix.length;
//            扩充两列
            int[][] dp = new int[length][length + 2];
            for (int i = 0; i < length; i++) {
                dp[i][0] = Integer.MAX_VALUE;
            }
            for (int i = 0; i < length; i++) {
                dp[i][length + 1] = Integer.MAX_VALUE;
            }
//            初始化 第一列
            for (int i = 1; i <= length; i++) {
                dp[0][i] = matrix[0][i-1];
            }
            for (int i = 1; i < length; i++) {
                for (int j = 1; j <= length; j++) {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1], dp[i - 1][j]), dp[i - 1][j + 1]) + matrix[i][j - 1];
                }
            }
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < dp[0].length; i++) {
                min = Math.min(dp[length - 1][i], min);
            }
            return min;
        }
    }
}
