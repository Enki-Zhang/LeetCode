package leetCodeString.string;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_151 {
    public static void main(String[] args) {
        String s = "  +  +  ";
        String s1 = s.trim().replaceAll(" +", " ");
        System.out.println(s1);

    }

    class Solution {
        public String reverseWords(String s) {
            String trim = s.trim().replaceAll(" +", " ");//去掉首尾空格 和中间的多个空格 正则表达式
            String[] split = trim.split(" ");
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = split.length - 1; i >= 0; i--) {
                stringBuilder.append(split[i]).append(" ");
            }
           return stringBuilder.toString().trim();

        }
    }
}
