package leetCodeString;

import java.util.HashMap;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_5 {
    public static void main(String[] args) {
    }

    //    最长回文子串 用双指针，尾指针从后往前遍历 直到遇见和头指针一样的字符 开始进行窗口缩小 遇见两个指针指向的字符不同便便退出，若指针可相遇则为回文记录长度并将头指针向前移动一个位置
    class Solution {
        public String longestPalindrome(String s) {
            char[] chars = s.toCharArray();
            int pre = 0;
            int back = chars.length - 1;
            boolean flag = false;
            int length = 0;
            HashMap<String, Integer> map = new HashMap<>();
            for (int i = 0; i < chars.length; i++) {
                pre = i;
                back = chars.length - 1;

//                for (int j = i; j < chars.length; j++) {
//
//                    if (chars[pre] == chars[back]){
//                        pre++;
//                        back--;
//                    }
//                }
                while (chars[pre] != chars[back]) {
                    back--;
                    flag = true;
                }
                int start = pre;
                int end = back;
                while (flag) {
                    if (pre > back) {
                        break;
                    }
                    if (chars[pre] != chars[back]) {
                        flag = false;
                    } else {
                        pre++;
                        back--;
                    }
                }
                if (flag == true) {
                    map.put(s.substring(start, end), start - end);
                }
            }
            return null;
        }
    }
}
