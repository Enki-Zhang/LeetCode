package exam.szml;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Enki
 * @ClassName Main
 * @Description: TODO
 * @Date 2023/10/9 19:15
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        String s1 = String.valueOf(chars);
        System.out.println(s1);
    }
}
