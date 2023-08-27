import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Enki
 * @ClassName LeetCode_912
 * @Description: TODO
 * @Date 2023/8/22 11:39
 * @Version 1.0
 */
public class LeetCode_912 {
    public static void main(String[] args) {
//        控制台输入
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] strings = new String[n];
        scanner.nextLine();//将键入的数字后面的换行符吸收掉
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }
    }

    /**
     * 排序
     */
    class Solution {
        public int[] sortArray(int[] nums) {
            return null;

        }
    }
}
