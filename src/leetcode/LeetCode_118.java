package leetcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Enki
 * @ClassName LeetCode_118
 * @Description: TODO
 * @Date 2023/8/20 11:10
 * @Version 1.0
 */
public class LeetCode_118 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.generate(5));

    }

    /**
     * 杨辉三角
     */
    static class Solution {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        public List<List<Integer>> generate(int numRows) {
            for (int i = 1; i <= numRows; i++) {
                if (i == 1) {
                    list.add(1);
                    lists.add(new ArrayList<>(list));
                    list.clear();
                } else if (i == 2) {
                    list.add(1);
                    list.add(1);
                    lists.add(new ArrayList<>(list));
                    list.clear();
                } else {
                    List<Integer> last = lists.get(i - 1 - 1);
                    Integer[] integers = last.toArray(new Integer[last.size()]);
                    int temp = integers[0];
                    list.add(temp);
                    for (int j = 1; j < integers.length; j++) {
                        list.add(temp + integers[j]);
                        temp = integers[j];
                    }
                    list.add(1);
                    lists.add(new ArrayList<>(list));

                    list.clear();
                }

            }
            return lists;
        }
    }
}
