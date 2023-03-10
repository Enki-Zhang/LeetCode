package leetCodeArray.leetCodeArray_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_76 {
    public static void main(String[] args) {
        int[] ints = {1, 2, 2, 1};
        int[] num = {2, 2};
        int[] intersection = Solution.intersection(ints, num);
        System.out.println(intersection);


    }

    static class Solution {
        public static int[] intersection(int[] nums1, int[] nums2) {
            HashSet<Integer> set = new HashSet<>();
            HashSet<Integer> set1 = new HashSet<>();
            ArrayList<Integer> integers = new ArrayList<>();
            for (int i : nums1) {
                set.add(i);
            }
            for (int i : nums2) {
                if (set.contains(i)) {
                    set1.add(i);
                }
            }
            integers.addAll(set1);


            return integers.stream().mapToInt(Integer::intValue).toArray();


        }
    }

}
