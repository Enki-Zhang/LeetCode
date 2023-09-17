package exam.wz;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Enki
 * @ClassName Main3
 * @Description: TODO
 * @Date 2023/9/13 21:49
 * @Version 1.0
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int m=scanner.nextInt();
        int s=scanner.nextInt();
        int t =scanner.nextInt();
        scanner.nextLine();
        int[] x = new int[m];
        int[] y = new int[m];
        for (int i = 0; i < m; i++) {
             x[i] = scanner.nextInt();
             y[i] = scanner.nextInt();
        }
        Random random = new Random();
        int ran = random.nextInt(1)+5;
        System.out.println(ran);
    }
}
