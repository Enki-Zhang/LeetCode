package algorithm;

/**
 * @ClassName LeetCode_5
 * @Description TODO
 * @Author Enki
 * @Date 2025/1/10 10:30
 * @Verison 1.0
 **/
public class LeetCode_5 {
    public static void main(String[] args) {
        String s = "cbbd";
        Solution solution = new LeetCode_5().new Solution();
        String s1 = solution.longestPalindrome(s);
        System.out.println(s1);
    }

    class Solution {
        public String longestPalindrome(String s) {
            if (s.length() <= 1) {
                return s;
            }
            String tar = "";
            for (int head = 0; head < s.length(); head++) {
                for (int tail = s.length() - 1; tail >= head; tail--) {
                    // 从尾指针开始判断 减少判断回文次数
                    if (s.charAt(tail) != s.charAt(head)) {
                        continue;
                    }
                    // 判断回文 更新长度
                    if (checkHui(s, head, tail) && tar.length() < s.substring(head, tail + 1).length()) {
                        tar = s.substring(head, tail + 1);
                        break;
                    }
                }
            }
            return tar;
        }

        public boolean checkHui(String s, int head, int tail) {
            // 回文判断
            while (tail > head) {
                if (s.charAt(head) != s.charAt(tail)) {
                    return false;
                }
                head++;
                tail--;
            }
            return true;
        }
    }
}
