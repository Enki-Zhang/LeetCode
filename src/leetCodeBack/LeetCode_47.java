package leetCodeBack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_47 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 1};
        List<List<Integer>> lists = new Solution().permuteUnique(nums);
        System.out.println(lists);
    }

    //    全排列2 有重复元素 同一层中不能重复
    static class Solution {
        public List<List<Integer>> permuteUnique(int[] nums) {
            List<List<Integer>> lists = new ArrayList<>();
            Arrays.sort(nums);
            Boolean[] used = new Boolean[nums.length];
            for (int i = 0; i < nums.length; i++) {
                used[i] = false;
            }
            backPer(nums, used, 0, lists, new LinkedList<Integer>());
            return lists;
        }

        public void backPer(int[] nums, Boolean[] used, int start, List<List<Integer>> lists, LinkedList<Integer> list) {
            if (list.size() == nums.length) {
                ArrayList<Integer> integers = new ArrayList<>(list);
                lists.add(integers);
                return;
            }
            for (int i = 0; i < nums.length; i++) {
                if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                    continue;
                }
                if (!used[i]) {
                    used[i] = true;
                    list.add(nums[i]);
//               用used数组可以防止漏取 取不到
                    backPer(nums, used, i, lists, list);
                    used[i] = false;
                    list.removeLast();
                }

            }
        }
    }
}
