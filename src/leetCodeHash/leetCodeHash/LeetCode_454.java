package leetCodeHash.leetCodeHash;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_454 {
    public static void main(String[] args) {

    }

    class Solution {
        public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
            HashMap<Integer, Integer> map = new HashMap<>();
            int num = 0;
            for (int i : nums1) {
                for (int i1 : nums2) {
                    map.put(i + i1, map.getOrDefault(i + i1, 0) + 1);
                }
            }
            for (int i : nums3) {
                for (int i1 : nums4) {
                    if (map.containsKey(-(i + i1))) {
                      num+=map.get(-(i + i1));
                    }

                }
            }

            return num;
        }
    }
}
