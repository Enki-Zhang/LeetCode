package swing;

/**
 * @author Enki
 * @Version 1.0
 */
public class Swing2_14_II {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.cuttingRope(500
        ));

    }

    /**
     * 剪绳子II  计算大数求余
     */
    static class Solution {
        public int cuttingRope(int n) {
            long mod = 1000000007;
//            n<3
            if (n <= 2) {
                return 1;
            }
            if (n == 3) {
                return 2;
            }
            double product = 1;
//            计算快速幂的余数
            int a = 3;
            while (n > 4) {
                product = (product) * a % mod;
                n -= 3;
            }

            return (int) (product * n % mod);

        }


    }
}
