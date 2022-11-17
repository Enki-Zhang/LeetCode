package leetCodeString;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_Sw_58II {
    public static void main(String[] args) {
    }

    class Solution {
        public String reverseLeftWords(String s, int n) {
            char[] chars = s.toCharArray();
            StringBuilder stringBuilder = new StringBuilder();
            char[] chars1 = new char[chars.length-n];
            char[] chars2 = new char[n];
            for (int i = n,j=0; i < chars.length; i++,j++) {
                chars1[j] = chars[i];
            }
            String s1 = String.valueOf(chars1);
            stringBuilder.append(s1);

            for (int i = 0; i < n; i++) {
                chars2[i] = chars[i];
            }
            String s2 = String.valueOf(chars2);
            stringBuilder.append(s2);
            return stringBuilder.toString();
        }
    }
}
