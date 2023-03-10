package leetCodeArray.leetCodeArray_2;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_26 {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int i = Solution.removeDuplicates(nums);
        System.out.println(i);

    }

    //原地删除重复元素
    static class Solution {
        public static int removeDuplicates(int[] nums) {
            int slow = 0;
            for (int fast = 0; fast < nums.length; fast++) {
                if (nums[fast] != nums[slow]) {
                    nums[slow+1]=nums[fast];
                    slow++;
                }
            }
            return slow+1;

        }
    }


}
