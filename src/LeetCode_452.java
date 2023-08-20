import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

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
        System.out.println(solution.findMinArrowShots(new int[][]{{-2147483646,-2147483645}, {2147483646,2147483647}}));

//TODO
    }

    /**
     * 用最少数量的箭引爆气球 区间合并 先对气球按照point[0]进行排序 在根据point[1]升序排序 再进行依次合并 求出独立空间
     */
    static class Solution {
        public int findMinArrowShots(int[][] points) {
//            Arrays.sort(points, (o1, o2) -> {
//                if (o1[0] == o2[0]) {
//                    return o1[1] - o2[1];
//                }
//                return (o1[0] - o2[0]);
//            });
//            溢出
            Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
            int count = 1;
//            区间合并
            for (int i = 1; i < points.length; i++) {
                if (points[i][0] > points[i - 1][1]) {
                    count++;
                } else {
                    points[i][1] = Math.min(points[i][1], points[i - 1][1]);
                }
            }
            return count;
        }
    }
}
