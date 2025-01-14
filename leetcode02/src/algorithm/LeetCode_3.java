package algorithm;

import java.util.HashMap;

/**
 * @ClassName LeetCode_3
 * @Description 无重复最长子串
 * @Author Enki
 * @Date 2025/1/13 17:20
 * @Verison 1.0
 **/
public class LeetCode_3 {
    public static void main(String[] args) {
        int abcabcbb = new LeetCode_3().new Solution().lengthOfLongestSubstring("dvdf");
        System.out.println(abcabcbb);
    }

    class Solution {
        /**
         * 无重复的字符子串 使用滑动窗口 无重复使用hashmap
         *
         * @param s
         * @return
         */
        public int lengthOfLongestSubstring(String s) {
            if (s.length() < 1) {
                return 0;
            }
            int max = 0;

            // 使用滑动窗口
            HashMap<Character, Integer> window = new HashMap<>();
            int start = 0;
            while (start < s.length()) {
                window.put(s.charAt(start), start);
                max = Math.max(max, window.size());
                int j = start + 1;
                while (j < s.length()) {
                    // 无重复子串判断
                    if (!window.containsKey(s.charAt(j))) {
                        window.put(s.charAt(j), j);
                        j++;
                    } else {
                        max = Math.max((j - start), max);
                        // 子串重复
                        window.clear();
                        break;
                    }
                }
                start++;

            }
            return max;
        }
    }

}
