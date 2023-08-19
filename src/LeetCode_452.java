import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Enki
 * @ClassName LeetCode_452
 * @Description: TODO
 * @Date 2023/8/19 10:49
 * @Version 1.0
 */
public class LeetCode_452 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] re = solution.findMinArrowShots(new int[][]{{10, 16}, {1, 3}, {2, 8}, {1, 6}, {7, 12}});
        for (int[] a :
                re) {
            System.out.println(a[0] + " " + a[1]);
        }

    }

    /**
     * 用最少数量的箭引爆气球 区间合并 先对气球按照point[0]进行排序 在根据point[1]升序排序 再进行依次合并 求出独立空间
     */
    static class Solution {
        public int[][] findMinArrowShots(int[][] points) {
            Arrays.sort(points, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    if (o1[0] == o2[0]) {
                        return o1[1] - o2[1];
                    }
                    return o1[0] - o2[0];
                }
            });
            ArrayList<int[]> list = new ArrayList<>();
//            区间合并
            for (int i = 0; i < points.length - 1; i++) {
                if (points[i][0] < points[i + 1][0] && points[i][1] < points[i][1]) {
                    list.add(new int[]{points[i][0], points[i + 1][1]});
                }
            }
//            if (list.get(list.size() - 1)[0] < points[points.length - 1][0] && list.get(list.size() - 1)[1] < points[points.length - 1][1]) {
//                list.add(new int[]{list.get(list.size() - 1)[0],points[points.length - 1][1]});
//            }
            return list.toArray(new int[points.length][points[0].length]);
        }
    }
}
