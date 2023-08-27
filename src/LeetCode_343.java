/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_343 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.integerBreak(50));

    }

    /**
     * 整数拆分： 证明：大数字都可以被拆分为多个2与3的和以获取最大的乘积，只有 2 和 3 不需要拆分
     * 分解式应该尽可能的拆分成更多的3。当只剩下4的时候，就直接取4就是最大值 (不能将整数直接拆分为3的个数 当n=10时 要拆成 3+3+4 不能拆成3+3+3+1)
     */
    static class Solution {
        public int integerBreak(int n) {
            int product = 1;
            if (n <= 2) {
                return 1;
            }
            if (n == 3) {
                return 2;
            }
            if (n == 4) {
                return 4;
            }
            while (n > 4) {
                product *= 3;
                n -= 3;
            }
            product *= n;
            return product;
        }
    }

    /**
     * 整数拆分 dp做法 dp[i]表示 将整数i拆分的乘积最大结果
     */
    class Solution2 {
        public int integerBreak(int n) {
            return 0;
        }
    }
}
