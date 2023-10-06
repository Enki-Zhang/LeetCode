package leetcode;

/**
 * @author Enki
 * @ClassName LeetCode_34_2
 * @Description: TODO
 * @Date 2023/10/5 10:40
 * @Version 1.0
 */
public class LeetCode_34_2 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = solution.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8);
        for (int anInt : ints) {
            System.out.println(anInt + " ");
        }

    }

    /**
     * todo 使用二分查找找到目标数字
     */
    static class Solution {
        public int[] searchRange(int[] nums, int target) {
            return getTargetArr(nums, target, 0, nums.length - 1);

        }

        private int[] getTargetArr(int[] nums, int target, int left, int right) {

            int start = -1;
            int end = -1;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] < target) {
                    left = mid + 1;
                } else if (nums[mid] > target) {
                    right = mid - 1;
                } else {
                    start = mid;
                    end = mid;
                    while (start >= 0 && nums[start] == target) {
                        start--;
                    }
                    while (end <= nums.length - 1 && nums[end] == target) {
                        end++;
                    }
                    left = right + 1;
                }
            }
            if (start == -1 && end == -1) {
                return new int[]{-1, -1};
            }
            return new int[]{start + 1, end - 1};
        }

    }
}
