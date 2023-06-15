import java.util.ArrayList;
import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class SwingII_080 {
    public static void main(String[] args) {
        List<List<Integer>> combine = new Solution().combine(4, 2);
        combine.forEach(System.out::println);


    }

    static class Solution {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        public List<List<Integer>> combine(int n, int k) {
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = i + 1;
            }
            boolean[] visit = new boolean[n];
            back(nums, k, 0, visit);
            return lists;

        }

        private void back(int[] nums, int k, int index, boolean[] visit) {
            if (list.size() == k) {
                lists.add(new ArrayList<>(list));
            }

            for (int i = index; i < nums.length; i++) {
                list.add(nums[i]);
                back(nums, k, i + 1, visit);
                list.remove(list.size() - 1);
            }
        }
    }
}
