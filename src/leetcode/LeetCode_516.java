package leetcode;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Enki
 * @ClassName LeetCode_516
 * @Description: TODO
 * @Date 2023/8/27 13:35
 * @Version 1.0
 */
public class LeetCode_516 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestPalindromeSubseq("bbbbab"));

    }

    /**
     * 最长回文子串 回溯分割并优化
     */
    static class Solution {

        public int longestPalindromeSubseq(String s) {
            int[][] dp = new int[s.length()][s.length()];
            for (int i = s.length() - 1; i >= 0; i--) {
                dp[i][i] = 1;
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        dp[i][j] = dp[i + 1][j - 1] + 2;
                    } else {
                        dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                    }

                }

            }
            return dp[0][s.length() - 1];
        }
    }
}
