/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_dp_01 {
    public static void main(String[] args) {
        int[] weight = {1, 3, 4};
        int[] value = {15, 20, 30};
        int bagSize = 4;
        int[][] ints = dp01(weight, value, bagSize);
        for (int[] aint :
                ints) {
            for (int a :
                    aint) {
                System.out.print(a+" ");
            }
            System.out.println();
        }

    }

    public static int[][] dp01(int[] weight, int[] value, int size) {
//        dp
        int[][] dp = new int[weight.length][size + 1];
//        初始化
        for (int i = 0; i < weight.length; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i <=size; i++) {
            if (i >= weight[0]) {
                dp[0][i] = value[0];
            } else {
                dp[0][i] = 0;
            }
        }

        for (int i = 1; i <weight.length; i++) {
            for (int j = 1; j <= size; j++) {
                if (j < weight[i]) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weight[i]] + value[i]);
                }

            }
        }
        return dp;

    }
}
