package algorithm;

/**
 * @author Enki
 * @ClassName LeetCode_704
 * @Description: 二分查找
 * @Date 2024/6/8 11:31
 * @Version 1.0
 */     
public class LeetCode_704 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else right = mid - 1;
        }
        return -1;
    }

}
