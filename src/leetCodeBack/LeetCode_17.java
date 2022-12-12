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

    //    电话号码的组合 for循环在按键中选择字母 递归按下下一个按键
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
            String key = keyboard[digits.charAt(index) - '0'];//按键 每次按一次按键
            for (int i = 0; i < key.length(); i++) {//每次组合都可以从头开始选择
                sb.append(key.charAt(i));
                backLeet(digits, index + 1, sb, target); // 接着安装下一个按键
                sb.deleteCharAt(sb.length() - 1);
            }

        }
    }
}
