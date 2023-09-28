package leetcode;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author Enki
 * @ClassName LeetCode_1
 * @Description: TODO
 * @Date 2023/9/21 11:21
 * @Version 1.0
 */
public class LeetCode_1 {
    public static void main(String[] args) {

    }

    class Solution {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> map = new HashMap<>();
            int[] tar = new int[2];
            for (int i = 0; i < nums.length; i++) {
                map.put(nums[i], i);
            }
            for (int i = 0; i < nums.length; i++) {
                int key = target - nums[i];
                if (map.containsKey(key) && map.get(key) != i) {
                    tar[0] = i;
                    tar[1] = map.get(key);
                    break;
                }
            }

            return tar;
        }
    }
}
