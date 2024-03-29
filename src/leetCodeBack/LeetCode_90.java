package leetCodeBack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_90 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        List<List<Integer>> lists = new Solution().subsetsWithDup(nums);
        System.out.println(lists);
    }

    //    给你一个整数数组 nums ，其中可能包含重复元素，请你返回该数组所有可能的子集（幂集）。
//解集 不能 包含重复的子集。返回的解集中，子集可以按 任意顺序 排列
    static class Solution {
        public List<List<Integer>> subsetsWithDup(int[] nums) {
            List<List<Integer>> lists = new ArrayList<>();
            Arrays.sort(nums);
            Boolean[] used = new Boolean[nums.length];
            for (int i = 0; i < nums.length; i++) {
                used[i] = false;
            }
            backSub(nums, 0, used, lists, new LinkedList<Integer>());
            return lists;
        }

        public void backSub(int[] nums, int start, Boolean[] used, List<List<Integer>> lists, LinkedList<Integer> list) {
            ArrayList<Integer> integers = new ArrayList<>(list);
            lists.add(integers);
            if (start >= nums.length) {
                return;
            }
            for (int i = start; i < nums.length; i++) {
                //                层间去重
                // used[i - 1] == true，说明同⼀树⽀candidates[i - 1]使⽤过
                // used[i - 1] == false，说明同⼀树层candidates[i - 1]使⽤过
                if (i > 0 && nums[i - 1] == nums[i] && !used[i - 1]) {
                    continue;
                }
                used[i] = true;
                list.add(nums[i]);
                backSub(nums, i + 1, used, lists, list);
                used[i] = false;
                list.removeLast();
            }
        }

    }
}
