package leetCodeHash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.OptionalInt;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_128 {
    public static void main(String[] args) {

    }

    class Solution {
        public int longestConsecutive(int[] nums) {
            HashSet<Integer> set = new HashSet<>();

            for (int i = 0; i < nums.length; i++) {
                set.add(nums[i]);
            }


            return 0;
        }
    }
}
