package leetcode;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Enki
 * @ClassName LeetCode_189
 * @Description: TODO
 * @Date 2023/9/6 10:48
 * @Version 1.0
 */
public class LeetCode_189 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 13);

    }

    /**
     * 轮转数组
     */
    static class Solution {
        public void rotate(int[] nums, int k) {

            ArrayList<Integer> integers = new ArrayList<>();
            int len = nums.length;
            k = k % len;
            for (int i = len - k; i < nums.length; i++) {
                integers.add(nums[i]);
            }
            for (int i = 0; i < len - k; i++) {
                integers.add(nums[i]);
            }
            for (int i = 0; i < nums.length; i++) {
                nums[i] = integers.get(i);
                System.out.println(nums[i]);
            }


        }
    }
}
