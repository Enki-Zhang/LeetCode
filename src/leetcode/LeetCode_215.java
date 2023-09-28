package leetcode;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Enki
 * @ClassName LeetCode_215
 * @Description: TODO
 * @Date 2023/9/17 14:14
 * @Version 1.0
 */
public class LeetCode_215 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] nums = new int[n];
//        for (int i = 0; i < n; i++) {
//            nums[i] = scanner.nextInt();
//        }

        Solution solution = new Solution();
        System.out.println(solution.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));


    }

    /**
     * 数组中的第K个最大元素 快排
     */
    static class Solution {
        public int findKthLargest(int[] nums, int k) {
//            todo
            int[] ints = quickSort(nums, 0, nums.length - 1);
            return ints[nums.length - k];
        }

        private int[] quickSort(int[] nums, int left, int right) {
            if (left < right) {
                int index = div(nums, left, right);
                quickSort(nums, left, index - 1);
                quickSort(nums, index + 1, right);
            }
            return nums;
        }

        private int div(int[] nums, int left, int right) {
            int temp = nums[left];
            while (left < right) {
                while (left < right && nums[right] >= temp) right--;
                nums[left] = nums[right];
                while (left < right && nums[left] <= temp) left++;
                nums[right] = nums[left];
            }
            nums[left] = temp;
            return left;
        }

    }
}
