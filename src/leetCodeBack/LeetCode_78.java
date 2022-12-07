package leetCodeBack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_78 {
    public static void main(String[] args) {
        int[] nums = {1};
        List<List<Integer>> subsets = new Solution().subsets(nums);
        System.out.println(subsets);

    }

    //    给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
    // 解集 不能 包含重复的子集。你可以按 任意顺序 返回解集。
    static class Solution {
        List<List<Integer>> lists = new ArrayList<>();

        public List<List<Integer>> subsets(int[] nums) {

            for (int i = 0; i <= nums.length; i++) {
                backTrack(nums, i, 0, new ArrayList<Integer>());
            }

            return lists;
        }

        public void backTrack(int[] nums, int k, int start, ArrayList<Integer> list) {
            if (list.size() == k) {
                ArrayList<Integer> integers = new ArrayList<>(list);
                lists.add(integers);
                return;
            }
//            剪枝
//            k - list.size() 为还需要遍历的元素个数
//            nums.length - (k - list.size())+1 元素遍历的起始点 因为是顺序加入节点的
            for (int i = start; i < nums.length - (k - list.size()) + 1; i++) {
                list.add(nums[i]);
                backTrack(nums, k, i + 1, list);
                list.remove(list.size() - 1);
            }
        }
    }
}
