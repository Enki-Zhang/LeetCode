/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_50 {
    public static void main(String[] args) {
        double v = new Solution().myPow(2.00000, 3);
        System.out.println(v);

    }

    /**
     * Pow(x, n) 计算幂函数 递归计算x^2
     */
    static class Solution {
        public double myPow(double x, int n) {
            long N = n;
            return n >= 0 ? myQuickPow(x, N) : 1 / myQuickPow(x, N);

        }

        private double myQuickPow(double x, long n) {
            if (n == 0) {
                return 1.0;
            }
            double y = myQuickPow(x, n / 2);
            return n % 2 == 0 ? y * y : y * y * x;
        }
    }
}
