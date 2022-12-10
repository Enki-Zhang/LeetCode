package leetCodeBack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_40 {
    public static void main(String[] args) {
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        List<List<Integer>> lists = new Solution().combinationSum2(candidates, 8);
        System.out.println(lists);

    }

    //    组合
    static class Solution {
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            List<List<Integer>> lists = new ArrayList<>();
            Arrays.sort(candidates);
            Boolean[] used = new Boolean[candidates.length];
            for (int i = 0; i < candidates.length; i++) {
                used[i] = false;
            }
            backCom(candidates, target, 0, 0, used, new LinkedList<Integer>(), lists);
            return lists;
        }

        //层间去重
        public void backCom(int[] candidates, int target, int sum, int start, Boolean[] used, LinkedList<Integer> list, List<List<Integer>> lists) {
            if (sum == target) {
                LinkedList<Integer> integers = new LinkedList<>(list);
                lists.add(integers);
                return;
            }
//            一层的for循环是当前数组的遍历
            for (int i = start; i < candidates.length; i++) {
//                used[i - 1] == false 表示同一层中i-1已经使用过 因为是按照从前往后的顺序取元素 前一个元素没有使用肯定不在同一层中
                if (i > 0 && !used[i - 1] && candidates[i] == candidates[i - 1]) {
                    continue;
                }
                if (sum + candidates[i] > target) break;
                sum += candidates[i];
                used[i] = true;
                list.add(candidates[i]);
//                控制下层循环的start  递归控制下层的for循环
                backCom(candidates, target, sum, i + 1, used, list, lists);
                sum -= candidates[i];
                used[i] = false;
                list.removeLast();
            }

        }
    }
}
