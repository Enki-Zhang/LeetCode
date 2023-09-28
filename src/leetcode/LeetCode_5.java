package leetcode;

/**
 * @author Enki
 * @ClassName LeetCode_5
 * @Description: TODO
 * @Date 2023/8/27 13:47
 * @Version 1.0
 */
public class LeetCode_5 {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        System.out.println(solution.longestPalindrome("babad"));

    }

    /**
     * 暴力 双指针
     */
    static class Solution {
        public String longestPalindrome(String s) {
            if (s.length() <= 1) {
                return s;
            }
            if (isHui(s)) {
                return s;
            }
            int left = 0;
            int right = left;
            int index = 0;
            String string = null;
            int max = Integer.MIN_VALUE;
//            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                for (int j = s.length(); j > i; j--) {
                    if (isHui(s.substring(i, j))) {
                        max = Math.max(j - i, max);
                        if (max == j - i) string = s.substring(i, j);
                    }
                }
            }
            System.out.println(max);
            return string;
        }

        private boolean isHui(String s) {
            for (int i = 0; i < s.length() / 2; i++) {
                if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                    return false;
                }
            }
            return true;
        }
    }

    private boolean isHui(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    /**
     * P(i,j)=P(i+1,j−1)∧(num[i] == num[i+1])
     */
    static class Solution2 {
        public String longestPalindrome(String s) {
            int max = 0;
            String tar = "";
            boolean[][] dp = new boolean[s.length()][s.length()];
            for (int len = 2; len < s.length(); len++) {//len
                for (int left = 0; left < s.length(); left++) {//左边界
                    int right = left + len - 1;
                    if (right >= s.length()) {
                        break;
                    }
                    if (s.charAt(right) != s.charAt(left)) {
                        dp[left][right] = false;
                    } else {
                        if (right - left < 3) {
                            dp[left][right] = true;
                        } else {
                            dp[left][right] = dp[left + 1][right - 1];
                        }
                    }

                    if (dp[left][right] && right - left + 1 > max) {
                        max = right - left + 1;
                        tar = s.substring(left, right+1);
                    }
                }

            }
            return tar;
        }
    }
}
