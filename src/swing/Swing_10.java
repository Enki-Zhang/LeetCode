package swing;

/**
 * @author Enki
 * @Version 1.0
 */
public class Swing_10 {
    public static void main(String[] args) {
    }

    class Solution {
        public int fib(int n) {
            int[] tar = new int[n + 1];
            if (n == 0) {
                return 0;
            }
            if (n == 1) {
                return 1;
            }
            tar[0] = 0;
            tar[1] = 1;
            for (int i = 2; i < n; i++) {
                tar[i] = tar[i - 1] + tar[i - 2];
                tar[i] = (int) (tar[i] % 1e9 + 7);
            }
            return tar[n];
        }
    }
}
