package leetCodeString.string;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_5 {
    public static void main(String[] args) {
        String s = "aaa";
        String substring = s.substring(0, s.length());
        System.out.println(substring);
        boolean hui = Solution.isHui(s);
        System.out.println(hui);

    }

    static class Solution {
        public String longestPalindrome(String s) {
            if (s.length() == 0) {
                return "";
            }
            if (isHui(s)) {
                return s;
            }
            String tar = "";
            int max = 0;
            for (int left = 0; left < s.length(); left++) {
                for (int right = s.length() ; right > left; right--) {
                    if (isHui(s.substring(left, right))) {
                        if (s.substring(left, right).length() > max) {
                            tar = s.substring(left, right);
                            max = tar.length();
                        }
                    }
                }
            }
            return tar;

        }

        public static boolean isHui(String s) {
            for (int i = 0; i < s.length() / 2; i++) {
                if (s.charAt(i) != s.charAt(s.length() - i - 1))
                    return false;
            }
            return true;

        }
    }
}
