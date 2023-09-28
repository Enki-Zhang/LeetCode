package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_75 {
    public static void main(String[] args) {
        int[] ints = {2,0,2,1,1,0};
        Solution solution = new Solution();
        solution.sortColors(ints);
        for (int a :
                ints) {
            System.out.println(a);
        }


    }

    /**
     * 颜色分类 使用快排对分类进行排序
     *
     */
    static class Solution {
        public void sortColors(int[] nums) {
             quickSort( nums, 0, nums.length-1);
             return;
        }

        public static void quickSort(int[] a, int l, int r) {

            if (l < r) {
                int i,j,x;

                i = l;
                j = r;
                x = a[i];
                while (i < j) {
                    while(i < j && a[j] > x)
                        j--; // 从右向左找第一个小于x的数
                    if(i < j)
                        a[i++] = a[j];
                    while(i < j && a[i] < x)
                        i++; // 从左向右找第一个大于x的数
                    if(i < j)
                        a[j--] = a[i];
                }
                a[i] = x;
                quickSort(a, l, i-1); /* 递归调用 */
                quickSort(a, i+1, r); /* 递归调用 */
            }
        }


    }
}
