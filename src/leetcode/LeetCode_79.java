package leetcode;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_79 {
    public static void main(String[] args) {

    }

    //    寻找子集问题
    class Solution {
        public boolean exist(char[][] board, String word) {
            int m = board.length;//hang
            int n = board[0].length;//lie
            boolean[][] visited = new boolean[m][n];// 访问路径
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (isPath(board, visited, word, i, j, 0)) {
                        return true;
                    }

                }
            }
            return false;
        }

        /**
         * @param board
         * @param word
         * @param i
         * @param j
         * @param k
         * @return
         */
        private boolean isPath(char[][] board, boolean[][] visit, String word, int i, int j, int k) {
            if (board[i][j] != word.charAt(k)) {
                return false;
            } else if (k == word.length() - 1) {
                return true;
            }
            visit[i][j] = true;
            int[][] dir = {{0, -1}, {0, 1}, {1, 0}, {-1, 0}};//左右上下
            boolean res = false;
//            上下左右遍历
            for (int[] d :
                    dir) {
                int newi = i + d[0];
                int newj = j + d[1];
//                合法
                if (newi >= 0 && newi < board.length && newj >= 0 && newj < board[0].length) {
                    if (!visit[newi][newj]) {
                        if (isPath(board, visit, word, newi, newj, k + 1)) {
                            res = true;
                            break;
                        }
                    }
                }
            }
            visit[i][j] = false;
            return res;
        }
    }
}
