package leetcode;

/**
 * @author Enki
 * @ClassName LeetCode_474
 * @Description: TODO
 * @Date 2023/9/1 9:27
 * @Version 1.0
 */
public class LeetCode_474 {
    public static void main(String[] args) {

    }

    /**
     * 背包问题 将字符串数组中的字符中的mn 放入到子集中
     */
    class Solution {
        public int findMaxForm(String[] strs, int m, int n) {
            int strsSize = strs.length;
            int[][][] dp = new int[strsSize + 1][m][n];
            for (int i = 0; i < strsSize+1; i++) {
                dp[i][0][0] = 0;
            }
//            todo
            return 0;
        }
    }
}
