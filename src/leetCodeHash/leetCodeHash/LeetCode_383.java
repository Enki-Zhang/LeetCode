package leetCodeHash.leetCodeHash;

import java.util.HashMap;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_383 {
    public static void main(String[] args) {

    }

    class Solution {
        public boolean canConstruct(String ransomNote, String magazine) {
            HashMap<Character, Integer> map = new HashMap<>();
            char[] ran = ransomNote.toCharArray();
            char[] mag = magazine.toCharArray();
            for (char c : mag) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            for (char c : ran) {
                if (!map.containsKey(c)) {
                    return false;
                } else {
                    map.put(c, map.get(c) - 1);
                    if (map.get(c) < 0) {
                        return false;
                    }
                }
            }
            return true;

        }
    }
}
