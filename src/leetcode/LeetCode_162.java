package leetcode;

import java.util.Arrays;

/**
 * @author Enki
 * @ClassName LeetCode_162
 * @Date 2023/8/12 9:38
 * @Version 1.0
 */
public class LeetCode_162 {
    public static void main(String[] args) {

    }

    /**
     * 寻找峰值 暴力遍历
     */
    class Solution {
        public int findPeakElement(int[] nums) {
            int index = 0;
            for (int i = 0; i < nums.length; i++) {
                if (i > 0 && nums[i] > nums[i - 1]) {
                    index = i;
                }
            }

            if (nums.length == 1) {
                return 0;
            } else if (nums.length == 2) {
                if (nums[0] < nums[1]) {
                    return 1;
                } else return 0;
            }
            return index;
        }
    }
}
