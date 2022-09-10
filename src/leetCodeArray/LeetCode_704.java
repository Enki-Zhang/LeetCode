package leetCodeArray;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_704 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 13;
        int index = Solution.search(nums, target);
        System.out.println(index);
    }

    static class Solution {
        public static int search(int[] nums, int target) {
            int index;
            return index = getIndex(nums, target, 0, nums.length-1);
        }

        public static int getIndex(int[] nums, int target, int left, int right) {
            int middle = (left + right) / 2;
            while (left <= right) {
                middle = (left + right) / 2;
                if (target > nums[middle]) {
                    left = middle+1;
                }
                if (target < nums[middle]) {
                   right = middle-1;
                } else  if(nums[middle] == target){
                    return middle;
                }
            }
            return -1;
        }
    }
}
