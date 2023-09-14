/**
 * @author Enki
 * @ClassName LeetCode_1143
 * @Description: TODO
 * @Date 2023/9/10 10:50
 * @Version 1.0
 */
public class LeetCode_1143 {
    public static void main(String[] args) {

    }

    /**
     *二维数组遍历 dp[i][j] i=text1的起点到j=text2的终点
     * dp[i][j] = dp[i-1][j-1] + 1;(text1 == text2)
     * || = dp[i][j-1] dp[i-1][j]
     */
    class Solution {
        public int longestCommonSubsequence(String text1, String text2) {
            int[][] dp = new int[text1.length()][text2.length()];
            for (int i = 0; i < text2.length(); i++) {
                if (text1.charAt(0) == text2.charAt(i)) {
                    dp[0][i] = 1;
                }
            }
            for (int i = 0; i < text1.length(); i++) {
                if (text1.charAt(i) == text2.charAt(0)) {
                    dp[i][0] = 1;
                }
            }

            for (int i = 1; i < text1.length(); i++) {
                for (int j = 1; j < text2.length(); j++) {
                    if (text1.charAt(i) == text2.charAt(j)) {
                        dp[i][j] = 1;
                    }

                }
            }
            return 0;
        }
    }
}
