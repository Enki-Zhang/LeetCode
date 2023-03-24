package sort;

import java.util.Random;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_912 {
    public static void main(String[] args) {
        int[] nums = {5, 1, 1, 2, 0, 0};
//        Solution.sortArray_(nums);
//        binarySearch(nums);
//        BubbleSort(nums);
        QuickSort(nums, 0, nums.length - 1);
        for (int a :
                nums) {
            System.out.print(a + " ");
        }
    }

    //    直接插入排序
    static class Solution {
        public static int[] sortArray_(int[] nums) {
//            从第二个元素开始 依次向前比较 遇见大的往后挪
            for (int i = 1; i < nums.length; i++) {
                int tem = nums[i];
                int j = i - 1;
                while (j >= 0 && nums[j] > tem) {
                    nums[j + 1] = nums[j];
                    j--;
                }
                nums[j + 1] = tem;
            }

            return nums;

        }
    }

    //    折半查找 在有序数组中查找待插入的数据
    public static int[] binarySearch(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            int tem = nums[i];
            int left = 0;
            int right = i - 1;
            while (left <= right) {
                int middle = (left + right) / 2;
                if (nums[middle] > tem)
                    right = middle - 1;
                else left = middle + 1;
            }
            for (int j = i - 1; j >= left; j--) {
                nums[j + 1] = nums[j];
            }
            nums[left] = tem;
        }
        return nums;
    }

    //    冒泡排序
    public static int[] BubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            boolean isSwap = false;
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    Swap(j, j + 1, nums);
//                    int tem = nums[j];
//                    nums[j] = nums[j+1];
//                    nums[j+1] = tem;
                    isSwap = true;
                }

            }
            if (!isSwap) {
                return nums;
            }
        }
        return nums;
    }

    private static void Swap(int j, int i, int[] nums) {
        int tem = nums[i];
        nums[i] = nums[j];
        nums[j] = tem;
    }

    //    快排
    public static int[] QuickSort(int[] nums, int low, int high) {
        if (low < high) {
            int a = part(nums, low, high);
            QuickSort(nums, low, a - 1);
            QuickSort(nums, a + 1, high);
        }
        return nums;
    }

    //    将high指向的数 若小于tem 放到num[low]中 反之放在 num[high]中 因为tem被覆盖会空出一个位置放tem (low == high)
    private static int part(int[] nums, int low, int high) {
        int tem = nums[low];
        while (low < high) {
            while (low < high && tem <= nums[high]) high--;
            nums[low] = nums[high];
            while (low < high && tem >= nums[low]) low++;
            nums[high] = nums[low];
        }
        nums[low] = tem;
        return low;
    }


}
