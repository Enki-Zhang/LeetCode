package niuke;

/**
 * @author Enki
 * @ClassName NK_2
 * @Description: TODO
 * @Date 2023/9/9 14:59
 * @Version 1.0
 */
public class NK_2 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.gcd(236, 125));

    }



    public static class Solution {
        /**
         * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
         * <p>
         * 求出a、b的最大公约数。
         * 辗转相减法 使用大数减去小数 知道小数和结果相同则为最大公约数
         * @param a int整型
         * @param b int整型
         * @return int整型
         */
        public int gcd(int a, int b) {
            // 辗转相除法
            while (a != b) {
                int max = b;
                int min = a;
                if (a > b) {
                    max = a;
                    min = b;
                }
                a = max - min;
                b = min;
            }
            return a;

        }
    }
}
