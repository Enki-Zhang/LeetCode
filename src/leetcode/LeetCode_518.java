package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Enki
 * @ClassName LeetCode_518
 * @Description: TODO
 * @Date 2023/9/12 8:25
 * @Version 1.0
 */
public class LeetCode_518 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("结果 " + solution.change(100, new int[]{99, 1}));

    }

    static class Solution {
        int count = 0;
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> lists = new ArrayList<>();

        public int change(int amount, int[] coins) {
            boolean[] used = new boolean[coins.length];
            back(amount, coins, 0, 0, used);
            System.out.println(lists);
            return count;

        }

        private void back(int amount, int[] coins, int start, int sum, boolean[] used) {
            if (sum == amount) {
                count++;
                lists.add(new ArrayList<>(list));
                return;
            }
            if (sum > amount) {
                return;
            }
            for (int i = start; i < coins.length; i++) {
                sum += coins[i];
//                if (sum > amount) continue;
//                if (i > 0 && coins[i - 1] == coins[i] && !used[i - 1]) continue;
                used[i] = true;
                list.add(coins[i]);
                back(amount, coins, i+1, sum, used);
                sum -= coins[i];
                used[i] = false;
                list.remove(list.size() - 1);
            }
        }
    }
}
