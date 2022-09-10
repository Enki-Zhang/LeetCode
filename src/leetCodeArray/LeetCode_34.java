package leetCodeArray;

import java.util.Arrays;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_34 {
    public static void main(String[] args) {
        int[] nums = {1};
        int target = 1;
        int[] index = Solution.searchRange(nums, target);
        System.out.println(Arrays.toString(index));

    }

    static class Solution {
        public static int[] searchRange(int[] nums, int target) {
            return getIndexOfStartAndEnd(nums, target, 0, nums.length-1 );
        }

        public static int[] getIndexOfStartAndEnd(int[] nums, int target, int left, int right) {
            int middle = (left + right) / 2;
            int targetLeft = -1;
            int targetRight = -1;
            int indexLeft = -1;
            int indexRight = -1;
            int[] targetNums = {-1, -1};
            int max = right;


            boolean isTarget = false;
            while (left <= right) {
                middle = (left + right) / 2;
                if (nums[middle] < target) {
                    left = middle + 1;
                }
                if (target < nums[middle]) {
                    right = middle - 1;
                }
                if (nums[middle] == target) {
                    isTarget = true;
                    targetLeft = middle;
                    targetRight = middle;
                    break;
                }
            }

            while (isTarget) {

                if (  targetLeft >=0 &&nums[targetLeft] == target) {
                    targetLeft--;
                } else {
                    indexLeft = targetLeft+1;
                    break;
                }
            }
            while (isTarget) {
                if (targetRight<= max && nums[targetRight] == target ) {
                    targetRight++;
                } else {
                    indexRight = targetRight-1;
                    break;
                }
            }

            if (!isTarget) {
                targetNums[0] = -1;
                targetNums[1] = -1;
                return targetNums;
            }
            targetNums[0] = indexLeft;
            targetNums[1] = indexRight;
            return targetNums;

        }
    }

}
