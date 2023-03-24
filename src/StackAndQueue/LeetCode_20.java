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
            boolean flag = false;
            for (int i = 0; i < chars.length; i++) {
                char aChar = chars[i];
                if (aChar == '(' || aChar == '{' || aChar == '[') {
                    stack.push(aChar);
                    flag = true;
                } else if (!stack.isEmpty()) {
                    switch (aChar) {
                        case ')':
                            if (stack.peek() == '(') {
                                stack.pop();
                                break;
                            } else return false;
                        case ']':
                            if (stack.peek() == '[') {
                                stack.pop();
                                break;
                            } else return false;
                        case '}':
                            if (stack.peek() == '{') {
                                stack.pop();
                                break;
                            } else return false;
                    }
                } else {
                    return false;
                }

            }
            return stack.isEmpty() && flag;
        }
    }

}

