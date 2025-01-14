package chain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.stream.Collectors;

/**
 * @ClassName LeetCode349
 * @Description TODO
 * @Author Enki
 * @Date 2024/10/31 11:11
 * @Verison 1.0
 **/
public class LeetCode349 {
    public static void main(String[] args) {

    }

    class Solution {
        /**
         * 给定两个数组 nums1 和 nums2 ，返回 它们的
         * 交集
         *
         * @param nums1
         * @param nums2
         * @return
         */
        public int[] intersection(int[] nums1, int[] nums2) {
            ArrayList<Integer> integers = new ArrayList<>();
            HashSet<Integer> nums1Set = new HashSet<>();
            for (int a :
                    nums1) {
                nums1Set.add(a);
            }
            for (int a :
                    nums2) {
                if (nums1Set.contains(a)) {
                    integers.add(a);
                }
            }
            return integers.stream().distinct().mapToInt(Integer::intValue).toArray();


        }
    }
}
