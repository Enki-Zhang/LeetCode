package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class quan {
    public static void main(String[] args) {
        Prem prem = new Prem();
        int[] ints = {0,1};
        List<List<Integer>> permute = prem.permute(ints);
        System.out.println(permute);
    }

    /**
     * 算法题：全排列
     *  * 给定一个不含重复数字的数组 nums ，返回其所有可能的全排列 。你可以 按任意顺序 返回答案。
     *  * 示例 1：
     *  * 输入：nums = [1,2,3]
     *  * 输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
     *  * 示例 2：
     *  * 输入：nums = [0,1]
     *  * 输出：[[0,1],[1,0]]
     *  * 示例 3：
     *  * 输入：nums = [1]
     *  * 输出：[[1]]
     *  回溯 将list排序，并使用used数组防止重复
     */
    static class Prem {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        public List<List<Integer>> permute(int[] nums) {
//            排序
            Arrays.sort(nums);
//            used数组 去重
            boolean[] used = new boolean[nums.length];
            for (int i = 0; i < nums.length; i++) {
                used[i] = false;
            }
            back(nums, 0, used);
            return lists;
        }

        public void back(int[] nums, int start, boolean[] used) {
//            收集叶子节点
            if (list.size() == nums.length) {
                lists.add(new ArrayList<>(list));
            }
            for (int i = 0; i < nums.length; i++) {
                if ( used[i] ) continue;
                list.add(nums[i]);
                used[i] = true;
                back(nums, i+1, used);
                used[i] = false;
                list.remove(list.size() - 1);
            }
        }
    }
}
