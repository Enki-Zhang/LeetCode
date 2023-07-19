/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_33 {
    public static void main(String[] args) {
        Solution solution = new Solution();


    }

    /**
     * 在部分有序数组中进行二分查找
     * 搜索旋转排序数组 从target位置开始将 将数组分成两段 对有序部分进行二分查找 找到第一个非有序位置为
     * 在有序部分数组中二分查找target
     * 如果中间的数小于最右边的数，则右半段是有序的，若中间数大于最右边数，
     * 则左半段是有序的，我们只要在有序的半段里用首尾两个数组来判断目标值是否在这一区域内，这样就可以确定保留哪半边了
     */
    static class Solution {
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
}
