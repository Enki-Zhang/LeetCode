package leetcode;

/**
 * @author Enki
 * @ClassName LeetCode_258
 * @Description: TODO
 * @Date 2023/8/15 9:15
 * @Version 1.0
 */
public class LeetCode_258 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.addDigits(19));

    }

    /**
     * 各位相加
     */
    static class Solution {
        public int addDigits(int num) {
            if (num < 10) {
                return num;
            }
            int res = addInt(num);
            while (res >= 10) {
                res = addInt(res);
            }
            return res;

        }

        private int addInt(int num) {
            int result = 0;
            while (num != 0) {
                int tail = num % 10;
                result += tail;
                num /= 10;
            }
            return result;
        }
    }
}
