package algorithm;

import javafx.util.BuilderFactory;

/**
 * @author Enki
 * @ClassName LeetCode_35
 * @Description: TODO
 * @Date 2024/6/14 16:17
 * @Version 1.0
 */
public class LeetCode_35 {
    public static void main(String[] args) {
        System.out.println("测试工作目录");
    }


    class Solution {
        public int searchInsert(int[] nums, int target) {
            return findTarget(nums, target);
        }

        private int findTarget(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] < target) {
                    left = mid + 1;
                } else if (nums[right] > target) {
                    right = mid - 1;
                } else {
                    return mid;
                }
            }
            return left;
        }
    }
}
