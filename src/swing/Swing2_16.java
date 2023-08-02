package swing;

/**
 * @author Enki
 * @Version 1.0
 */
public class Swing2_16 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        double v = solution.myPow(3, 5);
        System.out.println(v);

    }

    /**
     * 数值的整数次方 使用平方算法 递归
     */
    static class Solution {
        public double myPow(double x, int n) {
            double result = 0;
//            n 为奇数
            result = quickPow(x, n);
            return n > 0 ? result : 1 / result;
        }

        public double quickPow(double x, int n) {
            if (n == 0) {
                return 1.0;
            }
            double y = quickPow(x, n / 2);
            return n % 2 == 0 ? y * y : y * y * x;
        }

    }
}
