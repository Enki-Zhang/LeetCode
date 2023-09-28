package exam.meituan;

import java.util.Scanner;

/**
 * @author Enki
 * @ClassName Main
 * @Description: TODO
 * @Date 2023/9/23 10:01
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int res = 0;
        int minS = nums[0];
        int maxS = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < minS || nums[i] > maxS) {
                res++;
            }
            minS = Math.min(minS, nums[i]);
            maxS = Math.max(maxS, nums[i]);
        }
        System.out.println(res);
    }
}
