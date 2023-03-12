/**
 * @author Enki
 * @Version 1.0
 */
public class Swing_10 {
    public static void main(String[] args) {
    }

    class Solution {
        public int fib(int n) {
            if (n == 0) {
                return 0;
            }
            if (n == 1) {
                return 1;
            }
           int a = (int) ((int) (fib(n - 1) + fib(n - 2)) % 1e9 + 7);
            return a;
        }
    }
}
