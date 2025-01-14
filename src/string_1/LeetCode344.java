package string_1;

/**
 * @ClassName LeetCode344
 * @Description TODO
 * @Author Enki
 * @Date 2024/11/20 16:34
 * @Verison 1.0
 **/
public class LeetCode344 {
    public static void main(String[] args) {
        char[] chars = {'h', 'e', 'l', 'l', 'o'};
        Solution solution = new LeetCode344().new Solution();
        solution.reverseString(chars);
        System.out.println(chars);

    }

    class Solution {
        /**
         * 反转字符串
         *
         * @param s
         */
        public void reverseString(char[] s) {
            // 数组可以随机存储
            for (int i = 0; i < s.length / 2; i++) {
                //交换
                char temp = s[i];
                s[i] = s[s.length - 1 - i];
                s[s.length - 1 - i] = temp;
            }
        }
    }

}
