package leetCodeBack;

import java.util.*;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_491_2 {
    public static void main(String[] args) {
        int[] nums = {4, 6, 7, 7};
        Solution solution = new Solution();
        List<List<Integer>> subsequences = solution.findSubsequences(nums);
        subsequences.forEach(System.out::println);

    }

    static class Solution {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        public List<List<Integer>> findSubsequences(int[] nums) {
            back(nums, 0);
            return lists;
        }
        public void back(int[] nums, int start) {
//
            if (list.size() > 1){
                lists.add(new ArrayList<>(list));
            }
//            boolean[] used = new boolean[nums.length];
            int[] used = new int[201];
            for (int i = start; i < nums.length; i++) {
//                判断当前元素是否符合 并层间去重
                if (!list.isEmpty() && nums[i] < list.get(list.size() - 1) || used[nums[i] + 100] == 1) {
                    continue;
                }
                list.add(nums[i]);
                used[nums[i] + 100] = 1;
                back(nums, i + 1);
                list.remove(list.size() - 1);
            }
        }

//        public boolean isIncr(List<Integer> list) {
//            List<Integer> integers = list;
//            Collections.sort(integers);
//            Iterator<Integer> iterator = list.iterator();
//            Iterator<Integer> iterator1 = integers.iterator();
//            while (iterator.hasNext()) {
//                Integer next = iterator.next();
//                Integer next1 = iterator1.next();
//                if (!next.equals(next1)) return false;
//            }
//            return true;
//        }

    }
}
