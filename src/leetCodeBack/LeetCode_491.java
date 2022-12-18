package leetCodeBack;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import com.sun.org.apache.bcel.internal.generic.SIPUSH;

import java.util.*;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_491 {
    public static void main(String[] args) {
        int[] nums = {4, 6, 7, 7};
        List<List<Integer>> subsequences = new Solution().findSubsequences(nums);
        System.out.println(subsequences);
    }

    // 找到递增的子数组
//    找到所有子集 判断是否递增 数组不能排序 难点在于去重
    static class Solution {
        public List<List<Integer>> findSubsequences(int[] nums) {
            List<List<Integer>> lists = new LinkedList<>();
            Boolean[] used = new Boolean[nums.length];
            for (int i = 0; i < nums.length; i++) {
                used[i] = false;
            }
            backSubSeq(nums, 0, used, lists, new LinkedList<Integer>());
            return lists;
        }

        public void backSubSeq(int[] nums, int start, Boolean[] used, List<List<Integer>> lists, LinkedList<Integer> list) {
            if (isIncreat(list)) {
                ArrayList<Integer> integers = new ArrayList<>(list);
                lists.add(integers);
            }
            if (start >= nums.length) {
                return;
            }
            for (int i = start; i < nums.length; i++) {
//                if (i > 1 && nums[i - 1] == nums[i] && !used[i]) continue;
                used[i] = true;
                list.add(nums[i]);
                backSubSeq(nums, i + 1, used, lists, list);
                list.removeLast();
                used[i] = false;
            }
        }

        Boolean isIncreat(List<Integer> list) {
            Iterator<Integer> iterator = list.iterator();
            if (list.size() < 2) return false;
            int last = Integer.MIN_VALUE;
            while (iterator.hasNext()) {
                Integer next = iterator.next();
                if (last > next) {
                    return false;
                }
                last = next;
            }
            return true;
        }
    }
}
