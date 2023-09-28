package leetcode;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_69 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int i = solution.mySqrt(2147395600);
        System.out.println(i);


    }

    /**
     * 平方根 使用对数转为平方根 double 会产生误差
     */
    static class Solution {
        public int mySqrt(int x) {
            int result = (int) Math.exp(Math.log(x)/2);
            return ((long) (result+1)*(result+1) > x? (int) result : (int) result+1);
        }
    }
}
