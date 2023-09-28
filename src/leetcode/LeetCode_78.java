package leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Enki
 * @ClassName LeetCode_78
 * @Description: TODO
 * @Date 2023/8/13 9:08
 * @Version 1.0
 */
public class LeetCode_78 {
    public static void main(String[] args) {

    }

    /**
     * 子集合问题 收集叶子节点 不能包含重复子集
     * 使用used去重
     */
    class Solution {
        List<List<Integer>> lists = new LinkedList<>();
        List<Integer> list = new LinkedList<>();

        public List<List<Integer>> subsets(int[] nums) {
            boolean[] isUsed = new boolean[nums.length];
            back(nums, 0, isUsed);
            return lists;

        }

        private void back(int[] nums, int index, boolean[] isUsed) {
//            终止条件 收集叶子节点
            lists.add(new LinkedList<>(list));

//            遍历
            for (int i = index; i < nums.length; i++) {
                if (i > 0 && !isUsed[i-1] && nums[i - 1] == nums[i]) continue;
                list.add(nums[i]);
                isUsed[i] = true;
                back(nums, i + 1, isUsed);
                list.remove(list.size() - 1);
                isUsed[i] = false;
            }
        }
    }
}
