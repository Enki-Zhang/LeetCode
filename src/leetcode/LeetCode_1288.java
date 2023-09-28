package leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Enki
 * @ClassName LeetCode_1288
 * @Description: TODO
 * @Date 2023/8/21 13:55
 * @Version 1.0
 */
public class LeetCode_1288 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.removeCoveredIntervals(new int[][]{{1, 4}, {1, 2}, {3, 4}}));

    }

    /**
     * 对区间按照起点进行排序
     */
    static class Solution {
        public int removeCoveredIntervals(int[][] intervals) {
//            按照起点排序
            Arrays.sort(intervals, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    if (o1[0] == o2[0]) {
                        return -(o1[1] - o2[1]);
                    }

                    return o1[0] - o2[0];
                }
            });
            int count = 0;
            for (int i = 1; i < intervals.length; i++) {
                if (intervals[i - 1][1] >= intervals[i][1] && intervals[i-1][0] <= intervals[i][0]) {
                    intervals[i][0] = intervals[i-1][0];
                    intervals[i][1] = intervals[i-1][1];
                    count++;
                }
            }
            return intervals.length - count;

        }
    }
}
