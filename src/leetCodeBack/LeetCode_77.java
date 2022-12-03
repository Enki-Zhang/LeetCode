package leetCodeBack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_77 {
    public static void main(String[] args) {

    }
//    组合问题

    class Solution {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        public List<List<Integer>> combine(int n, int k) {
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = i + 1;
            }
            backTrack(nums, k, 0);
            return lists;
        }

        public void backTrack(int[] nums, int k, int start) {
            if (list.size() == k) {
                ArrayList<Integer> integers = new ArrayList<>(list);
                lists.add(integers);
                return;
            }
//            剪枝
//            k - list.size() 为还需要遍历的元素个数
//            nums.length - (k - list.size())+1 元素遍历的起始点 因为是顺序加入节点的
            for (int i = start; i < nums.length - (k - list.size()) + 1; i++) {
                list.add(nums[i]);
                backTrack(nums, k, i + 1);
                list.remove(list.size() - 1);
            }
        }
    }

}
