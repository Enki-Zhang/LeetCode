/**
 * @author Enki
 * @ClassName LeetCode_704
 * @Description: TODO
 * @Date 2023/9/5 11:54
 * @Version 1.0
 */
public class LeetCode_704 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
    }

    static class Solution {
        public int search(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (nums[mid] > target) {
                    right = mid - 1;
                }
                if (nums[mid] < target) {
                    left= mid + 1;
                }
                if (nums[mid] == target) {
                    return mid;
                }
            }
            return -1;

        }
    }
}
