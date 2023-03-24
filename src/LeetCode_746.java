/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_746 {
    public static void main(String[] args) {
    }

    class Solution {
        public int minCostClimbingStairs(int[] cost) {
            if (cost.length < 2) {
                return 0;
            }
            int[] tar = new int[cost.length];
            tar[0] = 0;
            tar[1] = 0;
            for (int i = 2; i <= cost.length; i++) {
                tar[i] = Math.min(tar[i - 1] + cost[i - 1], tar[i - 2] + cost[i - 2]);
            }
            return tar[cost.length-1];

        }
    }
}
