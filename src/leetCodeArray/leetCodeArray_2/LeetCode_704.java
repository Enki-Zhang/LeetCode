package leetCodeArray.leetCodeArray_2;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_704 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 13;
        int search = Solution.search(nums, 0);
        System.out.println(search);
    }

   static class Solution {
        public static int search(int[] nums, int target) {

            return binarySearch(0, nums.length - 1, target, nums);

        }

        public static int binarySearch(int left, int right, int target, int[] arrays) {
            int middle = (left + right) / 2;
            while (left <= right) {
                if (arrays[middle] > target) {
                    right = middle - 1;
                    middle = (left + right) / 2;
                }
                if (arrays[middle] < target) {
                    left = middle + 1;
                    middle = (left + right) / 2;
                }
                if (arrays[middle] == target) {
                    return middle;
                }
            }
            return -1;


        }

    }
}
