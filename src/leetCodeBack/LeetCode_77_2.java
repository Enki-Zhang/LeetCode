package leetCodeBack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_77_2 {
    public static void main(String[] args) {

    }

    //    组合 1-n的所有k个组合问题
    class Solution {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        public List<List<Integer>> combine(int n, int k) {
            int[] ints = new int[n];
            for (int i = 0; i < n; i++) {
                ints[i] = i + 1;
            }
            back(ints, k, 0);
            return lists;
        }

        public void back(int[] n, int k, int startIndex) {
//            遍历到指定长度节点
            if (list.size() == k) {
                lists.add(new ArrayList<>(list));
                return;
            }
//
            for (int i = startIndex; i < n.length-(k - list.size()) + 1; i++) {
                list.add(n[i]); //添加节点
                back(n, k, i + 1); //向下遍历
                list.remove(list.size() - 1); // 回溯
            }
        }
    }
}
