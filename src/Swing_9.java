import java.util.Stack;

/**
 * @author Enki
 * @Version 1.0
 */
public class Swing_9 {
    public static void main(String[] args) {

    }

    class CQueue {
        Stack<Integer> stack01 = null;
        Stack<Integer> stack02 = null;

        public CQueue() {
            stack01 = new Stack<>();
            stack02 = new Stack<>();
        }

        public void appendTail(int value) {
            stack01.push(value);
        }

        public int deleteHead() {
            if (!stack02.isEmpty()) {
               return stack02.pop();
            }else {
                while (!stack01.isEmpty()){
                    stack02.push(stack01.pop());
                }
            }
            if (stack02.isEmpty()){
                return -1;
            }
            return stack02.pop();
        }
    }

}
