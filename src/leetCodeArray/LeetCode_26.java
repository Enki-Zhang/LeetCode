package leetCodeArray;

import java.util.Arrays;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_26 {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int ints = Solution.removeDuplicates(nums);
        System.out.println(ints);
    }

    static class Solution {
        public static int removeDuplicates(int[] nums) {
            int pointA = 0;
            int pointB = 1;
            int tag = 1;
            int len = 0;

            while ( pointB != nums.length - len ) {
                if (nums[pointA] == nums[pointB]) {
                    tag = pointB;
                    // B指向的元素等于A 将B以后的元素前移
                    for (int j = tag + 1; j < nums.length; j++) {
                        nums[j - 1] = nums[j];
                    }
                    len++;//记录删除元素的个数
                }
                if (nums[pointA] != nums[pointB]) {
                    pointA++;
                    pointB++;
                }
            }
            return nums.length - len;
        }

    }
}
