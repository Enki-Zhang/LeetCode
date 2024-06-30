package exam.ms;

import java.util.Scanner;

/**
 * @author Enki
 * @ClassName Main2
 * @Description: TODO
 * @Date 2023/11/25 19:37
 * @Version 1.0
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        int res = minTar(n,m,s,t);
        System.out.println(res);

    }
    public static int minTar(int n, int m,String s,String t){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < m - n; i++) {
            int changes = 0;
            for (int j = 0; j < n; j++) {
                if (s.charAt(j)!=t.charAt(i+j)){
                    changes++;
                }
            }
            min = Math.min(min,changes);
        }
        return min;
    }
}
