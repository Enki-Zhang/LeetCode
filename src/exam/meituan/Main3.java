package exam.meituan;

import exam.tongdun.Main;

import java.time.chrono.MinguoDate;
import java.util.Scanner;

/**
 * @author Enki
 * @ClassName Main3
 * @Description: TODO
 * @Date 2023/9/23 10:47
 * @Version 1.0
 */
public class Main3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long sum = 0;
        long k = 1;
        long count = 1;
        for (long i = 1; i <= n; ) {
            k = count;
            while (k > 0 && i <= n) {
                sum = (sum + k) % 1000000007;
                k--;
                i++;
            }
            if (k == 0) {
                count++;
            }
//            i += count;
        }
        System.out.println(sum % 1000000007);
    }
}
