package chain;

import java.util.HashSet;

/**
 * @ClassName LeetCode202
 * @Description TODO
 * @Author Enki
 * @Date 2024/10/31 14:02
 * @Verison 1.0
 **/
public class LeetCode202 {
    public static void main(String[] args) {
        int n = 4;
        boolean happy = new Solution().isHappy(n);
        System.out.println(happy);

    }

    static class Solution {
        /**
         * 判断快乐数字
         * @param n
         * @return
         */
        public boolean isHappy(int n) {
//            出现循环
            HashSet<Integer> set = new HashSet<>();
            while (n != 1 && !set.contains(n)) {//结果不同于1 且未出现进行循环
                set.add(n);
                n = getNext(n);
            }
            return n == 1;
        }

        private int getNext(int n) {
            int result = 0;
            while (n > 0) {
                int s = n % 10;
                result += (s * s);
                n = n / 10;
            }
            return result;
        }
    }
}
