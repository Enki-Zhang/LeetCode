import java.util.List;

/**
 * @author Enki
 * @ClassName LeetCode_120
 * @Description: TODO
 * @Date 2023/8/27 9:33
 * @Version 1.0
 */
public class LeetCode_120 {
    public static void main(String[] args) {
        Solution solution = new Solution();


    }

    /**
     *
     */
    static class Solution {
        public int minimumTotal(List<List<Integer>> triangle) {
            int max = Integer.MIN_VALUE;
            int length = triangle.size();
            int[][] dp = new int[length][length];
            dp[0][0] = triangle.get(0).get(0);
//           初始化
            for (int i = 1; i < length; i++) {
                dp[i][0] = triangle.get(i).get(0) + dp[i - 1][0];
            }
            for (int i = 1; i < length; i++) {
                dp[i][i] = triangle.get(i).get(triangle.get(i).size() - 1) + dp[i - 1][i - 1];
            }
            for (int[] a :
                    dp) {
                for (int b :
                        a) {
                    System.out.print(b + " ");
                }
                System.out.print("&");
            }
            for (int i = 2; i < length; i++) {
                for (int j = 1; j < i; j++) {
                    dp[i][j] = Math.min(dp[i - 1][j - 1] + triangle.get(i).get(j), dp[i - 1][j] + triangle.get(i).get(j));
                }
            }
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                min = Math.min(dp[length - 1][i], min);
            }
            return min;

        }
    }
}
