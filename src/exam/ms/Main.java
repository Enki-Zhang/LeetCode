package exam.ms;

import java.util.Scanner;

/**
 * @author Enki
 * @ClassName Main
 * @Description: TODO
 * @Date 2023/11/25 19:22
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        String t = scanner.nextLine();
        String res = isSim(n,k,s,t);
        System.out.println(res);


    }

    public static String isSim(int n, int k, String s, String t) {
        if (s.equals(t)){
            return "YES";
        }
        int d = Math.abs(s.charAt(0) - t.charAt(0));
        for (int i = 1; i < n; i++) {
            int current = Math.abs(s.charAt(i) - s.charAt(i));
            if (current > d) {
                return "NO";
            }
        }
        if (d<=k||(k-d)% 2==0){
            return "YES";
        }else {
            return "NO";
        }
    }

}
