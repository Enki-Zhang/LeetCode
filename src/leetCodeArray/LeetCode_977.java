package leetCodeArray;

import java.util.Arrays;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_977 {
    public static void main(String[] args) {
        int [] nums = {-4,-1,0,3,10};
        int[] target = Solution.sortedSquares(nums);
        System.out.println(Arrays.toString(target));

    }
  static class Solution {
        public static int[] sortedSquares(int[] nums) {
            for (int i =0 ;i< nums.length;i++){
                if (nums[i]<0){
                   nums[i] = Math.abs(nums[i]);
                }
            }
            Arrays.sort(nums);
            for (int i = 0;i < nums.length;i++){
                nums[i] = nums[i]* nums[i];
            }

            return nums;

        }
    }
}
