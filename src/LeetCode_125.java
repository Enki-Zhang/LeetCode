import java.util.Arrays;
import java.util.Objects;

/**
 * @author Enki
 * @ClassName LeetCode_125
 * @Description: TODO
 * @Date 2023/8/20 15:08
 * @Version 1.0
 */
public class LeetCode_125 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome("0p"));
        System.out.println(solution.isHui("0p"));

    }

    /**
     * 验证回文串
     */
    static class Solution {
        public boolean isPalindrome(String s) {
//            大写转为小写
            s = s.trim();
            String s1 = s.toLowerCase();
            char[] chars = s1.toCharArray();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] >= 97 && chars[i] <= 122) {
                    chars[i] = chars[i];
                } else if (chars[i] >= 48 && chars[i] <= 57) {
                    chars[i] = chars[i];
                } else {
                    chars[i] = ' ';

                }
                stringBuilder.append(chars[i]);
            }
//            System.out.println(stringBuilder);
            String replace = stringBuilder.toString().replace(" ", "");
//            System.out.println(replace);
            return isHui(replace);
        }

        private boolean isHui(String s) {
            for (int i = 0; i < s.length() / 2; i++) {
                if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                    return false;
                }
            }
            return true;
        }
    }
}
