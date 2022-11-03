package leetCodeHash;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_454 {
    public static void main(String[] args) {
        System.out.println();
    }

    class Solution {
        public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
            HashMap<Integer, Integer> map = new HashMap<>();
            HashMap<Integer, Integer> map2 = new HashMap<>();
            int time = 0;
            for (int i :
                    nums1) {
                for (int j :
                        nums2) {
                    int t = i + j;
                    if (map.containsKey(t)) {
                        map.put(t, map.get(t) + 1);
                    } else map.put(t, 1);
                }
            }
            for (int i :
                    nums3) {
                for (int j :
                        nums4) {
                    int k = i + j;
                    if (map.containsKey(-k)){
                        time +=map.get(-k);
                    }
                }
            }

            return time;
        }
    }
}
