package leetcode;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Enki
 * @ClassName LeetCode_3
 * @Description: TODO
 * @Date 2023/9/15 10:25
 * @Version 1.0
 */
public class LeetCode_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s);
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring(s));


    }

    /**
     * 找出不重复的最长子串 滑动窗口 map在这里的作用是记录每次元素最后出现的位置 当下一个是重复元素时 左边left指针需要移动到的重复元素的下一个位置
     */
    static class Solution2 {

        public int lengthOfLongestSubstring(String s) {
            if (s.equals("")) {
                return 0;
            }
            if (s.length() == 1) {
                return 1;
            }
            int left = 0;
            int right = 0;
            int len = 0;
            HashMap<Character, Integer> map = new HashMap<>();
            while (right < s.length()) {
                char key = s.charAt(right);
                if (map.containsKey(key) && map.get(key) >= left) {
//                    重复的化查找map找到重复元素最近一次出现的位置 并跟新left
                    left = map.get(key) + 1;//将出现重复的元素排除 此时map.get(key)得到的是重复元素第一次出现的位置 right位置的元素还未加入到map中去
                }
                map.put(key, right);
                len = Math.max(right - left + 1, len);
//                更新右边窗口
                right++;
            }
            return len;
        }
    }

    /**
     * 无重复字符的最长子串 使用HashMap记录每个窗口中使用的情况
     */
    static class Solution3 {
        public int lengthOfLongestSubstring(String s) {
            HashMap<Character, Integer> map = new HashMap<>();
            int left = 0;
            int right = 0;
            int length = 0;
            while (right < s.length()) {
                char key = s.charAt(right);//判断加入的元素是否市重复的
                if (map.containsKey(key) && map.get(key) >= left) { // 重复的则更新左边边界到重复元素后面
                    left = map.get(key) + 1;
                }
                map.put(key, right);
                length = Math.max(length, right - left + 1);
                right++;
            }
            return length;

        }
    }

    /**
     * 不适用hashMap 使用双指针 如何判断重复 :使用一个ASCLL码记录字符出现的位置
     */
    static class Solution {
        public int lengthOfLongestSubstring(String s) {
            int left = 0;
            int right = 0;
            int length = 0;
            boolean[] isShow = new boolean[128];
            while (right < s.length()) {
                char c = s.charAt(right);
                if (isShow[c]) {
//                    重复更新左边界
                    char charLeft = s.charAt(left);
                    isShow[charLeft] = false;
                    left++;
                }else {
//                    不重复 更新右边界
                    isShow[c] = true;
                    right++;
                    length = Math.max(length, right - left);
                }
            }
            return length;

        }
    }

}
