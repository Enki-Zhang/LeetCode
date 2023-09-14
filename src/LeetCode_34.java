/**
 * @author Enki
 * @ClassName LeetCode_34
 * @Description: TODO
 * @Date 2023/9/12 10:07
 * @Version 1.0
 */
public class LeetCode_34 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = solution.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8);
        for (int a :
                ints) {
            System.out.print(a + " ");
        }

    }

    static class Solution {
        public int[] searchRange(int[] nums, int target) {
            return getIndex(nums,target,0,nums.length-1);
        }

        private int[] getIndex(int[] nums, int target, int left, int right) {
            int start = -1;
            int end = -1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] > target) {
                    right = mid - 1;
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    start = mid;
                    right = mid - 1;
                }
            }
            left = 0;
            right = nums.length - 1;
            while (left <=right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] > target) {
                    right = mid - 1;
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    end = mid;
                    left = mid + 1;
                }
            }
            return new int[]{start, end};
        }

    }
}
