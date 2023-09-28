package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author Enki
 * @ClassName LeetCode_763
 * @Description: TODO
 * @Date 2023/8/21 9:12
 * @Version 1.0
 */
public class LeetCode_763 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.partitionLabels("eccbbbbdec"));

    }

    /**
     * 按照区间划分思想 记录每个字符最后出现的位置 并更新每个字符最后位置的最大位置 当遍历到该最大位置时则为分界点
     */
    static class Solution {
        public List<Integer> partitionLabels(String s) {
//            HashMap<Character, int[]> startAndEnd = new HashMap<>();
            HashMap<Character, Integer> map = new HashMap<>();

//           遍历字符记录每个字符的区间 去重搜索
            for (int i = 0; i < s.length(); i++) {
                map.put(s.charAt(i), i);
            }
            System.out.println(map);
            ArrayList<Integer> integers = new ArrayList<>();
            int maxIndex = 0;
//            integers.add(0);
            for (int i = 0; i < s.length(); i++) {
                maxIndex = Math.max(maxIndex, map.get(s.charAt(i)));
                if (i == maxIndex) {
                    integers.add(i);
                }
            }
            System.out.println(integers);
            ArrayList<Integer> result = new ArrayList<>();
            int start = 0;
            for (Integer a :
                    integers) {
                result.add(a - start);
                start = a;
            }
            result.set(0, result.get(0) + 1);
            return result;

        }
    }
}
