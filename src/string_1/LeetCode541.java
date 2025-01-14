package string_1;

/**
 * @ClassName LeetCode541
 * @Description TODO
 * @Author Enki
 * @Date 2024/11/22 19:32
 * @Verison 1.0
 **/
public class LeetCode541 {
    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        Solution solution = new LeetCode541().new Solution();
        String s1 = solution.reverseStr(s, k);
        System.out.println(s1);
    }

    class Solution {
        /**
         * 反转指定长度的字符串
         *
         * @param s
         * @param k
         * @return
         */
        public String reverseStr(String s, int k) {
            char[] chars = s.toCharArray();
            int len = s.length();
            int start = 0;
            while (start < len) {
                int end = Math.min(start + k - 1, len - 1);//确定翻转的结束位置
                for (int i = start, j = end; i < j; i++, j--) {
                    char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }
                start += 2 * k;
            }
            return new String(chars);
        }

    }
}
