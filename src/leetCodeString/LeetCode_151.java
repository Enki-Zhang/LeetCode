package leetCodeString;

import java.util.ArrayList;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_151 {
    public static void main(String[] args) {
        String s = "  the sky     is blue  ";
        String s2 = s.trim().replaceAll(" +", " ");

    }
//    翻转字符串
    static class Solution {
        public static String reverseWords(String s) {
            String trim = s.trim().replaceAll(" +"," ");//去掉首尾空格 和中间的多个空格 正则表达式
            String[] split = trim.split(" ");
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = split.length - 1; i >= 0; i--) {
                stringBuilder.append(split[i]).append(" ");
            }
            return stringBuilder.toString().trim();
        }
    }
}
