package exam.xiaomi;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author Enki
 * @ClassName Main
 * @Description: TODO
 * @Date 2023/9/23 15:40
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] split = scanner.nextLine().split(",");
        Integer len = Integer.valueOf(split[0]);
        Integer radius = Integer.valueOf(split[1]);
        int[][] phones = new int[len][3];
        for (int i = 0; i < len; i++) {
            String[] nums = scanner.nextLine().split(",");
            phones[i][0] = Integer.parseInt(nums[0]);
            phones[i][1] = Integer.parseInt(nums[1]);
            phones[i][2] = Integer.parseInt(nums[2]);
        }
        PriorityQueue<Point> queue = new PriorityQueue<>();
        for (int i = 0; i <=100; i++) {
            for (int j = 0; j <=100; j++) {
                int val = 0;
                for (int[] phone :
                        phones) {
                    int x = phone[0] - i;
                    int y = phone[1] - j;
                    int dis = x * x + y * y;
                    if (dis <= radius * radius) {
                        val += (phone[2] / (1 + Math.sqrt(dis)));
                    }
                }
                queue.offer(new Point(i, j, val));
            }
        }
        Point tar = queue.poll();
        System.out.println(tar.x + "," + tar.y);
    }

    static class Point implements Comparable<Point> {
        int x, y, val;

        public Point(int x, int y, int val) {
            this.val = val;
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(Point o) {
            if (this.val != o.val) {
                return o.val - this.val;
            } else if (this.x != o.x) {
                return this.x - o.x;
            } else {
                return this.y - o.y;
            }
        }
    }
}

