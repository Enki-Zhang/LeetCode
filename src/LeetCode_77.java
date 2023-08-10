import java.util.LinkedList;
import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_77 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.combine(4, 2));

    }

    /**
     * 组合问题 寻找k个数的组合 每一个树枝就是一个新的选择
     */
    static class Solution {
        List<List<Integer>> lists = new LinkedList<>();
        List<Integer> list = new LinkedList<>();

        public List<List<Integer>> combine(int n, int k) {
            int[] ints = new int[n];
            for (int i = 0; i < n; i++) {
                ints[i] = i + 1;
            }
            back(ints, k, 0);
            return lists;
        }

        private void back(int[] ints, int k, int index) {
//            子问题的边界
            if (list.size() == k) {
                lists.add(new LinkedList<>(list));
                return;
            }
//            子问题的搜索 for循环控制横向树枝的选择 递归控制向下树枝的选择
            for (int i = index; i < ints.length; i++) {
                list.add(ints[i]);
//                下一层的index 依赖于上一层的index 这样不重复
                back(ints, k, i+1);
                list.remove(list.size() - 1);
            }
        }
    }
}
