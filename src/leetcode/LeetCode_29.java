package leetcode;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_29 {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        System.out.println(Math.abs(-2147483648));
        int divide = solution.divide(-100, 3);
        System.out.println(divide);

    }

    //    两数相除 用减法做除法 每次不断减去上一个减数的double 减少扣减次数

    /**
     * Math.abs(-2147483648) 的返回值为-2147483648
     */
    static class Solution {
        public int divide(int dividend, int divisor) {
            if (dividend == Integer.MIN_VALUE && divisor == -1)
                return Integer.MAX_VALUE;
            boolean flag = true;
            if (dividend < 0 && divisor > 0 || dividend > 0 && divisor < 0) {
                flag = false;
            }
            //取负数计算
            dividend = dividend > 0 ? -dividend : dividend;
            divisor = divisor > 0 ? -divisor : divisor;


            int sum = 0;//商 * 减去的次数
            int time = 1;//减去的次数
            int temp = divisor;// 保存被除数
            int res = 0;// 余数
            while (dividend <= divisor) {
                temp = divisor;
                time = 1;
                while (temp >= dividend - temp) {
                    temp += temp;
                    time += time;
                }
                dividend -= temp;
                time += time;

            }
            return flag ? time : -time;
        }
    }
}
