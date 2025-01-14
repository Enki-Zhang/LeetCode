package hashmap;

import java.util.HashMap;
import java.util.stream.Stream;

/**
 * @ClassName LeetCode454
 * @Description TODO
 * @Author Enki
 * @Date 2024/11/4 10:09
 * @Verison 1.0
 **/
public class LeetCode454 {
    public static void main(String[] args) {
        new Solution().fourSumCount(new int[]{1, 2}, new int[]{-2, -1}, new int[]{-1, 2}, new int[]{0, 2});

    }

    static class Solution {
        /**
         * 四数相加  计算两两相加的map值 将计算的结果进行对比
         *
         * @param nums1
         * @param nums2
         * @param nums3
         * @param nums4
         * @return
         */
        public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
            int num = 0;
            // map<元素和，元素和相同的个数>
            HashMap<Integer, Integer> map1 = new HashMap<>();
            for (int k : nums1) {
                for (int j : nums2) {
                    map1.put(k + j, map1.getOrDefault(k + j, 0) + 1);
                }
            }
            HashMap<Integer, Integer> map2 = new HashMap<>();
            for (int k : nums3) {
                for (int j : nums4) {
                    map2.put(k + j, map2.getOrDefault(k + j, 0) + 1);
                }
            }
//            计算对应的个数
            for (Integer integer : map1.keySet()) {
                if (map2.containsKey(-integer)) {
                    num += map1.get(integer) * map2.get(-integer);
                }
            }
            return num;

        }
    }
}
