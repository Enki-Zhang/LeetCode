/**
 * @author Enki
 * @ClassName LeetCode_905
 * @Description: TODO
 * @Date 2023/9/11 9:10
 * @Version 1.0
 */
public class LeetCode_905 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = solution.sortArrayByParity(new int[]{3, 1, 2, 4});
        for (int a :
                ints) {
            System.out.print(a+ " ");


        }

    }

    /**
     * 冒泡排序
     */
    static class Solution {
        public int[] sortArrayByParity(int[] nums) {
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = 0; j < nums.length - i - 1; j++) {
                    if (nums[j] % 2 != 0) {
                        swap(nums, j, j + 1);
                    }
                }

            }
            return nums;
        }

        private void swap(int[] nums, int left, int right) {
            int tem = nums[left];
            nums[left] = nums[right];
            nums[right] = tem;
        }
    }
}
