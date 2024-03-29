package leetcode;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_459 {
    public static void main(String[] args) {
    }

    class Solution {
        public boolean repeatedSubstringPattern(String s) {
            int n = s.length();
            for (int i = 1; i < s.length() / 2; i++) {
                if (n % i == 0) {
                    boolean match = true;
                    for (int j = i; j < n; j++) {
                        if (s.charAt(j) != s.charAt(j - i)) {
                            match = false;
                            break;
                        }
                    }
                    if (match) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
