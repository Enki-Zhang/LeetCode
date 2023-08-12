import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Enki
 * @ClassName LeetCode_40
 * @Date 2023/8/11 17:59
 * @Version 1.0
 */
public class LeetCode_40 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = {14, 6, 25, 9, 30, 20, 33, 34, 28, 30, 16, 12, 31, 9, 9, 12, 34, 16, 25, 32, 8, 7, 30, 12, 33, 20, 21, 29, 24, 17, 27, 34, 11, 17, 30, 6, 32, 21, 27, 17, 16, 8, 24, 12, 12, 28, 11, 33, 10, 32, 22, 13, 34, 18, 12};
        System.out.println(solution.combinationSum2(ints, 27));

    }

    /**
     * 组合总和 II 组间不能重复 组内元素不能重复使用
     */
    static class Solution {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            boolean[] used = new boolean[candidates.length];
            Arrays.sort(candidates);
            back(candidates, target, used, 0, 0);
            return lists;

        }

        private void back(int[] candidates, int target, boolean[] used, int index, int sum) {
            if (sum == target) {
                lists.add(new ArrayList<>(list));
                return;
            }
//            for控制本层循环
            for (int i = index; i < candidates.length; i++) {
//                剪枝 防止超时
                if (sum + candidates[i] > target) continue;
                if (i > 0 && !used[i - 1] && candidates[i - 1] == candidates[i]) {
                    continue;
                }
                sum += candidates[i];
                list.add(candidates[i]);
                used[i] = true;
                back(candidates, target, used, i + 1, sum);
                list.remove(list.size() - 1);
                used[i] = false;
                sum -= candidates[i];
            }
        }
    }
}
