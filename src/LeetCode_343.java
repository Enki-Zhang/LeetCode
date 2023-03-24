/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_343 {
    public static void main(String[] args) {

    }

    class Solution {
        public int integerBreak(int n) {
            int[] tar = new int[n + 1];
            tar[0] = 1;
            tar[1] = 1;
            if (n == 1) {
                return 1;
            }
            if (n == 2) {
                return 2;
            }
            if (n == 3) {
                return 2;
            }
            for (int i = 2; i <= n; i++) {
                for (int j = 1; j <=i; j++) {
                    tar[i] = Math.max(tar[i], tar[i - j] * j);
                }
            }
            System.out.println("长度" + tar.length);
            return tar[n];

        }
    }
}
