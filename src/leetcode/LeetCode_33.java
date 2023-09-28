package leetcode;

import java.util.Arrays;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_33 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.search(new int[]{1, 3, 5}, 1));


    }

    /**
     * 在部分有序数组中进行二分查找
     * 搜索旋转排序数组 从target位置开始将 将数组分成两段 对有序部分进行二分查找 找到第一个非有序位置为
     * 在有序部分数组中二分查找target
     * 如果中间的数小于最右边的数，则右半段是有序的，若中间数大于最右边数，
     * 则左半段是有序的，我们只要在有序的半段里用首尾两个数组来判断目标值是否在这一区域内，这样就可以确定保留哪半边了
     */
    static class Solution2 {
        public int search(int[] nums, int target) {
            int left = 0;
            int right = nums.length - 1;
            int middle = 0;
            while (left <= right) {
                middle = (left + right) / 2;
                if (nums[middle] == target) {
                    return middle;
                } else if (nums[middle] < nums[right]) {
//                   右边有序 且target在右边中
                    if (nums[middle] < target && target <= nums[right])
                        left = middle + 1;
                    else {
                        right = middle - 1;
                    }
                } else {//左边有序
                    if (nums[left] <= target && target < nums[middle]) {
                        right = middle - 1;
                    } else {
                        left = middle + 1;
                    }

                }
            }

            return -1;
        }
    }

    /**
     * todo 两段二分法 找到两段数组
     */
    static class Solution {
        public int search(int[] nums, int target) {
            if (nums.length == 1 && target == nums[0]) {
                return 0;
            } else if (nums.length == 1) {
                return -1;
            }
//            找到两段有序数组
            int left = 0;
            int right = nums.length - 1;
            int mid = -1;
            int result = 0;
//            寻找分界点
            while (left <= right) {
                if (left + 1 <= right && nums[left] < nums[left + 1]) {
                    left++;
                } else {
                    mid = left + 1;
                    break;
                }
            }
//            确定在哪一段进行查找
            if (nums.length == 2) {
                if (nums[0] == target) {
                    return 0;
                } else if (nums[1] == target) {
                    return 1;
                } else return -1;
            }
            if (target >= nums[0] && target <= nums[mid - 1]) {
                result = binaryLookup(nums, 0, mid - 1, target);
            } else {
                result = binaryLookup(nums, mid, nums.length - 1, target);
            }
            return result;
        }

        private int binaryLookup(int[] nums, int left, int right, int target) {
            //二分查找
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] < target) {
                    left = mid + 1;
                } else if (nums[mid] > target) {
                    right = mid - 1;
                } else {
                    return mid;
                }
            }
            return -1;
        }


    }

}
