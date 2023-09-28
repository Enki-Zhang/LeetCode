package exam.tongdun;

import java.util.Scanner;

/**
 * @author Enki
 * @ClassName Main2
 * @Description: TODO
 * @Date 2023/9/22 19:46
 * @Version 1.0
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int V = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
//        01背包
        int[][] dp = new int[n + 1][V + 1];
//        初始化 行
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }
//        初始化列
        for (int i = 0; i <= V; i++) {
            dp[0][i] = 0;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= V; j++) {
                if (nums[i - 1] <= j) {//放得下
                    dp[i][j] = Math.max(dp[i - 1][j - nums[i - 1]] + nums[i - 1], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }

            }

        }

        System.out.println(V - dp[n][V]);
    }

}
