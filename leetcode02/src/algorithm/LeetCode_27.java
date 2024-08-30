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
        Solution solution = new Solution();
        int[] ints = {0, 1, 2, 2, 3, 0, 4, 2};
        int i = solution.removeElement(ints, 2);
        System.out.println(i);
    }

    static class Solution {
        public int removeElement(int[] nums, int val) {
            int len = 0;

//                题目不需要进行交换 只要在新数组中不保留目标值即可 用后面数字替换前面的目标值即可
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val) {
                    nums[len] = nums[i];
                    len++;
                }

            }
            return len;
        }

    }
}
