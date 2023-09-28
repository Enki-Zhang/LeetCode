package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_56 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] ints = {{1, 4}, {0, 2}, {3, 5}};
        int[][] merge = solution.merge(ints);
        for (int i = 0; i < merge.length; i++) {
            System.out.println(Arrays.toString(merge[i]));
        }


    }

    /**
     * 区间合并 将数据按照左端点进行排序 当前左端点在区间右端点之后 则不重合 否则合并 合并需要考虑选择右端点最大值
     */
    static class Solution {
        public int[][] merge(int[][] intervals) {
            //            对区间进行排序 按照左端点进行排序
            Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);

            List<int[]> ints = new ArrayList<>();
            for (int i = 0; i < intervals.length; i++) {
                int left = intervals[i][0];
                int right = intervals[i][1];
//                    当前数组的左端点大于前一个数组的又端点 不合并 直接放入
                if (ints.size() == 0 || ints.get(ints.size() - 1)[1] < left) {
                    ints.add(new int[]{left, right});
                } else {
//                        否则进行合并 选择断点 和选择替换位置 防止出界
                    ints.set(ints.size() - 1, new int[]{ints.get(ints.size() - 1)[0], Math.max(right, ints.get(ints.size() - 1)[1])});
                }
            }
            return ints.toArray(new int[ints.size()][]);
        }
    }
}
