package leetCodeBack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_46 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> permute = Solution.permute(nums);
        System.out.println(permute);
    }

    // 全排列问题
    static class Solution {
        static List<List<Integer>> lists = new ArrayList<>();
        static List<Integer> list = new LinkedList<>();
        public static List<List<Integer>> permute(int[] nums) {
            Boolean[] used = new Boolean[nums.length];
            for (int i = 0; i < nums.length; i++) {
                used[i] = false;//记录索引位置使用
            }
            backR(nums, used);
            return lists;
        }

        public static void backR(int[] nums, Boolean[] used) {
            if (list.size() == nums.length) {
                List<Integer> integers = new ArrayList<>(list);
                lists.add(integers);
//                list.clear();
                return;
            }
            for (int i = 0; i < nums.length; i++) {
                if (used[i]){
                    continue;
                }
                if (!used[i]) {
                    list.add(nums[i]);
                    used[i] = true;
                }
                backR(nums, used);
                list.remove(list.size()-1);
                used[i] = false;
            }
        }

    }
}
