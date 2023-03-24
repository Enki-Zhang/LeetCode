package StackAndQueue;

import java.util.Stack;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_232_2 {
    public static void main(String[] args) {
    }

    //栈模拟队列
    class MyQueue {
        Stack<Integer> stackIn = null;
        Stack<Integer> stackOut = null;

        public MyQueue() {
            stackIn = new Stack<>();
            stackOut = new Stack<>();
        }

        public void push(int x) {
            stackIn.push(x);
        }

        //出栈
        public int pop() {
            if (stackOut.isEmpty()) {
                while (!stackIn.isEmpty()) {
                    stackOut.push(stackIn.pop());
                }
            }
            return stackOut.pop();
        }

        public int peek() {
            if (stackOut.isEmpty()) {
                while (!stackIn.isEmpty()) {
                    stackOut.push(stackIn.pop());
                }
            }
            return stackOut.peek();
        }

        public boolean empty() {
            return stackOut.isEmpty() && stackIn.isEmpty();
        }
    }
}
