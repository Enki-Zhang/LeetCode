package leetCodeArray.leetCodeArray_2;

import java.util.HashSet;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_3 {
    public static void main(String[] args) {
    }

    static class Solution {
        public static int lengthOfLongestSubstring(String s) {
            int len = s.length();
            HashSet<Character> window = new HashSet<>();
            int left = 0;
            int right = 0;
            int size =0;
            while (right < len) {
                char c = s.charAt(right);
                right++;
                while (window.contains(c)) {
                    window.remove(s.charAt(left));
                    left++;
                }
                window.add(c);
                size = Math.max(window.size(), size);
            }
            return size;
        }
    }
}
