import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Enki
 * @ClassName LeetCode_77_2
 * @Description: TODO
 * @Date 2023/9/3 14:16
 * @Version 1.0
 */
public class LeetCode_77_2 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.combine(4, 2));
    }

    static class Solution {
        List<List<Integer>> lists = new LinkedList<>();
        List<Integer> list = new LinkedList<>();

        public List<List<Integer>> combine(int n, int k) {
            back(n, k, 1);
            return lists;
        }

        private void back(int n, int k, int start) {
            if (list.size() == k) {
                lists.add(new ArrayList<>(list));
            }
            for (int i = start; i <= n; i++) {
                list.add(i);
                back(n, k, i + 1);
                list.remove(list.size() - 1);
            }
        }


    }
}

