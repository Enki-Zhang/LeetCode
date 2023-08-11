import java.util.LinkedList;
import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_216 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.combinationSum3(3, 9));

    }

    /**
     * 找出所有相加之和为 n 的 k 个数的组合 数字不能重复
     */
    static class Solution {
        List<List<Integer>> lists = new LinkedList<>();
        List<Integer> list = new LinkedList<>();

        public List<List<Integer>> combinationSum3(int k, int n) {
            int[] ints = new int[9];
            for (int i = 0; i < 9; i++) {
                ints[i] = i + 1;
            }
            back(k, n, ints, 0, 0);
            return lists;
        }

        private void back(int k, int n, int[] ints, int sum, int index) {
            if ( list.size() == k && sum == n) {
                lists.add(new LinkedList<>(list));
                return;
            }
            for (int i = index; i < 9; i++) {
                list.add(ints[i]);
                sum += ints[i];
                back(k, n, ints, sum, i + 1);
                sum -= list.get(list.size() - 1);
                list.remove(list.size() - 1);

            }
        }
    }
}
