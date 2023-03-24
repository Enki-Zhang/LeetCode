package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_225 {
    public static void main(String[] args) {

    }

    class MyStack {
        Queue<Integer> queueA = null;
        Queue<Integer> queueB = null;

        public MyStack() {
            queueA = new LinkedList<>();
            queueB = new LinkedList<>();
        }

        public void push(int x) {
            queueA.offer(x);
        }
        public int pop() {
            while (!queueB.isEmpty() && !queueA.isEmpty()) {
                queueB.offer(queueA.poll());
            }
            if (queueB.isEmpty()) {
                while (queueA.size() != 1) {
                    queueB.offer(queueA.poll());
                }
                return queueA.poll();
            } else {
                while (queueB.size() != 1) {
                    queueA.offer(queueB.poll());
                }
                return queueB.poll();
            }
        }

        public int top() {

            while (!queueB.isEmpty() && !queueA.isEmpty()) {//B不为空
                queueB.offer(queueA.poll());

            }

            if (queueB.isEmpty()) {//B为空
                while (queueA.size() != 1) {
                    queueB.offer(queueA.poll());
                }
                return queueA.peek();
            } else {
                while (queueB.size() != 1) {
                    queueA.offer(queueB.poll());
                }
                return queueB.peek();
            }

        }

        public boolean empty() {
            return queueA.isEmpty() && queueB.isEmpty();

        }
    }

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
}
