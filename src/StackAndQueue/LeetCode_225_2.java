package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_225_2 {
    public static void main(String[] args) {
    }

    //队列模拟栈
    class MyStack {
        Queue<Integer> queueIn = null;
        Queue<Integer> queueOut = null;

        public MyStack() {
            queueIn = new LinkedList<>();
            queueOut = new LinkedList<>();
        }

        public void push(int x) {
            queueIn.offer(x);
        }

        public int pop() {
            if (!queueIn.isEmpty() && !queueOut.isEmpty()) {
                queueOut.offer(queueIn.poll());
            }
            if (queueOut.isEmpty()) {
                while (queueIn.size() != 1) {
                    queueOut.offer(queueIn.poll());
                }
                return queueIn.poll();
            } else {
                while (queueOut.size() != 1) {
                    queueIn.offer(queueOut.poll());
                }
                return queueOut.poll();
            }
        }

        public int top() {
            if (!queueIn.isEmpty() && !queueOut.isEmpty()) {
                queueOut.offer(queueIn.poll());
            }
            if (queueOut.isEmpty()) {
                while (queueIn.size() != 1) {
                    queueOut.offer(queueIn.poll());
                }
                return queueIn.peek();
            } else {
                while (queueOut.size() != 1) {
                    queueIn.offer(queueOut.poll());
                }
                return queueOut.peek();
            }
        }

        public boolean empty() {
            return queueOut.isEmpty()&&queueIn.isEmpty();

        }
    }
}
