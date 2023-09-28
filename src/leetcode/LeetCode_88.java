package leetcode;

import java.util.Arrays;

/**
 * @author Enki
 * @ClassName LeetCode_88
 * @Date 2023/8/12 11:42
 * @Version 1.0
 */
public class LeetCode_88 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {0, 0};
        int[] b = {2};
        solution.merge(a, 1, b, 1);


    }

    /**
     * 合并两个递增数组 归并排序合并部分
     */
    static class Solution2 {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int[] arrays = new int[m];
            for (int i = 0; i < m; i++) {
                arrays[i] = nums1[i];
            }
            int left = 0;
            int right = 0;
            int index = 0;
            for (left = 0, right = 0; left < m && right < n; ) {
                if (arrays[left] < nums2[right]) {
                    nums1[index] = arrays[left];
                    index++;
                    left++;
                } else {
                    nums1[index] = nums2[right];
                    index++;
                    right++;
                }
            }
            while (left < m) {
                nums1[index] = arrays[left];
                index++;
                left++;
            }
            while (right < n) {
                nums1[index] = nums2[right];
                index++;
                right++;
            }

        }
    }

    /**
     * O(n) 方法 使用双指针 从后往前扫描 大者覆盖到末尾 一直到nums2扫描完成
     */
    static class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {

            int nums1Tail = m - 1;
            int nums2Tail = n - 1;
            int index = m + n - 1;
            while (nums2Tail >= 0) {
//                这里判断nums1Tail >= 0 即使nums中没有元素也能插入
                if (nums1Tail >= 0 && nums1[nums1Tail] > nums2[nums2Tail]) {
                    nums1[index] = nums1[nums1Tail];
                    index--;
                    nums1Tail--;
                } else {
                    nums1[index] = nums2[nums2Tail];
                    index--;
                    nums2Tail--;
                }
            }
        }
    }
}
