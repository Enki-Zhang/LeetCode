package leetCodeArray;


import java.util.Arrays;
import java.util.Stack;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_844 {
    public static void main(String[] args) {
        String s = "a#c";
        String t = "b";
        String s1 = Solution.backSpace(t);
        boolean b = Solution.backspaceCompare(s, t);
        System.out.println(b);
    }

    /**
     * 用栈判断是否删除元素
     */
    static class Solution {
        public static boolean backspaceCompare(String s, String t) {
            return backSpace(s).equals(backSpace(t));
        }
        public static String backSpace(String s) {
            char[] charArrS = s.toCharArray();
            String a = " ";
            Stack<Character> characters = new Stack<>();
            for (int i = 0; i < charArrS.length; i++) {
                if (charArrS[i] != '#') {
                    characters.push(charArrS[i]);
                } else if (charArrS[i] == '#' && !characters.empty()) {
                    characters.pop();
                }
            }
            while (!characters.empty()) {
                a += characters.pop();
            }
            return a;
        }

    }

}
