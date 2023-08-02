/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_338 {
    public static void main(String[] args) {
        int a = 5;
        Solution solution = new Solution();
        System.out.println(solution.getHanMing(a));

    }

    /**
     * 比特位计数
     */
    static class Solution {
        public int[] countBits(int n) {
            int[] ints = new int[n + 1];
            for (int i = 0; i <= n; i++) {
                ints[i] = getHanMing(i);
            }
            return ints;
        }

        /**
         * 计算整数中的一的个数 通过将整数和1向& 相同为1不同为0 并不断右移位数
         *
         * @return
         */
        public int getHanMing(int n) {
            int a = 0;
            while (n > 0) {
                if ((n & 1) == 1) {
                    a++;
                }
                n = n >> 1;
            }
            return a;

        }
    }
}
