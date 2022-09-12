package leetCodeArray;

import java.util.Arrays;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_283 {
    public static void main(String[] args) {
        int[] nums = {45192,0,-659,-52359,-99225,-75991,0,-15155,27382,59818,0,-30645,-17025,81209,887,64648};
        int[] target = Solution.moveZeroes(nums);
        System.out.println(Arrays.toString(target));


    }

    static class Solution {
        public static int[] moveZeroes(int[] nums) {
            int pointA = 0;
            int len = 0;
            while (pointA < nums.length-len ) {
                if (nums[pointA] == 0) {
                    for (int i = pointA; i < nums.length - 1; i++) {
                        int temp = nums[i];
                        nums[i] = nums[i + 1];
                        nums[i + 1] = temp;
                    }
                    len++;
                }
                if (nums[pointA] != 0) {
                    pointA++;
                }
            }
            return nums;

        }

    }


}


