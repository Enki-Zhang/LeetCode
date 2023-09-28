package leetcode;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_48 {
    public static void main(String[] args) {

    }

    //    先转置 在镜像
    class Solution {
        public void rotate(int[][] matrix) {
//            转置
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < i; j++) {
                    int tem = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = tem;
                }
            }

                int left = 0;
                int right = matrix.length - 1;

//                镜像
                while (left < right) { //列
                    for (int j = 0; j < matrix.length; j++) { // 行
                        int tem = matrix[j][left];
                        matrix[j][left] = matrix[j][right];
                        matrix[j][right] = tem;
                    }
                    left++;
                    right--;
                }
        }
    }
}
