import leetCodeBack.LeetCode_78_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class Swing_79 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> subsets = new Solution().subsets(nums);
        subsets.forEach(System.out::println);
    }

    //
    static class Solution {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        public List<List<Integer>> subsets(int[] nums) {
//            Arrays.sort(nums);
//            boolean[] visit = new boolean[nums.length];
            back(nums, 0);
            return lists;
        }

        private void back(int[] nums, int index) {
            lists.add(new ArrayList<>(list));
            for (int i = index; i < nums.length; i++) {
                list.add(nums[i]);
                back(nums, i + 1);
                list.remove(list.size() - 1);
            }
        }


    }
}
