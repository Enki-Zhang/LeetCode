package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Enki
 * @ClassName LeetCode_46
 * @Description: TODO
 * @Date 2023/9/28 10:19
 * @Version 1.0
 */
public class LeetCode_46 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.permute(new int[]{1, 2, 3}));
    }

    /**
     * 全排列 回溯判断结果中元素是否可以重复 子集间是否重复
     */
    static class Solution {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        public List<List<Integer>> permute(int[] nums) {
            Arrays.sort(nums);
            boolean[] used = new boolean[nums.length];
            back(nums, 0, used);
            return res;
        }

        private void back(int[] nums, int start, boolean[] used) {
            if (path.size() >= nums.length) {
                res.add(new ArrayList<>(path));
            }
            for (int i = 0; i < nums.length; i++) {
                if (used[i]) continue;
                used[i] = true;
                path.add(nums[i]);
                back(nums, i + 1, used);
                used[i] = false;
                path.remove(path.size() - 1);
            }
        }

    }
}
