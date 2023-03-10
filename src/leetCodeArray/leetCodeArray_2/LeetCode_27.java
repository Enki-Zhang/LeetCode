package leetCodeArray.leetCodeArray_2;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_27 {
    //    快慢指针 慢指针定位更新后的数组。快指针找到删除元素后的数组
    static class Solution {
        public static int removeElement(int[] nums, int val) {
            int slow = 0;
            for (int fast = 0; fast < nums.length; fast++) {
//                fast找目标数组
                if (nums[fast] != val) {
                    nums[slow] = nums[fast];
                    slow++;
                }
            }
            return slow;
        }
    }
}

