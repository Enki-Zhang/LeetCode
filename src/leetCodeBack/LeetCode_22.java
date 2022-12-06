package leetCodeBack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_22 {
    public static void main(String[] args) {

        List<String> list = new Solution().generateParenthesis(3);

        System.out.println(list);

    }

    //    生成括号
    static class Solution {
        public List<String> generateParenthesis(int n) {
            List<String> list = new ArrayList<>();
            StringBuilder stringBuilder = new StringBuilder();
            Boolean[] used = new Boolean[2 * n];
            for (int i = 0; i < 2 * n; i++) {
                used[i] = false;
                if (i < n) {
                    stringBuilder.append("(");
                } else stringBuilder.append(")");
            }
//            used数组

            char[] chars = stringBuilder.toString().toCharArray();
            backPar(list, chars, new StringBuilder(), used);
            return list;
        }

        //        回溯
        public void backPar(List<String> list, char[] chars, StringBuilder sb, Boolean[] used) {

            if (sb.length() > 0 && sb.length() == chars.length && isParenthesis(sb.toString())) {
                list.add(sb.toString());
                return;
            }
            for (int i = 0; i < chars.length; i++) {
                if (used[i]) {
                    continue;
                }
                used[i] = true;
                sb.append(chars[i]);
                backPar(list, chars, sb, used);
                used[i] = false;
                sb.deleteCharAt(sb.length() - 1);
            }
        }

        //        括号匹配
        public boolean isParenthesis(String list) {
            char[] chars = list.toCharArray();
            Stack<Character> par = new Stack<>();
            for (char c :
                    chars) {
                if ('(' == c) {
                    par.push(c);
                }
                if (')' == c) {
                    if (!par.isEmpty()) {
                        Character peek = par.peek();
                        if ('(' == peek) {
                            par.pop();
                        } else return false;
                    }
                }
            }
            if (!par.isEmpty()) {
                return false;
            }
            return true;
        }
    }

}
