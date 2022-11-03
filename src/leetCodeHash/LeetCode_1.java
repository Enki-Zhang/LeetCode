package leetCodeHash;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_1 {
    public static void main(String[] args) {
    }

    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] ints = new int[2];
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                map.put(nums[i], i);
            }
            for (int i = 0; i < nums.length; i++) {
                int tmp = target - nums[i];
                if (map.containsKey(tmp)&&map.get(tmp)!=i) {
                    ints[0] = i;
                    ints[1] = map.get(tmp);
                }
            }
            return ints;
        }
    }
}
