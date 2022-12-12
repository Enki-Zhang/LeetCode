package leetCodeBack;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_39 {
    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        Solution solution = new Solution();
        List<List<Integer>> lists = solution.combinationSum(candidates, 7);
        System.out.println(lists);
    }

    //    数字组合 重点在于剪枝 元素可以重复 组合不能重复
    static class Solution {
        List<List<Integer>> lists = new ArrayList<>();

        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            Arrays.sort(candidates);
            backCom(candidates, target, 0, new LinkedList<>(), 0);
            return lists;
        }

        //        去除重复元素
        public void backCom(int[] candidates, int target, int start, LinkedList<Integer> list, int sum) {
            if (sum == target && list.size() < 150) {
                ArrayList<Integer> integers = new ArrayList<>(list);
                lists.add(integers);
                return;
            }
            for (int i = 0; i < candidates.length; i++) {
//                遇到不满足的元素 跳出i++ 因为是排序的数组后面的元素都不满足 相当于一次递归结束 break跳出整个循环
                if (sum + candidates[i] > target) break;
                sum += candidates[i];
                list.add(candidates[i]);
//                上层循环的的sum小于target下层循环遍历的元素不变 sum一直累计小的元素 直到不满足i++ 可以重复选取元素下层for的起始位置可以从上层元素开始 i不用++ 每一层递归的宽度都和上层一样
                backCom(candidates, target, i, list, sum);
//                if (target - sum < candidates[i]) {
//                    backCom(candidates, target, 0, i, list, sum);
//                } else {
//                    backCom(candidates, target, i, candidates.length, list, sum);
//                }
                sum -= candidates[i];
                list.removeLast();
            }
        }
    }
}
