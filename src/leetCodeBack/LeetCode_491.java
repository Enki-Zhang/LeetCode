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
//    找到所有子集 判断是否递增 数组不能排序 不能用used数组 难点在于去重
    static class Solution {
        public List<List<Integer>> findSubsequences(int[] nums) {
            List<List<Integer>> lists = new LinkedList<>();
            backSubSeq(nums, 0, lists, new LinkedList<Integer>());
            return lists;
        }

        public void backSubSeq(int[] nums, int start, List<List<Integer>> lists, LinkedList<Integer> list) {
            if (list.size()>1) {
                ArrayList<Integer> integers = new ArrayList<>(list);
                lists.add(integers);
//                return;
            }
            int[] used = new int[201];
            for (int i = start; i < nums.length; i++) {
                if (!list.isEmpty() && nums[i] < list.get(list.size()-1) || used[nums[i]+100]==1)continue;
                used[nums[i]+100] = 1;
                list.add(nums[i]);
                backSubSeq(nums, i+1 ,  lists, list);
                list.removeLast();
            }
        }

//        Boolean isIncreat(List<Integer> list) {
//            Iterator<Integer> iterator = list.iterator();
//            if (list.size() < 2) return false;
//            int last = Integer.MIN_VALUE;
//            while (iterator.hasNext()) {
//                Integer next = iterator.next();
//                if (last > next) {
//                    return false;
//                }
//                last = next;
//            }
//            return true;
//        }
    }
}
