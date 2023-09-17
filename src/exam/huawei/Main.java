package exam.huawei;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Lock;

/**
 * @author Enki
 * @ClassName Main
 * @Description: TODO
 * @Date 2023/9/17 14:39
 * @Version 1.0
 */
public class Main {

    public static int calculateSignal(int[][] array, int i, int j) {
        // 获取网格的行数和列数
        int m = array.length;
        int n = array[0].length;

        // 创建一个数组用于标记已访问的位置
        boolean[][] visited = new boolean[m][n];

        // 调用 DFS 函数计算信号值
        return dfs(array, i, j, visited);
    }

    // DFS 函数用于递归地计算信号值
    private static int dfs(int[][] array, int i, int j, boolean[][] visited) {
        // 如果位置越界或已访问过，返回0
        if (i < 0 || i >= array.length || j < 0 || j >= array[0].length || visited[i][j]) {
            return 0;
        }

        // 如果当前位置是阻隔物，返回0
        if (array[i][j] == -1) {
            return 0;
        }

        // 标记当前位置为已访问
        visited[i][j] = true;

        // 初始化信号强度为当前位置的值
        int signalStrength = array[i][j];

        // 递归计算上、下、左、右四个方向的信号值，并累加到信号强度中
        signalStrength += dfs(array, i - 1, j, visited); // 上
        signalStrength += dfs(array, i + 1, j, visited); // 下
        signalStrength += dfs(array, i, j - 1, visited); // 左
        signalStrength += dfs(array, i, j + 1, visited); // 右

        return signalStrength;
    }

    public static void main(String[] args) {
        int[][] array = {
                {0, 0, 0, -1, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {-1, 4, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {-1, 0, 0, 0, 0, 0}

        };

        int i = 1; // 目标位置的行索引
        int j = 4; // 目标位置的列索引

        int signalStrength = calculateSignal(array, i, j);
        System.out.println("网络信号值为: " + signalStrength);

    }

}
