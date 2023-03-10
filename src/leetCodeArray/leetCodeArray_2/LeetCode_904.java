package leetCodeArray.leetCodeArray_2;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_904 {
    public static void main(String[] args) {

    }

    static class Solution {
        public static int totalFruit(int[] fruits) {
            int len = fruits.length;
            HashMap<Integer, Integer> map = new HashMap<>();
            int num = 2;
            int left = 0;
            int right = 0;
            int size = 0;
            while (right < len) {
                map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);
                right++;
                while (map.size() > 2) {
                    map.put(fruits[left], map.get(fruits[left]) - 1);
                    if (map.get(fruits[left]) == 0) {
                        map.remove(fruits[left]);
                    }
                    left++;
                }
                size = Math.max(size, right - left);
            }
            return size;
        }
    }

}
