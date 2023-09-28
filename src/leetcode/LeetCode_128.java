package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_128 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = {9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6};
        int i = solution.longestConsecutive(ints);
        System.out.println(i);

    }

    /**
     * 最长连续序列 排序后从前往后遍历
     */
   /* static class Solution {
        public int longestConsecutive(int[] nums) {
            if (nums.length == 0) {
                return 0;
            }
//            去重
            HashSet<Integer> set = new HashSet<>();
            for (int a :
                    nums) {
                set.add(a);
            }
            Iterator<Integer> iterator = set.iterator();
            Arrays.sort(nums);
//            使用指针截取有序的数组 数组中有重复的元素 去重
            int left = 0;
            int right = left + 1;
            int max = 1;
            int length = 1;
            int index = 0;
            while (right < nums.length) {
                if (Math.abs(nums[left] - nums[right]) == 1 || Math.abs(nums[left] - nums[right]) == 0) {
                    if (nums[left] == nums[right]) {
                        index++;
                    }
                    length++;
                    right++;
                    left++;
                    max = Math.max(length, max);
                } else {
                    left++;
                    right = left + 1;
                    length = 1;
                }
            }

            return max - index;


        }
    }*/

    /**
     * 使用set去重 遍历所有元素
     */
    static class Solution {
        public int longestConsecutive(int[] nums) {
            if (nums.length == 0) {
                return 0;
            }
//            去重
            HashSet<Integer> set = new HashSet<>();
            for (int a :
                    nums) {
                set.add(a);
            }
            int max=1;
            for (int num :
                    set) {
//                小于数都不满足 只看增数 就是只要确定一个有序方向即可
                if (!set.contains(num - 1)) {
//                    更新
                    int newNum = num;
                    int length = 1;
                    while (set.contains(newNum+1)){
                        length++;
                        newNum++;
                    }
                    max = Math.max(length,max);
                }

            }
            return max;

        }
    }
}
