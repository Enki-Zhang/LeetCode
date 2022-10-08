package StackAndQueue;

import java.util.Stack;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_150 {
    public static void main(String[] args) {

    }

    class Solution {
        public int evalRPN(String[] tokens) {

            Stack<Integer> stack = new Stack<>();
            Stack<Integer> stack1 = new Stack<>();

            for (String aChar : tokens) {

                switch (aChar) {
                    case "+":
                        stack1.push(stack.pop());
                        stack1.push(stack.pop());
                        stack.push((stack1.pop() + stack1.pop()));
                        break;
                    case "-":
                        stack1.push(stack.pop());
                        stack1.push(stack.pop());
                        stack.push((stack1.pop() - stack1.pop()));
                        break;
                    case "*":
                        stack1.push(stack.pop());
                        stack1.push(stack.pop());
                        stack.push((stack1.pop() * stack1.pop()));
                        break;
                    case "/":
                        stack1.push(stack.pop());
                        stack1.push(stack.pop());
                        stack.push((stack1.pop() / stack1.pop()));
                        break;
                    default:
                        stack.push(Integer.valueOf(aChar));
                        break;
                }
            }
            return stack.pop();

        }
    }
}
