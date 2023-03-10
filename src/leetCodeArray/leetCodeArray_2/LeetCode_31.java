package leetCodeArray.leetCodeArray_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_31 {
    public static void main(String[] args) {

    }

    class Solution {
        public void nextPermutation(int[] nums) {
//           数组排序
//            Collections.sort(nums,new Comparator<Integer>(){
//                @Override
//                public int compare(Integer o1, Integer o2) {
//                    return
//                }
//            });
            int right = nums.length - 1;
            int left = right - 1;

            while (left >= 0) {
                if (nums[left] < nums[right]) {
                    Swap(nums, left, nums.length - 1);
                    Reverse(nums, right);
                }
                left--;
                right--;
            }
            if (left < 0) {
//
                Arrays.sort(nums);
            }

        }

        //逆序
        public void Reverse(int[] nums, int i) {
            int k = i, j = nums.length - 1;
            while (k < j) {
                Swap(nums, k, j);
                k++;
                j--;
            }
        }

        //交换
        public void Swap(int[] nums, int i, int j) {
            int temp;
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
