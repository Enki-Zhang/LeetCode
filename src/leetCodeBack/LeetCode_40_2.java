package leetCodeBack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_40_2 {
    public static void main(String[] args) {
        int[] can = {10, 1, 2, 7, 6, 1, 5};
        int tar = 8;
        List<List<Integer>> lists = Solution.combinationSum2(can, tar);
        lists.forEach(System.out::println);
    }

    // 在子集中找到和为target 的组合  解集不重复 元素只能用一次 使用used数组判断
    static class Solution {
        static ArrayList<Integer> list = new ArrayList<>();
        static List<List<Integer>> lists = new ArrayList<>();

        public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
            Arrays.sort(candidates);
            boolean[] used = new boolean[candidates.length];
//            判断是否使用过
            for (int i = 0; i < candidates.length; i++) {
                used[i] = false;
            }
            back(candidates, target, 0, used);
            return lists;
        }

        public static void back(int[] candidates, int target, int start, boolean[] used) {
            if (target == 0) {
                lists.add(new ArrayList<>(list));
            }
            for (int i = start; i < candidates.length; i++) {
//                剪枝
                if (target-candidates[i] < 0) break;
//                去重 层间去重
                if (i>0&&candidates[i] == candidates[i-1] && !used[i-1]) continue;
                used[i] = true;
                list.add(candidates[i]);
                back(candidates, target - candidates[i], i + 1, used);
                used[i] = false;
                list.remove(list.size() - 1);
            }
        }

    }
}
