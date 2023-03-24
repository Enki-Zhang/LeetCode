package StackAndQueue;

import java.util.Stack;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_1047_2 {
    public static void main(String[] args) {

    }

    static class Solution {
        public static String removeDuplicates(String s) {
            Stack<Character> stack = new Stack<>();
            char[] chars = s.toCharArray();
            StringBuilder stringBuilder = new StringBuilder();
            for (char c :
                    chars) {
                if (stack.isEmpty()) {
                    stack.push(c);
                } else {
                    if (stack.peek().equals(c)) {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                }
            }
            while (!stack.isEmpty()) {
                stringBuilder.append(stack.pop());
            }

            return stringBuilder.reverse().toString();


        }
    }
}
