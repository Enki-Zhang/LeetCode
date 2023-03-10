package leetCodeArray.leetCodeArray_2;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_977 {
    public static void main(String[] args) {
        int a = 0;

    }

    static class Solution {
        public int[] sortedSquares(int[] nums) {
            int left = 0;
            int right = nums.length - 1;
            int[] newNums = new int[nums.length];
            int index = nums.length - 1;
            while (left <= right) {
                if (nums[left] * nums[left] > nums[right] * nums[right]) {
                    newNums[index] = nums[left] * nums[left];
                    left++;
                } else {
                    newNums[index] = nums[right] * nums[right];
                    right--;
                }
                index--;
            }

            return newNums;


        }
    }
}
