package leetCodeBack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_78_2 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 2, 3};
        List<List<Integer>> subsets = solution.subsets(nums);
        subsets.forEach(System.out::println);

    }

    static class Solution {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        public List<List<Integer>> subsets(int[] nums) {
            back(nums, 0);
            return lists;
        }

        public void back(int[] nums, int start) {
//            收集节点
            lists.add(new ArrayList<>(list));
            for (int i = start; i < nums.length; i++) {
                list.add(nums[i]);
                back(nums, i + 1);
                list.remove(list.size() - 1);
            }
        }

    }
}
