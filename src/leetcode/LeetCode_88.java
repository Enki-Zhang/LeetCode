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
        int[] a = {1, 2, 3, 0, 0, 0};
        int[] b = {2, 5, 6};
        solution.merge(a, 6, b, 3);


    }

    /**
     * 合并两个递增数组 每个数组一个指针 将顺序添加到新建的数组中去
     * 若数组a 元素小于b元素 a指针++
     * 若a大于b元素 将b元素插入a中a指针前面 a指针++ b指针后移
     * a==b 将b插入到a后面 a+2 b++
     *
     * 直接全部插入后排序
     */
    static class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            for (int i = 0; i < nums2.length; i++) {
                nums1[m + i] = nums2[i];
            }
            Arrays.sort(nums1);
        }
    }
}
