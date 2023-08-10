package swing;

/**
 * @author Enki
 * @Version 1.0
 */
public class Swing2_17 {
    public static void main(String[] args) {
    }

    /**
     *
     */
    class Solution {
        public int[] printNumbers(int n) {

            int index = 1;
            for (int i = 0; i < n; i++) {
                index *= 10;
            }
            int[] ints = new int[index-1];
            for (int i = 0; i < index-1; i++) {
                ints[i] = i + 1;
            }
            return ints;

        }
    }
}
