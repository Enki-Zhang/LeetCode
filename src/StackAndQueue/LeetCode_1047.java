package StackAndQueue;

import java.util.Stack;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_1047 {
    public static void main(String[] args) {
    }

    class Solution {
        public String removeDuplicates(String s) {
            Stack<Character> stack = new Stack<>();
            Stack<Character> stack1= new Stack<>();
            StringBuilder stringBuilder = new StringBuilder();
            char[] chars = s.toCharArray();
            for (char aChar : chars) {
                if (!stack.isEmpty() && aChar == stack.peek()) {
                    stack.pop();
                } else {
                    stack.push(aChar);
                }
            }
            while (!stack.isEmpty()){
                stack1.push(stack.pop());

            }while (!stack1.isEmpty())
            {
                stringBuilder.append(stack1.pop());
            }
//            s1.contains(stack.pop())


            return stringBuilder.toString();

        }
    }

}
