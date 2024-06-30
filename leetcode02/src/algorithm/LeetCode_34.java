package algorithm;

/**
 * @author Enki
 * @ClassName LeetCode_34
 * @Description: TODO
 * @Date 2024/6/12 15:56
 * @Version 1.0
 */
public class LeetCode_34 {
    public static void main(String[] args) {
        int[] ints = {5, 7, 7, 8, 8, 10};
        Solution solution = new Solution();
        int[] ints1 = solution.searchRange(ints, 7);

    }

    static class Solution {
        public int[] searchRange(int[] nums, int target) {

            int mid = findTarget(nums, target);
            int left = mid;
            int right = mid;
            if (mid == -1) {
                return new int[]{-1, -1};
            }
            while (left > 0 && nums[left-1] == target) {
                left--;
            }
            while (right < nums.length - 1 && nums[right+1] == target) {
                right++;
            }
            return new int[]{left, right};

        }

        private int findTarget(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
//            int ttl = -1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] > target) {
                    right = mid - 1;
                } else if (nums[mid] < target) {
                    left = mid + 1;
                }
                if (nums[mid] == target) {
                    return mid;
                }
            }
            return -1;
        }
    }


}
