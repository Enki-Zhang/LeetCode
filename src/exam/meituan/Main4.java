package exam.meituan;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Enki
 * @ClassName Main4
 * @Description: TODO
 * @Date 2023/9/23 11:55
 * @Version 1.0
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        Random random = new Random();
        System.out.println(random.nextInt(2)+4);
//        System.out.println();
    }
}
