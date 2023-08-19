import java.util.Arrays;

/**
 * @author Enki
 * @ClassName LeetCode_1005
 * @Description: TODO
 * @Date 2023/8/18 10:23
 * @Version 1.0
 */
public class LeetCode_1005 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.largestSumAfterKNegations(new int[]{2,-3,-1,5,-4}, 2));

    }

    /**
     * K 次取反后最大化的数组和 遍历数组选取k个负数改变符号 若负数个数>k 则选取最小的元素改变符号
     */
    static class Solution {
        public int largestSumAfterKNegations(int[] nums, int k) {
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i++) {
                if (k > 0 && nums[i] < 0) {
//                    改变符号
                    nums[i] = -nums[i];
                    k--;
                }
            }
            while (k > 0) {
                Arrays.sort(nums);
                nums[0] = -nums[0];
                k--;
            }
            int sum = 0;
            for (int a :
                    nums) {
                sum+=a;
            }
            return sum;
        }
    }
}
