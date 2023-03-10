package leetCodeArray.leetCodeArray_2;

import java.util.ArrayList;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_29 {
    public static void main(String[] args) {


    }

    static class Solution {
        public static int[] spiralOrder(int[][] matrix) {


            ArrayList<Integer> integers = new ArrayList<>();
            if (matrix.length==0)
            {
                return new int[0];
            }
            int row = matrix.length; // 行数
            int col = matrix[0].length; // 列数


//            按照层数遍历
            int left = 0, right = col - 1, top = 0, bottom = row - 1;
            while (left <= right && top <= bottom) {
//                行
                for (int n = left; n <= right; n++) {
                    integers.add(matrix[top][n]);
                }
//                列

                for (int m = top + 1; m <= bottom; m++) {
                    integers.add(matrix[m][right]);
                }
                if (left < right && top < bottom) {
                    for (int n = right - 1; n >= left; n--) {
                        integers.add(matrix[bottom][n]);
                    }
//                列
                    for (int m = bottom - 1; m > top; m--) {
                        integers.add(matrix[m][left]);
                    }
                }

                left++;
                right--;
                top++;
                bottom--;
            }
            int[] ints = new int[row * col];
            ints = integers.stream().mapToInt(Integer::valueOf).toArray();

            return ints;

        }
    }

}
