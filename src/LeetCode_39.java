import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_39 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.combinationSum(new int[]{2, 3, 6, 7}, 7));
    }

    /**
     * 组合总数 同一个 数字可以 无限制重复被选取 每层从0开始 对lists数组去重
     */
    static class Solution {
        List<List<Integer>> lists = new LinkedList<>();
        List<Integer> list = new LinkedList<>();

        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            Arrays.sort(candidates);
            back(candidates, target, 0);
            System.out.println(lists);
            return lists;
        }

        private void back(int[] candidates, int target, int start) {
            if (target == 0 && list.size()<150) {
                lists.add(new ArrayList<>(list));
                return;
            }
            for (int i = start; i < candidates.length; i++) {
                if (target - candidates[i] < 0) break;
                target -= candidates[i];
                list.add(candidates[i]);
                back(candidates, target, i);
                list.remove(list.size() - 1);
                target += candidates[i];
            }
        }
    }
}
