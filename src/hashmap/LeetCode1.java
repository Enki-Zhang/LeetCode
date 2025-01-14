package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @ClassName LeetCode1
 * @Description TODO
 * @Author Enki
 * @Date 2024/11/3 12:46
 * @Verison 1.0
 **/
public class LeetCode1 {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        List<Integer> collect = integers.stream().collect(Collectors.toList());
        List<Integer> collect1 = Stream.of(1, 2, 3).collect(Collectors.toList());

    }


    class Solution {
        /**
         * 两数之和 使用map记录需要找到的数
         *
         * @param nums
         * @param target
         * @return
         */
        public int[] twoSum(int[] nums, int target) {
            int[] result = new int[2];
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                map.put(nums[i], i);
            }
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i) {
                    result[0] = i;
                    result[1] = map.get(target - nums[i]);
                }
            }

            return result;


        }
    }
}
