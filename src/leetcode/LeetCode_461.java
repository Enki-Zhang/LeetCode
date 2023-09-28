package leetcode;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_461 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.hammingDistance(20, 2));
    }

    /**
     * 计算汉明距离
     */
    static class Solution {
        public int hammingDistance(int x, int y) {
            int a = 0;
            while (x > 0 && y > 0) {
                if ((x & 1) != (y & 1)) {
                    a++;
                }
                x >>= 1;
                y >>= 1;
            }
            while (x > 0) {
                if ((x & 1) == 1) {
                    a++;
                }
                x >>= 1;
            }
            while (y > 0) {
                if ((y & 1) == 1) {
                    a++;
                }
                y >>= 1;

            }
            return a;
        }
    }
}
