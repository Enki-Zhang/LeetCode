package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_12 {
    public static void main(String[] args) {
        String s = new Solution().intToRoman(10);
        System.out.println(s);

    }

    // 整数转为罗马数 模拟 不断取各个位数进行拼接
    static class Solution {
        public String intToRoman(int num) {
            final Map<Integer, String> romanNumerals = new HashMap<>();
            romanNumerals.put(1, "I");
            romanNumerals.put(2, "II");
            romanNumerals.put(3, "III");
            romanNumerals.put(4, "IV");
            romanNumerals.put(5, "V");
            romanNumerals.put(6, "VI");
            romanNumerals.put(7, "VII");
            romanNumerals.put(8, "VIII");
            romanNumerals.put(9, "IX");
            romanNumerals.put(10, "X");
            romanNumerals.put(20, "XX");
            romanNumerals.put(30, "XXX");
            romanNumerals.put(40, "XL");
            romanNumerals.put(50, "L");
            romanNumerals.put(60, "LX");
            romanNumerals.put(70, "LXX");
            romanNumerals.put(80, "LXXX");
            romanNumerals.put(90, "XC");
            romanNumerals.put(100, "C");
            romanNumerals.put(200, "CC");
            romanNumerals.put(300, "CCC");
            romanNumerals.put(400, "CD");
            romanNumerals.put(500, "D");
            romanNumerals.put(600, "DC");
            romanNumerals.put(700, "DCC");
            romanNumerals.put(800, "DCCC");
            romanNumerals.put(900, "CM");
            romanNumerals.put(1000, "M");
            romanNumerals.put(2000, "MM");
            romanNumerals.put(3000, "MMM");

            StringBuilder stringBuilder = new StringBuilder();
            int i = 1;
            while (num != 0) {
                int rail = num % 10;
                if (rail != 0){
                    stringBuilder.insert(0, romanNumerals.get(rail * i));
                }

                num /= 10;
                i *= 10;
            }
            return stringBuilder.toString();


        }
    }
}
