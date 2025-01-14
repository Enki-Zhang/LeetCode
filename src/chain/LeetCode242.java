package chain;

import java.util.HashMap;

/**
 * @ClassName LeetCode242
 * @Description TODO
 * @Author Enki
 * @Date 2024/10/30 15:14
 * @Verison 1.0
 **/
public class LeetCode242 {
    public static void main(String[] args) {

    }


    class Solution {
        /**
         * 判断是否是字母异味表
         *
         * @param s
         * @param t
         * @return
         */
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) {
                return false;
            }
//            t 包含s的所有字符
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                map.put(s.charAt(i),
                        map.getOrDefault(s.charAt(i), 0) + 1);
            }
            for (int i = 0; i < t.length(); i++) {
                if (!map.containsKey(t.charAt(i))) {
                    return false;
                }
                map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
            }
//            查看map的值
            for (Character key :
                    map.keySet()) {
                if (map.get(key) != 0) {
                    return false;
                }
            }
            return true;

        }
    }
}
