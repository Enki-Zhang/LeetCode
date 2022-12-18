package leetCodeBack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_90_2 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        List<List<Integer>> lists = new Solution().subsetsWithDup(nums);
        System.out.println(lists);
    }
// 解集中可以有重复元素 则树枝不需要去重 解集不能重复 层间需要去重
    static class Solution {
        public List<List<Integer>> subsetsWithDup(int[] nums) {
            List<List<Integer>> lists = new ArrayList<>();
            Arrays.sort(nums);
            Boolean[] used = new Boolean[nums.length];
            for (int i = 0; i < nums.length; i++) {
                used[i] = false;
            }
            backSubset(nums, used, 0, new LinkedList<Integer>(), lists);
            return lists;
        }

        public void backSubset(int[] nums, Boolean[] used, int start, LinkedList<Integer> list, List<List<Integer>> lists) {
//            在树枝上得到
            ArrayList<Integer> integers = new ArrayList<>(list);
            lists.add(integers);
            if (start > nums.length) {
                return;
            }
            for (int i = start; i < nums.length; i++) {
                if (i > 0 && !used[i - 1] && nums[i] == nums[i - 1]) {
                    continue;
                }
                used[i] = true;
                list.add(nums[i]);
                backSubset(nums, used, i + 1, list, lists);
                used[i] = false;
                list.removeLast();
            }
        }

    }
}
