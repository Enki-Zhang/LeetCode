package leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Enki
 * @ClassName LeetCode_435
 * @Description: TODO
 * @Date 2023/8/20 10:22
 * @Version 1.0
 */
public class LeetCode_435 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.eraseOverlapIntervals(new int[][]{{1, 2}, {2, 3}, {3, 4}, {1, 3}}));

    }

    /**
     * 无重叠区间
     */
    static class Solution {
        public int eraseOverlapIntervals(int[][] intervals) {
//            Arrays.sort(intervals, new Comparator<int[]>() {
//                @Override
//                public int compare(int[] o1, int[] o2) {
//                    if (o1[0] == o2[0]) {
//                    return o1[1] - o2[1];
//                }
//                    return o1[0] - o2[0];
//                }
//            });
            Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
            int count = 1;
            for (int i = 1; i < intervals.length; i++) {
                if (intervals[i][0] < intervals[i - 1][1]) {
                    intervals[i][1] = Math.min(intervals[i][1], intervals[i - 1][1]);
//                    intervals[i][0] = intervals[i - 1][0];
//                    intervals[i][1] = intervals[i - 1][1];
                } else {
                    count++;
                }
            }
            return intervals.length - count;
        }
    }
}
