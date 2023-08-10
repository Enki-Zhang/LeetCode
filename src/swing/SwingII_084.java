package swing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class SwingII_084 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        Solution solution = new Solution();
        List<List<Integer>> permute = solution.permuteUnique(nums);
        permute.forEach(System.out::println);
        double x = 0.0 ;
        int n=0;
        double pow = Math.pow(x, n);
        System.out.println(pow);

    }

    //
    static class Solution {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        public List<List<Integer>> permuteUnique(int[] nums) {
            Arrays.sort(nums);
            boolean[] visit = new boolean[nums.length];
            back(nums, 0, visit);
            return lists;
        }

        private void back(int[] nums, int index, boolean[] visit) {
            if (list.size() == nums.length) {
                lists.add(new ArrayList<>(list));
            }
            for (int i = 0; i < nums.length; i++) {
//                不同树枝之间的去重
                if (i > 0 && !visit[i - 1] && nums[i] == nums[i - 1]) continue;
//                同一个树枝的去重
                if (visit[i]) continue;
                visit[i] = true;
                list.add(nums[i]);
                back(nums, i + 1, visit);
                list.remove(list.size() - 1);
                visit[i] = false;

            }


        }
    }
}
