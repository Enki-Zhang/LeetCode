package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Enki
 * @ClassName LeetCode_406
 * @Description: TODO
 * @Date 2023/8/19 9:51
 * @Version 1.0
 */
public class LeetCode_406 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] ints = solution.reconstructQueue(new int[][]{{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6, 1}, {5, 2}});
        for (int[] a :
                ints) {
            System.out.println(a[0] + " " + a[1]);
        }

    }

    /**
     * 根据身高排序  先对身高进行排序 之后根据数量进行插入排序
     */
    static class Solution {
        public int[][] reconstructQueue(int[][] people) {
//            按照身高排序
            Arrays.sort(people, new Comparator<int[]>() {
                /**
                 * 自定义排序 返回正数则交换
                 * 完成从大到小的排序 如果o1-o2>0
                 *
                 * @param o1
                 * @param o2
                 * @return
                 */
                @Override
                public int compare(int[] o1, int[] o2) {
                    if (o1[0] == o2[0]) {
                        return (o1[1] - o2[1]);
                    }
                    return -(o1[0] - o2[0]);
                }
            });
//            构造新的数组插入
            ArrayList<int[]> ints = new ArrayList<>();
            for (int[] a :
                    people) {
                ints.add(a[1], a);
            }

            return ints.toArray(new int[people.length][people[0].length]);
        }
    }
}
