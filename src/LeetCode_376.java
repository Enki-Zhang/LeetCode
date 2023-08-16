/**
 * @author Enki
 * @ClassName LeetCode_376
 * @Description: TODO
 * @Date 2023/8/15 11:13
 * @Version 1.0
 */
public class LeetCode_376 {
    public static void main(String[] args) {
//        TODO

    }

    /**
     * 摆动数列 遍历数组记录满足上升下降的数字组合
     */
    class Solution {
        public int wiggleMaxLength(int[] nums) {
            boolean isRise = false;
            int pre = nums[0];
            for (int i = 1; i < nums.length; i++) {
                pre = nums[i - 1];
                if (nums[i] > pre) {
                    isRise = true;
                }
                if (nums[i] == pre) {
                    continue;
                }

            }
return nums.length;
        }
    }
}
