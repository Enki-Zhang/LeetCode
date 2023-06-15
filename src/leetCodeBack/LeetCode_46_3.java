package leetCodeBack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_46_3 {
    public static void main(String[] args) {
        int[] ints = {1, 2, 3};
        List<List<Integer>> permute = new Solution().permute(ints);
        permute.forEach(System.out::println);

    }

    //
    static class Solution {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        public List<List<Integer>> permute(int[] nums) {
            int index = 0;
            boolean[] visit = new boolean[nums.length];
            back(nums, index, visit);
            return lists;


        }

        private void back(int[] nums, int index, boolean[] visit) {
            if (list.size() == nums.length) {
                lists.add(new ArrayList<>(list));
            }
//            组内去重 一层内的选择
            for (int i = 0; i < nums.length; i++) {
                if (visit[i]) continue;
                visit[i] = true;
                list.add(nums[i]);
                back(nums, i+1, visit);
                list.remove(list.size() - 1);
                visit[i] = false;
            }
        }
    }
}
