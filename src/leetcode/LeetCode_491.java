package leetcode;

import java.util.*;

/**
 * @author Enki
 * @ClassName LeetCode_491
 * @Description: TODO
 * @Date 2023/8/13 9:40
 * @Version 1.0
 */
public class LeetCode_491 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findSubsequences(new int[]{4, 6, 7, 7}));

    }

    /**
     * 递增子序列 选择的是子序列 其中去重选择map数组去重 记录当前层中已经选择过的数组
     */
    static class Solution {
        List<List<Integer>> lists = new LinkedList<>();
        List<Integer> list = new LinkedList<>();

        public List<List<Integer>> findSubsequences(int[] nums) {
            back(nums, 0);
            return lists;
        }

        private void back(int[] nums, int index) {
            Map<Integer, Boolean> isUsed = new HashMap<>();
//            终止条件 收集叶子节点
            if (list.size() > 1) {
                lists.add(new LinkedList<>(list));
            }

//            搜索问题
            for (int i = index; i < nums.length; i++) {
//               如果当前元素在当前层使用过
                if (isUsed.containsKey(nums[i])) continue;
//                非递增
                if (list.size() > 0 && list.get(list.size() - 1) > nums[i])
                    continue;
                list.add(nums[i]);
                isUsed.put(nums[i], true);
                back(nums, i + 1);
//                isUsed.remove(nums[i]);
                list.remove(list.size() - 1);

            }

        }
    }
}
