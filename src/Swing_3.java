import java.util.Arrays;
import java.util.HashSet;

/**
 * @author Enki
 * @Version 1.0
 */
public class Swing_3 {
    public static void main(String[] args) {

    }

    class Solution {
        public int findRepeatNumber(int[] nums) {
            Arrays.sort(nums);

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == nums[i - 1]) {
                    return nums[i];
                }
            }

            return -1;

        }
    }
}
