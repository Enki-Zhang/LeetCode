package algorithm;

/**
 * @author Enki
 * @ClassName LeetCode_27
 * @Description: TODO
 * @Date 2024/6/11 10:55
 * @Version 1.0
 */
public class LeetCode_27 {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        new Solution().removeElement(nums,2);

    }

    /**
     * 排序 冒泡
     */
    static class Solution {
        public int removeElement(int[] nums, int val) {
            int number = 0;
//            将目标元素移动到数组末尾
            for (int i = 0; i < nums.length-1; i++) {
                if (nums[i] != val) {
                    swapTar(i, nums.length - 1 - number, nums);
                }
                number++;
            }
            return number;
        }

        /**
         * 交换元素
         *
         * @param a
         * @param b
         */
        public void swapTar(int a, int b, int[] nums) {
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
        }

    }
}
