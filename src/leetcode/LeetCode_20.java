package leetcode;

import java.util.Stack;

/**
 * @author Enki
 * @ClassName LeetCode_20
 * @Description: 括号匹配
 * @Date 2023/9/28 8:31
 * @Version 1.0
 */
public class LeetCode_20 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValid("(])"));
    }

    /**
     * 括号匹配 括号的匹配和栈的调用顺序相同 当右括号入栈时栈中没有匹配的括号即为false;
     */
    static class Solution {
        public boolean isValid(String s) {
            char[] chars = s.toCharArray();
            if (s.length() <= 1) {
                return false;
            }
            Stack<Character> stack = new Stack<>();
            int index = 0;
            while (index < chars.length) {
                if (chars[index] == '{' || chars[index] == '(' || chars[index] == '[') {
                    stack.push(chars[index]);
                    index++;
                } else {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    Character peek = stack.peek();
                    if (peek.equals('{') && chars[index] == '}' || peek.equals('(') && chars[index] == ')' || peek.equals('[') && chars[index] == ']') {
                        stack.pop();
                    } else return false;
                    index++;
                }
            }
            if (stack.isEmpty()) {
                return true;
            }
            return false;

        }
    }
}
