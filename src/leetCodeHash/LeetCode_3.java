package leetCodeHash;

import java.util.HashMap;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_3 {
    public static void main(String[] args) {
        String  s = "abcabcbb";
        int i = Solution.lengthOfLongestSubstring(s);
        System.out.println(i);

    }

    /**
     * 无重复的最长子串 双指针 尾指针从前往后 加入hashMap中 如果hashmap中有重复的则头指针移动，并更新max值
     */
  static class Solution {
        public static int lengthOfLongestSubstring(String s) {
//            存储每个字符出现的次数
            HashMap<Character, Integer> map = new HashMap<>();
            int max = 0;
            int per = 0;
            int back = 0;
            char[] chars = s.toCharArray();
//           一个字符一个字符的移动
            while (per < chars.length) {
                back = per;
//                轮数
                while (back < chars.length) {
                    if (map.containsKey(chars[back])) {
                        max = Math.max(max, map.size());
                        map.clear();
                        per++;
                        back = per;
                    } else {
                        map.put(chars[back], 0);
                        back++;
                    }
                }
            }
            return max;

        }
    }
}
