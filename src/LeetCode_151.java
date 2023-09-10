import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Objects;

/**
 * @author Enki
 * @ClassName LeetCode_151
 * @Description: TODO
 * @Date 2023/9/6 8:47
 * @Version 1.0
 */
public class LeetCode_151 {
    public static void main(String[] args) {

    }

    /**
     * 在常数时间内检索到最小元素的栈 使用ArrayList进行检索
     */
    class MinStack {
        Deque<Integer> deque = null;
        Deque<Integer> minDeque = null;

        public MinStack() {
            deque = new LinkedList<Integer>();
            minDeque = new LinkedList<Integer>();
            minDeque.push(Integer.MAX_VALUE);
        }

        public void push(int val) {
            deque.push(val);
            minDeque.push(Math.min(val, minDeque.peek()));
        }

        public void pop() {
            deque.pop();
            minDeque.pop();
        }

        public int top() {
            if (!deque.isEmpty()) {
                return deque.peek();
            }
            return -1;
        }

        public int getMin() {
            if (!minDeque.isEmpty()) {
                return minDeque.peek();
            }
            return -1;
        }
    }
}
