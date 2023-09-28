package leetcode;

import java.util.ArrayList;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_70 {
    public static void main(String[] args) {
    }

    class Solution {
        public int climbStairs(int n) {
            int[] tar = new int[n + 1];
            if (n == 0) {
                return 0;
            }
            if (n == 1) {
                return 1;
            }
            if (n == 2) {
                return 2;
            }
            tar[0] = 0;
            tar[1] = 1;
            tar[2] = 2;
            for (int i = 3; i <= n; i++) {
                tar[i] = tar[i - 1] + tar[i - 2];
            }
            return tar[n];
        }
    }
}
