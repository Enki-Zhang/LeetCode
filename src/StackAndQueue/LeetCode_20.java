package StackAndQueue;

import java.util.Stack;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_20 {
    public static void main(String[] args) {

    }

    class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();
            char[] chars = s.toCharArray();
            if (chars.length % 2 != 0) {
                return false;
            }
            for (char aChar : chars) {
                if (aChar == '(' || aChar == '{' || aChar == '[') {
                    stack.push(aChar);
                } else if (!stack.isEmpty()) {
                    switch (aChar) {
                        case ')':
                            if (stack.peek() == '(') {
                                stack.pop();
                                break;
                            }
                        case ']':
                            if (stack.peek() == '[') {
                                stack.pop();
                                break;
                            }
                        case '}':
                            if (stack.peek() == '{') {
                                stack.pop();
                                break;
                            }
                    }
                }
            }
            return stack.isEmpty();
        }
    }

}

