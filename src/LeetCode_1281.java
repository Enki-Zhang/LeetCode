/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_1281 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.subtractProductAndSum(-234));

    }

    /**
     * 整数的各位积和之差 取出整数的各位数字
     */
    static class Solution {
        public int subtractProductAndSum(int n) {
            int mul = 1;
            int con = 0;
//            boolean isNeg = false;
            if (n < 0) {
//                isNeg = true;
                n= Math.abs(n);
            }
            while (n > 0) {
                int tal = n % 10;
                mul *= tal;
                con += tal;
                n = n / 10;
            }
            return mul - con;
        }

    }
}
