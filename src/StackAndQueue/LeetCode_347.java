package StackAndQueue;

import java.util.*;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_347 {
    public static void main(String[] args) {
        int[] nums={1,1,1,1,1,12,3,2,2,2};

        System.out.println(Solution.topKFrequent(nums, 2));

    }

   static class Solution {
        public static List<Map.Entry<Integer,Integer>> topKFrequent(int[] nums, int k) {
            HashMap<Integer, Integer> map = new HashMap<>();

            for (int num : nums) {
//              判断key是否存在 存在value自增1 不存在添加
                int count = map.containsKey(num) ? map.get(num) : 0;
                map.put(num, count + 1);
            }
            List<Map.Entry<Integer,Integer>> list = new ArrayList<Map.Entry<Integer,Integer>>(map.entrySet());

            Collections.sort(list,new Comparator<Map.Entry<Integer,Integer>>() {
                @Override
                public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                    return o1.getValue().compareTo(o2.getValue());//升序排列 大于0
                }
            });
            return list;

        }

    }
}
