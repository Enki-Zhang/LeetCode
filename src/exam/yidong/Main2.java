package exam.yidong;

import java.util.Scanner;

/**
 * @author Enki
 * @ClassName Main2
 * @Description: TODO
 * @Date 2023/10/24 20:00
 * @Version 1.0
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
//        int n = 3;
//        int k = 1;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        int time = 0;
        for (int i = 0; i < k; i++) {
//            int left = n - 1 - time;
//            if (left <= 0) {
//                break;
//            }
            exchange(arr, time + i, time + i + 1);
            time += 2;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    public static void exchange(int[] arr, int i, int j) {
        i = i % arr.length;
        j = j % arr.length;
        if (i < arr.length - 1 && j < arr.length - 1) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

    }
}
