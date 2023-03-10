package leetCodeArray.leetCodeArray_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_209 {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        int i = Solution.minSubArrayLen(target, nums);
        System.out.println(i);
    }

    static class Solution {
        public static int minSubArrayLen(int target, int[] nums) {
            ArrayList<Integer> integers = new ArrayList<>();
            int slow = 0;
            int sum = 0;
            int fast = 0;
            while (fast < nums.length) {
                sum += nums[fast];
                if (sum >= target) {
                    integers.add(fast - slow + 1);
                    slow++;
                    fast = slow;
                    sum = 0;
                    continue;
                } else {
                    fast++;
                }
            }
            if (integers.isEmpty()) {
                return 0;
            }
            return Collections.min(integers);
        }
    }
}
