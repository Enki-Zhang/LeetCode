package StackAndQueue;

import java.util.Arrays;

/**
 * @author Enki
 * `@Version 1.0
 */
public class LeetCode_239 {
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] ints = Solution.maxSlidingWindow(nums, k);
        System.out.println(Arrays.toString(ints));


    }

    //暴力
    static class Solution {
        public static int[] maxSlidingWindow(int[] nums, int k) {
            int max = -99999;
            int[] target = new int[nums.length - k + 1];
            for (int i = 0; i < target.length; i++) {
                max = -99999;
                for (int j = i; j < i + k && j < nums.length; j++) {
                    if (max < nums[j]) {
                        max = nums[j];
                    }
                }
                target[i] = max;
            }
            return target;
        }
    }

}
