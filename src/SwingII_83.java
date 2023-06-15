import java.util.ArrayList;
import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class SwingII_83 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        Solution solution = new Solution();
        List<List<Integer>> permute = solution.permute(nums);
        permute.forEach(System.out::println);


    }
// 没有重复元素集合的全排列 组内和组间不重复

    static class Solution {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        public List<List<Integer>> permute(int[] nums) {
            boolean[] visit = new boolean[nums.length];
            back(nums, 0, visit);
            return lists;
        }

        private void back(int[] nums, int index, boolean[] visit) {
            if (list.size() == nums.length) {
                lists.add(new ArrayList<>(list));
            }
//            i从index开始当遍历到末尾数字后3后 index++不能够再回来取到2 所以每次遍历都要从头开始
            for (int i = 0; i < nums.length; i++) {
                if (visit[i]) continue;
                list.add(nums[i]);
                visit[i] = true;
                back(nums, i + 1, visit);
                list.remove(list.size() - 1);
                visit[i] = false;
            }

        }

    }
}
