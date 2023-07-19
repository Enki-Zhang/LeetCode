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

    }

    /**
     * 区间合并 将数据按照左端点进行排序 当前左端点在区间右端点之后 则不重合 否则合并
     */
        class Solution {
            public int[][] merge(int[][] intervals) {
    //            对区间进行排序
                Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);

                List<int[]> ints = new ArrayList<>();
                for (int i = 0; i < intervals.length; i++) {
                    int left = intervals[i][0];
                    int right = intervals[i][1];
                    if (ints.size() == 0 || ints.get(ints.size() - 1)[1] < left) {
                        ints.add(new int[]{left, right});
                    } else {
                        ints.set(i,new int[]{ints.get(ints.size()-1)[0],right});
                    }
                }

                return ints.toArray(new int[ints.size()][]);


            }
        }
}
