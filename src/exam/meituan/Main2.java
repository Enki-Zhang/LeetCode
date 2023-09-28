package exam.meituan;

import java.util.Scanner;

/**
 * @author Enki
 * @ClassName Main2
 * @Description: TODO
 * @Date 2023/9/23 10:10
 * @Version 1.0
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String time = scanner.nextLine().trim();//时间
        String[] split = time.split(":");
        int n = scanner.nextInt();//操作数
        scanner.nextLine();
        Integer minu = Integer.valueOf(split[1]);//原先分钟数
        Integer hour = Integer.valueOf(split[0]);//小时数
        for (int i = 0; i < n; i++) {
            String ch = scanner.nextLine().trim();
            char operand = ch.charAt(0);//操作
            int minutes = Integer.parseInt(ch.substring(2));
//            判断操作
            if (operand == '+') {
                minu += minutes;
            } else if (operand == '-') {
                minu -= minutes;
            }
//           判断进位
            if (minu >= 60) {
//                进位小时
                hour += minu / 60;
//                分钟数
                minu %= 60;
            } else if (minu < 0) {
//                扣减时间
                minu += 60;
                hour--;
            }
            if (hour >= 24) {
                hour %= 24;
            } else if (hour < 0) {
                hour += 24;
            }
        }
        System.out.println(hour + ":" + minu);
        System.out.println(String.format("%02d:%02d", hour, minu));

    }
}
