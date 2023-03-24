/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_957 {
    public static void main(String[] args) {
        int[] cells = {1,1,0,1,1,0,0,1};
        int[][] ints = Solution.prisonAfterNDays(cells, 30);
        for (int[] anInt : ints) {
            for (int an :
                    anInt) {
                System.out.print(an);
            }
            System.out.println();
        }
        System.out.println(300663720%15);
    }

    static class Solution {
        public static int[][] prisonAfterNDays(int[] cells, int n) {
            int[][] dp = new int[14 + 1][cells.length];
            for (int i = 0; i < cells.length; i++) {
                dp[0][i] = cells[i];
            }
            for (int i = 1; i < 15; i++) {
                dp[i][0] = 0;
                dp[i][cells.length - 1] = 0;
                for (int j = 1; j < cells.length - 1; j++) {
                    if ((dp[i - 1][j - 1] ^ dp[i - 1][j + 1]) == 1) {
                        dp[i][j] = 0;
                    } else {
                        dp[i][j] = 1;
                    }
                }
            }
            int k = n % 14;
//            if (k == 0) {
//                return dp[1];
//            }
            return dp;
        }
    }
}
