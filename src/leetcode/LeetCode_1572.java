package leetcode;

/**
 * @author Enki
 * @ClassName LeetCode_1572
 * @Date 2023/8/11 12:30
 * @Version 1.0
 */
public class LeetCode_1572 {
    public static void main(String[] args) {

    }

    /**
     * 计算对角线元素总和
     */
    class Solution {
        public int diagonalSum(int[][] mat) {
            int mainSum = 0;
            int sunSum = 0;
            boolean isEven = false;
            if (mat.length % 2 != 0) {
                isEven = true;
            }
//            计算主对角线的总和
            for (int i = 0; i < mat.length; i++) {
                mainSum += mat[i][i];
            }
//            计算副对角线总和
            for (int i = 0; i < mat.length; i++) {
                sunSum += mat[i][mat.length - i - 1];
            }
            int sum = sunSum + mainSum;
            if (isEven) {
                sum -= mat[(mat.length - 1) / 2][(mat.length - 1) / 2];
            }
            return sum;
        }
    }
}

