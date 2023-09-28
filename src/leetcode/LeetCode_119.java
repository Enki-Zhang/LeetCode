package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Enki
 * @ClassName LeetCode_119
 * @Description: TODO
 * @Date 2023/8/20 14:55
 * @Version 1.0
 */
public class LeetCode_119 {
    public static void main(String[] args) {

    }

    /**
     * 返回杨辉三角的第几行
     */
    class Solution {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        public List<Integer> getRow(int rowIndex) {
            int index = rowIndex+1;
            for (int i = 1; i <= index; i++) {
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
        return lists.get(lists.size()-1);
        }
    }
}
