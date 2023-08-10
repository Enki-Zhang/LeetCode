package swing;

/**
 * @author Enki
 * @Version 1.0
 */
public class Swing_4 {
    public static void main(String[] args) {
    }

    class Solution {
        public boolean findNumberIn2DArray(int[][] matrix, int target) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (matrix[i][j] == target) {
                        return true;
                    }
                }
            }
            return false;

        }

        public boolean search(int[] nums, int left, int right, int target) {
            while (left < right) {
                int middle = left + right / 2;
                if (middle == target) {
                    return true;
                }
                if (middle > nums[left]) {
                    left++;
                }
                if (middle < nums[right]) {
                    right--;
                }
            }
            return false;
        }
    }
}
