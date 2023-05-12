package leetCodeBack;

import java.util.*;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_39_2 {
    public static void main(String[] args) {
        int[] can = {2, 3, 6, 7};
        List<List<Integer>> lists = Solution.combinationSum(can, 7);
        lists.forEach(System.out::println);

    }

    //在整数数组中找到目标和为target的数列组合 可以重复
    static class Solution {
        static List<List<Integer>> lists = new LinkedList<>();
        static LinkedList<Integer> list = new LinkedList<>();

        public static List<List<Integer>> combinationSum(int[] candidates, int target) {
            Arrays.sort(candidates);
            back(candidates, target, 0);
            return lists;

        }


        public static void back(int[] candidates, int target, int start) {
            //            叶节点满足 判断是否是合适的list list不能重复
            if (target == 0 && list.size() < 150) {
                lists.add(new ArrayList<>(list));
            }
//         层间遍历 元素可以重复
            for (int i = start; i < candidates.length; i++) {
                if (target - candidates[i] < 0) break;
//                处理节点
                list.add(candidates[i]);
                back(candidates, target - candidates[i], i);
//                target += candidates[i]; // target 在每个栈中保存着 退回原来的栈 target 使用的是当前栈中的值
                list.removeLast();

            }
        }

    }

}
