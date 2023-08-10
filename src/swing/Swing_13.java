package swing;

/**
 * @author Enki
 * @Version 1.0
 */
public class Swing_13 {
    public static void main(String[] args) {
//        int m = 33;
//        int n = 21;
//        int num = new Solution().getNum(m, n);
//        System.out.println(num);
//        System.out.println();
        int i = new Solution().movingCount(2, 3, 1);
        System.out.println(i);


    }

    //矩阵回溯
    static class Solution {
        public int movingCount(int m, int n, int k) {
//            访问数组
            boolean[][] visit = new boolean[m][n];
            int num = 0;
            num += getPathNum(0, 0, m, n, k, visit);
            return num;
        }

        private int getPathNum(int i, int j, int m, int n, int k, boolean[][] visit) {
            int a = 0;
            int[][] dir = {{0, -1}, {0, 1}, {1, 0}, {-1, 0}};//左右上下
            if (check(i, j, k)) {
                a++;
                visit[i][j] = true;
                for (int[] path :
                        dir) {
                    int newi = i + path[0];
                    int newj = j + path[1];
//                判断路径是否合法
                    if (newi >= 0 && newi < m && newj >= 0 && newj < n && !visit[newi][newj]) {
                            a += getPathNum(newi, newj, m, n, k, visit);
                    }
                }
            }
            return a;
        }

        public int getNum(int newi, int newj) {
            String i = String.valueOf(newi);
            String j = String.valueOf(newj);
            int sum = 0;
            for (int k = 0; k < i.length(); k++) {
                sum += i.charAt(k) - 48;
            }
            for (int k = 0; k < j.length(); k++) {
                sum += j.charAt(k) - 48;
            }
            return sum;


        }

        public boolean check(int i, int j, int k) {
            if (i % 10 + i / 10 % 10 + i / 100 + j % 10 + j / 10 % 10 + j / 100 <= k) {
                return true;
            }
            return false;
        }
    }
}
