package exam.xiaomi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Enki
 * @ClassName Main2
 * @Description: 有序图 dfs
 * @Date 2023/9/23 17:14
 * @Version 1.0
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] path = new int[n];
        ArrayList<Integer>[] ele = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            ele[i] = new ArrayList<>();
        }
        for (int i = 0; i < n; i++) {
            String[] split = scanner.nextLine().split(":");
            int v = Integer.parseInt(split[0]);
            for (int j = i; j < split.length; j++) {
                int tar = Integer.parseInt(split[j]);
                ele[tar].add(v);
            }
        }
        boolean isVail = true;
        for (int i = 0; i < n; i++) {
            if (path[i] == 0) {
                isVail = false;
                break;
            }
        }
        System.out.println(isVail ? 1 : 0);
    }
}
