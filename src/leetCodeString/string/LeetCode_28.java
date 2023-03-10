package leetCodeString.string;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_28 {
    public static void main(String[] args) {

    }

    class Solution {
        public int strStr(String haystack, String needle) {
            if (needle.length() > haystack.length()) {
                return -1;
            }

            for (int i = 0; i < haystack.length(); i++) {
                if (haystack.charAt(i) == needle.charAt(0)) {
                    int m = i;

                    for (int j = 0; j < needle.length(); j++, m++) {
                        if (m>haystack.length()||haystack.charAt(m) != needle.charAt(j)) {
                            break;
                        }
                    }
                    if (m-i == needle.length()) {
                        return i;
                    }
                }
            }
            return -1;
        }
    }
}
