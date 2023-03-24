package StackAndQueue;

import java.util.*;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_347_2 {
    public static void main(String[] args) {

    }

    class Solution {
        public int[] topKFrequent(int[] nums, int k) {
            Arrays.sort(nums);
            int[] tar = new int[k];
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int a :
                    nums) {
                map.put(a, map.getOrDefault(a, 1) + 1);
            }
            ArrayList<Map.Entry<Integer, Integer>> maps = new ArrayList<>(map.entrySet());

            Collections.sort(maps, new Comparator<Map.Entry<Integer, Integer>>() {
                @Override
                public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                    return o1.getValue() - o2.getValue();
                }
            });

            Iterator<Map.Entry<Integer, Integer>> iterator = maps.iterator();
            for (Map.Entry<Integer, Integer> entry : maps) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
            for (int i = 0; i < k; i++) {
                Map.Entry<Integer, Integer> next = iterator.next();
                tar[i] = next.getKey();
            }
            return tar;


        }
    }
}

