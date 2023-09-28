package leetcode;

/**
 * @author Enki
 * @ClassName LeetCode_283
 * @Description: TODO
 * @Date 2023/9/9 10:47
 * @Version 1.0
 */
public class LeetCode_283 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.moveZeroes(new int[]{0, 1, 0, 3, 12});

    }

    /**
     * 类似冒泡将所有非零元素和
     */
    static class Solution {
        public void moveZeroes(int[] nums) {
            div(nums, 0, nums.length - 1);
            for (int a :
                    nums) {
                System.out.print(a + " ");
            }

        }

        private void div(int[] nums,int left,int right) {


        }
    }
}
