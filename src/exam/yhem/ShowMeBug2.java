package exam.yhem;

/**
 * @author Enki
 * @ClassName ShowMeBug2
 * @Description: TODO
 * @Date 2023/10/8 20:13
 * @Version 1.0
 */
public class ShowMeBug2 {
    // 本题面试官已设置测试用例
    public static int[][] solution(int[][] a, int[][] b) {
        // 在这⾥写代码
        int[][] ints = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                ints[i][j] = a[i][j] + b[i][j];
            }
        }
        return ints;
    }
}
