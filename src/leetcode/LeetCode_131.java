package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Enki
 * @ClassName LeetCode_131
 * @Description: TODO
 * @Date 2023/9/3 13:40
 * @Version 1.0
 */
public class LeetCode_131 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.partition("aab"));


    }

    /**
     * 分割回溯
     */
    static class Solution {
        List<List<String>> lists = new ArrayList<>();
        List<String> list = new ArrayList<>();

        public List<List<String>> partition(String s) {

            back(s, 0);
            return lists;
        }

        /**
         *
         */
        private void back(String s, int start) {
            if (start >= s.length()) {
                lists.add(new ArrayList<>(list));
            }
            for (int i = start; i < s.length(); i++) {
                String substring = s.substring(start, i+1);
                if (isHui(substring)) {
                    list.add(substring);
                }else continue;
                back(s, i + 1);
                list.remove(list.size() - 1);
            }
        }

        private boolean isHui(String s) {
            for (int i = 0; i < s.length() / 2; i++) {
                if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                    return false;
                }
            }
            return true;
        }
    }
}
