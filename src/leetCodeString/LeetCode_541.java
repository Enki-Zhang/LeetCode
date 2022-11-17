package leetCodeString;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_541 {
    public static void main(String[] args) {
        String s = "abcdabc";
        String s1 = Solution.reverseStr(s, 2);
        System.out.println(s1);
    }

    static class Solution {
        public static String reverseStr(String s, int k) {
            char[] chars = s.toCharArray();
            int pre = 0;//记录字符位置
            int back = 0;
            int now = 0;
            int tail = chars.length;
            char tmp = ' ';
            //用指针调到2k位置
            int jump = 0;

            while (tail - now >=2 * k) {
                if ((now + 1) % (2 * k) == 0) {
                    back = now - k;
                    pre = back - k + 1;
                    while (pre < back) {
                        tmp = chars[pre];
                        chars[pre] = chars[back];
                        chars[back] = tmp;
                        pre++;
                        back--;
                    }
                }
                now++;
            }

            if (tail - (now + 1) < k) {
                pre = now;
                back = tail - 1;
                while (pre < back) {
                    tmp = chars[pre];
                    chars[pre] = chars[back];
                    chars[back] = tmp;
                    pre++;
                    back--;
                }
            } else if (tail - (now + 1) < 2 * k) {
                pre = now;
                back = now + k - 1;
                while (pre < back) {
                    tmp = chars[pre];
                    chars[pre] = chars[back];
                    chars[back] = tmp;
                    pre++;
                    back--;
                }
            }
            return String.valueOf(chars);
        }


    }
}
