package leetCodeBack;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_216_2 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int k = scanner.nextInt();
//        int n = scanner.nextInt();
        List<List<Integer>> lists = Solution.combinationSum3(3, 9);
        lists.forEach(System.out::println);

    }

    //    组合 和为n的k个数字
    static class Solution {
        static List<List<Integer>> lists = new LinkedList<>();
        static List<Integer> list = new LinkedList<>();

        public static List<List<Integer>> combinationSum3(int k, int n) {
            back(k, n, 1);
            return lists;
        }

        /**
         * @param k     list个数
         * @param n     list和
         * @param start 遍历开始位置
         */
        public static void back(int k, int n, int start) {
            //            叶节点满足
            if (list.size() == k && n == 0) {
                lists.add(new LinkedList<>(list));
            }
//            穷举 每个节点 list不能重复 从start遍历
            for (int i = start; i <= 9; i++) {
//                处理节点
                list.add(i);
                back(k, n - i, i + 1);
                list.remove(list.size() - 1);
            }
        }
    }
}
