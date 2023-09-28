package leetcode;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_55 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = {2, 3, 1, 1, 4};
        boolean b = solution.canJump(ints);
        System.out.println(b);

    }

    /**
     * 跳跃游戏 从后往前遍历 更新可以到达的最近的位置一直到首位
     */
    static class Solution {
        public boolean canJump(int[] nums) {
            int end = nums.length - 1;
            int i = 0;
            while (true) {
//                从后遍历 找到可以到达end的最近的一个元素并更新end位置 直到判断到首位 如果此时end为0 则满足 否则不满足
                for (i = end - 1; i >= 0; i--) {
                    if (end - i <= nums[i]) {
                        end = i;
                        break;
                    }
                }
                if (i == -1) {
                    if (end == 0) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }

        }
    }
}
