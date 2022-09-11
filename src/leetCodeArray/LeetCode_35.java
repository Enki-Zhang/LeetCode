package leetCodeArray;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_35 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        int index = Solution.searchInsert(nums, target);
        System.out.println(index);

    }

    static class Solution {
        public static int searchInsert(int[] nums, int target) {
            return getInsertAndIndex(nums, target, 0, nums.length - 1);
        }

        //二分查找并返回目标索引否则返回要插入的索引
        public static int getInsertAndIndex(int[] nums, int target, int left, int right) {
            int middle = (left + right) / 2;
            while (left <= right) {
                middle = (left + right) / 2;
                if (nums[middle] < target) {
                    left = middle + 1;
                }
                if (target < nums[middle]) {
                    right = middle - 1;
                }
                if (nums[middle] == target) {
                    return middle;
                }
            }
//            如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
            if (right < left) {
                return left;
            }
            return right;
        }
    }
}
