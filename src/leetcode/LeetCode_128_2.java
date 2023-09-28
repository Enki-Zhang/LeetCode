package leetcode;

import java.util.HashSet;

/**
 * @author Enki
 * @ClassName LeetCode_128_2
 * @Description: TODO
 * @Date 2023/9/9 10:14
 * @Version 1.0
 */
public class LeetCode_128_2 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestConsecutive(new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1}));

    }

    /**
     * 最长连续序列 将元素放到set中 将每个元素依次查表判断是否递增连续的元素存在 存在长度++ 只从递增的方向判断即可
     */
    static class Solution {
        public int longestConsecutive(int[] nums) {
            if (nums.length == 0) {
                return 1;
            }
            HashSet<Integer> set = new HashSet<>();
            int length = 0;
            int max = 0;
            for (int a :
                    nums) {
                set.add(a);
            }
            for (int num :
                    nums) {
                if (!set.contains(num - 1)) {
                    length = 0;
                    int tar = num;
                    while (set.contains(tar + 1)) {
                        tar = tar + 1;
                        length++;
                    }
                }
                max = Math.max(length, max);
            }
            return max + 1;
        }
    }
}
