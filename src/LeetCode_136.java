import java.util.Arrays;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_136 {
    public static void main(String[] args) {

    }

    class Solution {
        public int singleNumber(int[] nums) {
            if (nums.length == 1) {
                return nums[0];
            }
            Arrays.sort(nums);
            int tar = 0;
            int i = 0;
            while (i < nums.length) {
                if (i == 0 && nums[i] != nums[i + 1]) {
                    tar = nums[i];
                    return tar;
                }
                if (i == nums.length - 1 && nums[i] != nums[i - 1]) {
                    return nums[i];
                }
                if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                    i++;
                } else if (i > 0 && i < nums.length - 1 && nums[i] != nums[i + 1] && nums[i] != nums[i - 1]) {
                    tar = nums[i];
                } else {
                    i++;
                }
            }
            return tar;

        }
    }
}
