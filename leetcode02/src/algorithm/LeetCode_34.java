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
    class Solution2 {
        public int[] searchRange(int[] nums, int target) {

            int left = 0;
            int right = nums.length - 1;
            int mid = 0;
            int L = left;//左边界
            int R = right;//有边界
            while (left <= right) {
                mid = left + ((right - left) >> 1);
                //               修改边界
                if (nums[mid] > target) {
//                   目标值在左边
                    right = mid - 1;
                }
                if (nums[mid] < target) {
//                    目标值在右边
                    left = mid + 1;
                }
                if (nums[mid] == target) {
                    R = mid;
                    L = mid;
//                  找到目标值
                    while (R < nums.length - 1 && nums[R + 1] <= target) {
                        R++;
                    }
                    while (L > 0 && nums[L - 1] >= target) {
                        L--;
                    }

                    return new int[]{L, R};
                }

            }
            return new int[]{-1, -1};

        }
    }

}
