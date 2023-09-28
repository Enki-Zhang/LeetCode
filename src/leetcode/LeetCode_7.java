package leetcode;

import java.util.Stack;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_7 {
    public static void main(String[] args) {
        int reverse = new Solution().reverse(-2147483412);

        System.out.println(reverse);


    }

    // 将32位整数翻转 不断截取末尾数入栈
    static class Solution {
        public int reverse(int x) {
            Stack<Integer> stack = new Stack<>();
//            x = Math.abs(x);
            while (Math.abs(x) > 0) {
                int rail = x % 10;
                stack.push(rail);
                x = x / 10;
            }
            System.out.println(stack);
//            将翻转后的拼接为数字
            int i = toInt(stack);

            return i;
        }

        private int toInt(Stack<Integer> stack) {
            int tar = 0;
            tar = 0;
            int i = 0;
            while (!stack.isEmpty()) {
                i++;
                int ten = 1;
                for (int j = 1; j < i; j++) {
                    ten *= 10;
                }

                tar += stack.pop() * ten;
                if (tar < -214748364 || tar > 214748364) {
                    return 0;
                }
            }

            return tar;
        }
    }
}
