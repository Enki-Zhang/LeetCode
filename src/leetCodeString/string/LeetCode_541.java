package leetCodeString.string;

import java.util.Arrays;

/**
 * @author Enki
 * @Version 1.0
 */
class LeetCode_541 {
    public static void main(String[] args) {
    }

        class Solution {
            public String reverseStr(String s, int k) {
                int length = s.length();
                char[] chars = s.toCharArray();
                int i = 0;
                for (i = 0; i < length; i += 2 * k) {
                    rever(chars, i, Math.min(i + k, length) - 1);
                }
    //            if (length - (i-2*k) < k) {
    //                rever(chars, i, length - 1);
    //            } else if (length - (i-2*k) < 2 * k) {
    //                rever(chars,i,i+=k-1);
    //            }
                return new String(chars);
            }

            public void rever(char[] s, int pre, int back) {
    //            int pre = 0;//前指针
    //            int back = s.length - 1;
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
