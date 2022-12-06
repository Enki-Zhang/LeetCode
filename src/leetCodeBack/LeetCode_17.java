package leetCodeBack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_17 {
    public static void main(String[] args) {

    }

    //    电话号码的组合
    class Solution {
        String[] keyboard = {" ", " ", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        public List<String> letterCombinations(String digits) {
            ArrayList<String> target = new ArrayList<>();
//            0-9的数字映射
            if (digits.length() == 0) {
                return target;
            }
            StringBuilder sb = new StringBuilder();
            backLeet(digits, 0, sb, target);
            return target;
        }
        //回溯
        public void backLeet(String digits, int index, StringBuilder sb, ArrayList<String> target) {
//            退出条件

            if (index == digits.length()) {
                target.add(sb.toString());
                return;
            }
            String key = keyboard[digits.charAt(index) - '0'];//按键
            for (int i = 0; i < key.length(); i++) {
                sb.append(key.charAt(i));
                backLeet(digits, index + 1, sb, target);
                sb.deleteCharAt(sb.length() - 1);
            }

        }
    }
}
