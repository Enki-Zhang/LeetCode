import java.util.ArrayList;
import java.util.Iterator;

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
        Solution solution = new Solution();
        System.out.println(solution.wiggleMaxLength(new int[]{1,0,1}));
    }

    /**
     * 摆动数列 求子序列最长 假设每一个数字追加后都满足摆动特性即可
     * 或者记录两个数字上升或者下降
     */
    static class Solution {
        public int wiggleMaxLength(int[] nums) {
            if (nums.length == 1) {
                return 1;
            }
            int changes = 0;
            int dir = -1;

            for (int i = 1; i < nums.length; i++) {
//
                if (nums[i] == nums[i - 1]) continue;
                if (nums[i] > nums[i - 1]) {
                    if (dir == 1) {
                        continue;
                    }
                    dir = 1;
                    changes++;
                }
                if (nums[i] < nums[i - 1]) {
                    if (dir == 0) {
                        continue;
                    }
                    dir = 0;
                    changes++;
                }
            }
            return changes + 1;
        }
    }
}
