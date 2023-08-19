import java.util.Arrays;

/**
 * @author Enki
 * @ClassName LeetCode_55_2
 * @Description: TODO
 * @Date 2023/8/18 8:39
 * @Version 1.0
 */
public class LeetCode_55_2 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.canJump(new int[]{3, 2, 1, 0, 4}));
    }

    /**
     * 跳跃游戏 不断更新当前范围内最大的数字
     */
    static class Solution {
        public boolean canJump(int[] nums) {
            int start = 0;
            int max = 0;
            int index = 0;

//                更新最近最大值
            for (int i = start; i < nums.length; i++) {
                if (i <= max) {
                    max = Math.max(max, nums[i] + i);
                    if (max >= nums.length - 1) {
                        return true;
                    }
                }
            }

            return false;

        }
    }
}
