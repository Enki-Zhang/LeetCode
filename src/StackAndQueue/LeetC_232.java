package StackAndQueue;

import leetCodeLink.ListNode;

import java.util.Stack;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetC_232 {
    public static void main(String[] args) {


    }

    static class MyQueue {
        Stack<Integer> stackA = null;
        Stack<Integer> stackB = null;

        public MyQueue() {
            stackA = new Stack();
            stackB = new Stack();
        }

        public void push(int x) {
            stackA.push(x);
        }

        public int pop() {
            if (!stackB.isEmpty()){ //B不为空
                return stackB.pop();
            }else {
                while (!stackA.isEmpty()) {
                    stackB.push(stackA.pop());

                }
            }

            return stackB.pop();
        }

            public int peek() {
                if (!stackB.isEmpty()){ //B不为空 先出B 在清空A
                    return stackB.peek();
                }else {
                    while (!stackA.isEmpty()) {
                        stackB.push(stackA.pop());
                    }
                }
                return stackB.peek();
            }

            public boolean empty () {
                if (stackA.isEmpty() && stackB.isEmpty()) {
                    return true;
                } else {
                    return false;
                }

            }
        }
    }
