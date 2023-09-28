package leetcode;

import java.nio.file.Paths;
import java.util.Scanner;

/**
 * @author Enki
 * @ClassName LeetCode_509_2
 * @Description: TODO
 * @Date 2023/8/23 8:43
 * @Version 1.0
 */
public class LeetCode_509_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        Solution solution = new Solution();
        System.out.println(solution.fib(i));

    }

    /**
     * 斐波那契数 存在重叠的子问题: F(4) = F(3)+F(2) 而F(3) = F(2) + F(1) 子问题F(2)重叠
     * 将子问题做备忘录 dp[i] = 1 (i<=2) 或者 dp(i) = dp(i-1) + dp(i-2);  (i > 2)
     */
    static class Solution {
        public int fib(int n) {
            if (n == 0) {
                return 0;
            }
            int[] dp = new int[n];
            if (n <= 2) {
                return 1;
            }
            dp[0] = 1;
            dp[1] = 1;
            for (int i = 2; i < n; i++) {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
            return dp[n - 1];
        }
    }
}
