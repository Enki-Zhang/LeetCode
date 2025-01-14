package hashmap;

import java.util.HashMap;

/**
 * @ClassName LeetCode383
 * @Description TODO
 * @Author Enki
 * @Date 2024/11/11 9:46
 * @Verison 1.0
 **/
public class LeetCode383 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean b = solution.canConstruct("aa", "ab");
        System.out.println(b);

    }

    static class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
            // 将 magazine 转化为hashmap
            char[] chars = ransomNote.toCharArray();
            char[] chars1 = magazine.toCharArray();
            HashMap<Character, Integer> map2 = new HashMap<>();
            for (char c :
                    chars1) {
                map2.put(c, map2.getOrDefault(c, 0) + 1);
            }
            // 判断是否包含
            for (char c :
                    chars) {
                if (map2.containsKey(c) && map2.get(c) > 0) {
                    map2.put(c, map2.get(c) - 1);
                } else {
                    return false;
                }
            }
            return true;
        }
    }
}
