package exam.tongdun;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Enki
 * @ClassName Main
 * @Description: 同盾科技 分类字符串 用hashMap查表
 * @Date 2023/9/22 18:38
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = in.nextLine();
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            if (!map.containsKey(Arrays.toString(chars))) {
                map.put(Arrays.toString(chars),1);
            }
        }
        System.out.println(map.size());
    }
}