package leetcode;

import java.util.Arrays;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_11 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int i = solution.maxArea(ints);
        System.out.println(i);

    }

    /**
     * 盛水 双指针 从两端搜索 保存最大值 超时
     * 选择两端板子移动的方向 将较小版移动 高度可能会增加 使得面积增加
     * 移动较大板 高度只会减少 使得面积只能小于或等于当前面积
     * 因此 只能异能移动较小板
     */
    static class Solution {
        public int maxArea(int[] height) {
            int left = 0;
            int right = height.length - 1;
            int high = Integer.MIN_VALUE;
            int area = 0;
            while (left < right) {
//                for (int i = right; i >= 0; i--) {
                high = Math.min(height[right], height[left]);
                area = Math.max((high * (right - left)), area);
//                }
                if (height[left] < height[right]) {
                    left++;
                } else {
                    right--;
                }
//                超时
//                left++;
            }
            return area;
        }
    }



}
