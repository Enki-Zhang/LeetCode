package leetCodeHash;

import java.util.*;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_448 {
    public static void main(String[] args) {

    }

    class Solution {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            ArrayList<Integer> integers = new ArrayList<>();
            HashMap<Integer, Integer> map = new HashMap<>();
//            将1-n放入map中
            for (int i = 0; i < nums.length; i++) {
                map.put(i + 1, 0);
            }
//            将数组中的每个元素进行遍历
            for (int i :
                    nums) {
                if (map.containsKey(i)) {
                    map.put(i, map.get(i) + 1);
                }
            }
            Set<Integer> keySet = map.keySet();
            Iterator<Integer> iterator = keySet.iterator();
            while (iterator.hasNext()) {
                Integer next = iterator.next();
                if (map.get(next) == 0) {
                    integers.add(next);
                }
            }
            return integers;
        }
    }
}
