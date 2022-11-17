package leetCodeString;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_344 {
    public static void main(String[] args) {
        String str = "HELLO";
        char[] chars = str.toCharArray();
        Solution.reverseString(chars);
        System.out.println(String.valueOf(chars));
    }

    //原地翻转字符串
   static class Solution {
        public static void reverseString(char[] s) {
            int pre = 0;//前指针
            int back = s.length - 1;
            char tmp = ' ';
            while (pre < back) {
                tmp = s[pre];
                s[pre] = s[back];
                s[back] = tmp;
                pre++;
                back--;
            }
        }
    }
}
