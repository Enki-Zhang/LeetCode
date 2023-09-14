package niuke;

/**
 * @author Enki
 * @ClassName NK_6
 * @Description: TODO
 * @Date 2023/9/12 13:55
 * @Version 1.0
 */
public class NK_6 {
    public static void main(String[] args) {

    }

    public class Solution {
        /**
         * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
         * <p>
         * 求出a、b的最大公约数。
         *
         * @param a int整型
         * @param b int整型
         * @return int整型
         */
        public int gcd(int a, int b) {
//            辗转相减
            // write code here
            while (a != b) {
                int c = Math.max(a,b)-Math.min(a,b);
                a = b;
                b = c;
            }
            return a;

        }

    }
}
