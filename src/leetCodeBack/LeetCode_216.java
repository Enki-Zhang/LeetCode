package leetCodeBack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_216 {
    public static void main(String[] args) {

    }
//    组合优化 从1-9中找出k个和为n的数

    class Solution {
        List<List<Integer>> lists = new ArrayList<>();
        LinkedList<Integer> list = new LinkedList<>();
        public List<List<Integer>> combinationSum3(int k, int n) {
            backT(k, n, 0,1);
            return lists;
        }

        public void backT(int k, int n, int sum,int start) {
            if (sum == n && list.size() == k) {
                List<Integer> integers = new ArrayList<>(list);
                lists.add(integers);
                return;
            }
//            i每次从1开始会栈溢出 需要剪枝
            for (int i = start; i <= 9; i++) {
                list.add(i);
                sum += i;
                backT(k, n, sum,i+1);
                sum -= i;
               list.removeLast();
            }
        }
    }
}
