package exam.didi;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Enki
 * @ClassName Main
 * @Description: TODO
 * @Date 2023/9/15 18:37
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = n-1;
        int k = scanner.nextInt();

        int[] points = new int[n];
        for(int i = 0; i < n; i++)
            points[i] = scanner.nextInt();

        Arrays.sort(points);

        int left = 0;
        int right = m;
        while(left < right) {
            int mid = (left+right+1) / 2;

            int lights = 1;
            int installed = points[0];
            for(int point : points) {
                if(point-installed >= mid) {
                    lights++;
                    installed = point;
                }
            }

            if(lights >= k)
                left = mid;
            else
                right = mid-1;
        }

        System.out.println(left);
    }
}
