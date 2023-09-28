package leetcode;

import java.util.ArrayList;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_9 {
    public static void main(String[] args) {
        boolean palindrome = new Solution().isPalindrome(-121);
        System.out.println(palindrome);


    }

    static class Solution {
        public boolean isPalindrome(int x) {
            String s = "";
            while (x != 0) {
                int tail = x % 10;
                s += tail + "";
                x /= 10;
            }
            for (int i = 0; i < s.length() / 2; i++) {
                if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                    return false;
                }
            }
            System.out.println(s);

            return true;

        }
    }
}
