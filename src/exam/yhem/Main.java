package exam.yhem;

import java.util.*;

/**
 * @author Enki
 * @ClassName Main
 * @Description: TODO
 * @Date 2023/10/8 18:50
 * @Version 1.0
 */
public class Main {
    // 本题面试官已设置测试用例
    public static List<String> singlePermutations(String s) {
        // 在这⾥写代码
//        boolean[] used = new boolean[s.toCharArray().]
        Set<String> strings = new TreeSet<>();
        stringDone(s.toCharArray(), 0, strings);
        return new ArrayList<>(strings);
    }

    private static void stringDone(char[] chars, int start, Set<String> res) {
        if (start == chars.length - 1) {
            res.add(new String(chars));
            return;
        }
        for (int i = start; i < chars.length; i++) {
            swap(chars, start, i);
            stringDone(chars, start+1 , res);
            swap(chars, start, i);

        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public static void main(String[] args) {
        String s = "aabb";
        List<String> list = singlePermutations(s);
        for (String s1 : list) {
            System.out.println(s1);
        }
    }

}
