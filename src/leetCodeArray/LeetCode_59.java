package leetCodeArray;

import java.util.Arrays;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_59 {
    public static void main(String[] args) {
        int n = 3;
        int[][] ints = Solution.generateMatrix(n);
        System.out.println(Arrays.deepToString(ints));

    }

    static class Solution {
        public static int[][] generateMatrix(int n) {
            int[][] targetNums = new int[n][n];
            int k = n - 1;
            int num = 1;
            int loop = 0;
            while (loop < k) {
                for (int i = loop, j = loop; j < k - loop; j++, num++) {
                    targetNums[i][j] = num;//末尾数为n[0][k-1]
                }
                for (int i = loop, j = k - loop; i < k - loop; i++, num++) {
                    targetNums[i][j] = num;//末尾数为n[k-1][k]
                }
                for (int i = k - loop, j = k - loop; j > loop; j--, num++) {
                    targetNums[i][j] = num;//末尾数n[k][1]
                }
                for (int i = k - loop, j = loop; i > loop; i--, num++) {
                    targetNums[i][j] = num;
                }
                loop++;
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (targetNums[i][j] == 0) {
                        targetNums[i][j] = num;
                    }
                }
            }
            return targetNums;
        }
    }
}
