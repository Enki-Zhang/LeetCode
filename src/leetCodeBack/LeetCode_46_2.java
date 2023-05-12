package leetCodeBack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_46_2 {
    public static void main(String[] args) {
        int[] n = {1, 1, 2};
        Solution solution = new Solution();
        List<List<Integer>> permute = solution.permute(n);
        permute.forEach(System.out::println);
    }

    static class Solution {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        public List<List<Integer>> permute(int[] nums) {
            Arrays.sort(nums);
//            used数组
            boolean[] used = new boolean[nums.length];
            for (int i = 0; i < nums.length; i++) {
                used[i] = false;
            }
            back(nums, 0, used);
            return lists;
        }

        // 组间不能重复 组内元素需要从头开始扫描 不能重复使用
        public void back(int[] nums, int start, boolean[] used) {
//            收集节点
            if (list.size() == nums.length) {
                lists.add(new ArrayList<>(list));
            }
//            一个循环为一层
            for (int i = 0; i < nums.length; i++) {
//                判断组间是否重复
                if ( used[i]) continue;
                list.add(nums[i]);
                used[i] = true;
                back(nums, i+1, used);
                used[i] = false;
                list.remove(list.size() - 1);
            }
        }
    }
}
