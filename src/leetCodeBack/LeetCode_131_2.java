package leetCodeBack;

import java.util.ArrayList;
import java.util.List;

//import static leetCodeString.string.LeetCode_5.Solution.isHui;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_131_2 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "aab";
        List<List<String>> partition = solution.partition(s);

        partition.forEach(System.out::println);

    }

    //    分割回文子串 选择从那个字符开始分割 一个一个向后分割
    static class Solution {
        List<String> list = new ArrayList<>();
        List<List<String>> lists = new ArrayList<>();

        public List<List<String>> partition(String s) {
            back(s, 0);
            return lists;
        }

        public void back(String str, int start) {
            if (start >= str.length()) {
                lists.add(new ArrayList<>(list));
            }

            for (int i = start; i < str.length(); i++) {
                String substring = str.substring(start, i+1);
                if (!isHui(substring)) continue;
                list.add(substring);
                back(str, i+1);
                list.remove(list.size() - 1);
            }
        }

        private boolean isHui(String substring) {
            for (int i = 0; i < substring.length() / 2; i++) {
                if (substring.charAt(i) != substring.charAt(substring.length() - i - 1))
                    return false;
            }
            return true;
        }

    }
}
