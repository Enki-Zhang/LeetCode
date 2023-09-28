package leetcode;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_304 {
    public static void main(String[] args) {

    }
}

class NumMatrix {
    int[][] diff;

    public NumMatrix(int[][] matrix) {
        diff= new int[matrix.length+1][matrix[0].length+1];
        for (int i = 1; i <= matrix.length; i++) {
            for (int j = 1; j <= matrix[0].length; j++) {
                diff[i][j] = diff[i-1][j]+diff[i][j-1]+matrix[i-1][j-1]-diff[i-1][j-1];
                
            }
        }

    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return diff[row2+1][col2+1] - diff[row1][col2+1] - diff[row2+1][col1] +diff[row1][col1];

    }
}
