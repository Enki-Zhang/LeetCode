package leetCodeHash;

import java.util.HashMap;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_3_2 {
    public static void main(String[] args) {
        String  s = "abcabcbb";
        int i =Solution.lengthOfLongestSubstring(s);
        System.out.println(i);

    }

    static class Solution {
        public static int lengthOfLongestSubstring(String s) {
            //滑动窗口 控制窗口的大小
            HashMap<Character, Integer> map = new HashMap<>();
            int max = 0;
            int left = 0;
            int right = 0;
            char[] chars = s.toCharArray();
            while (left < chars.length - 1) {
                right = left;
                while (right < chars.length - 1) {
                    if (!map.containsKey(chars[right])) {
                        map.put(chars[right],1);
                        right++;
                    }else {
                        max = Math.max(map.size(),max);
                        map.clear();
                        left++;
                        right = left;
                    }
                }

            }
            return max;


        }
    }
}
