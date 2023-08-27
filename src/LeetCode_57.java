import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

/**
 * @author Enki
 * @ClassName LeetCode_57
 * @Description: TODO
 * @Date 2023/8/22 8:57
 * @Version 1.0
 */
public class LeetCode_57 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.insert(new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}}, new int[]{4, 8}));

    }

    /**
     * 插入区间 插入区间判断是否需要合并
     * 合并条件：按照起始断点进行排序，1.若插入部分 起始断点 小于前一个的终止断点
     * 2. 若插入部分的终止断点 小于后一个的起始断点
     */
    static class Solution {
        public int[][] insert(int[][] intervals, int[] newInterval) {
            ArrayList<int[]> list = new ArrayList<>();
            for (int i = 0; i < intervals.length; i++) {
                list.add(new int[]{intervals[i][0], intervals[i][1]});
            }
            list.add(newInterval);
            int[][] ints = list.toArray(new int[list.size()][2]);

//            排序
            Arrays.sort(ints, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    if (o1[0] == o2[0]) {
                        return o2[1] - o1[1];
                    }
                    return (o1[0] - o2[0]);
                }
            });
//            for (int[] a :
//                    ints) {
//                System.out.println(a[0] + " " +a[1]);
//            }
            ArrayList<int[]> res = new ArrayList<>();
//            插入
            for (int i = 0; i < ints.length; i++) {
                int left = ints[i][0];
                int right = ints[i][1];
//                合并区间 新加入的区间起点大于合并区间的终点 没有重叠
                if (res.size() == 0 || res.get(res.size()-1)[1]<left) {
                    res.add(new int[]{left, right});
                } else {
                    res.set(res.size()-1,new int[]{ res.get(res.size()-1)[0], Math.max(right, res.get(res.size()-1)[1])});
                }
            }
            Iterator<int[]> iterator = res.iterator();
            while (iterator.hasNext()) {
                int[] next = iterator.next();
                System.out.println(next[0] + " " + next[1]);
            }
//            res.remove(res.size()-1);
            return res.toArray(new int[res.size()][2]);


        }
    }
}
