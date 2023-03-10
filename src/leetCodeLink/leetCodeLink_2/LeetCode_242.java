package leetCodeLink.leetCodeLink_2;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_242 {
    public static void main(String[] args) {

    }

    class Solution {
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) {
                return false;
            }
            int[] str = new int[26];
            for (int i = 0; i < s.length(); i++) {
                str[s.charAt(i) - 'a']++;
                str[t.charAt(i) - 'a']--;
            }
            for (int i = 0; i < str.length; i++) {
                if (str[i] != 0) {
                    return false;
                }
            }
            return true;

        }
    }
}
