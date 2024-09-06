package algorithm;

/**
 * @author Enki
 * @ClassName LeetCode_26
 * @Description: TODO
 * @Date 2024/8/29 13:06
 * @Version 1.0
 */
public class LeetCode_26 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int i = solution.removeDuplicates(nums);
        System.out.println(i);


    }

    static class Solution {
        public int removeDuplicates(int[] nums) {
            int len = 1;
            for (int i = 0; i < nums.length; i++) {
//                判断元素是否重复
                if (len+1< nums.length && nums[i] == nums[len]) {
//删除重复元素
                    removeDuplicateElements(nums, i, len);
                }
//               快慢指针后移
                if (len + 1 < nums.length) {
                    len++;
                } else return len;

            }
            return len;
        }

        /**
         * 删除重复元素 j i 指向重复元素的位置 删除方法 ： 覆盖
         *
         * @param nums
         * @param i
         * @param j
         */
        public void removeDuplicateElements(int[] nums, int i, int j) {
            while (j < nums.length && nums[j] == nums[i]) {
                j++;
            }
            while (i < j) {
                i++;
                nums[i] = nums[j];

            }
        }
    }
}
