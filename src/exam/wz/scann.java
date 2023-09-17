package exam.wz;

import java.util.Scanner;

/**
 * @author Enki
 * @ClassName scann
 * @Description: TODO
 * @Date 2023/9/13 19:28
 * @Version 1.0
 */
public class scann {
    public static void main(String[] args) {
        // 控制台输入
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] strings = new String[n];
        scanner.nextLine();//将键入的数字后面的换行符吸收掉
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }
    }
}
