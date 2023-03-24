/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_421{
    public static void main(String[] args) {

    }
    class Solution {
        public int findMaximumXOR(int[] nums) {
            int max = 0;
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    max = Math.max(nums[i]^nums[j],max);

                }

            }

            return max;
        }
    }
}
