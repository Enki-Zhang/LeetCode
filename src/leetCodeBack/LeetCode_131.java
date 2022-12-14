package leetCodeBack;

import javafx.util.BuilderFactory;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_131 {
    public static void main(String[] args) {
        String s = "aab";

        List<List<String>> partition = new Solution().partition(s);
        Boolean aBoolean = new Solution().huiWen(s);
        System.out.println(aBoolean);
        System.out.println(partition);
    }

    //
    static class Solution {
        public List<List<String>> partition(String s) {
            List<List<String>> lists = new LinkedList<>();
            backPar(s, 0, "", new LinkedList<>(), lists);
            return lists;
        }

        public void backPar(String s, int start, String str, LinkedList<String> list, List<List<String>> lists) {
            if (start >= s.length()) {
                ArrayList<String> strings = new ArrayList<>(list);
                lists.add(strings);
                return;
            }
            for (int i = start; i < s.length(); i++) {
                if (!huiWen(s.substring(start, i + 1))) {
                    continue;
                }
                list.add(s.substring(start, i + 1));
                backPar(s, i + 1, "", list, lists);
//                str = str.substring(0, str.length());
                list.removeLast();
            }
        }

        public Boolean huiWen(String s) {
            char[] chars = s.toCharArray();
            for (int i = 0, j = s.length() - 1; i < s.length() / 2; i++, j--) {
                if (chars[i] != chars[j]) {
                    return false;
                }
            }
            return true;
        }
    }
}
