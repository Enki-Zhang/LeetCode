package leetcode;

import java.util.*;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_139 {
    public static void main(String[] args) {
//        Solution solution = new Solution();
//        ArrayList<String> strings = new ArrayList<>();
//        strings.add("leet");
//        strings.add("code");
//        System.out.println(solution.wordBreak("applepenapple", strings));
            Random random = new Random();
            int randomInt = random.nextInt(50) + 10;
//       随机数概论小于60 yes
        System.out.println((new Random().nextInt() % 100) < 60 ? "YES" : "NO");

    }

    /**
     * 单词拆分 回溯 将
     */
    static class BacktrackingMethod {
        List<List<String>> lists = new ArrayList<>();
        List<String> list = new ArrayList<>();

        public boolean wordBreak(String s, List<String> wordDict) {

            back(s, 0, wordDict);
            if (lists.size() != 0) {
                return true;
            }
            return false;

        }

        private void back(String s, int start, List<String> wordDict) {
            if (start == s.length()) {
                Iterator<String> iterator = list.iterator();
                while (iterator.hasNext()) {
                    String next = iterator.next();
                    if (!wordDict.contains(next)) {
                        return;
                    }
                }
                lists.add(new ArrayList<>(list));
            }
            for (int i = start; i < s.length(); i++) {
                list.add(s.substring(start, i + 1));
                back(s, i + 1, wordDict);
                list.remove(list.size() - 1);
            }
        }


    }

    /**
     * 动态规划 对s进行字符串分割 dp[i] = 0-i组成的字符串是否在字典中 dp[i] = dp[j] && dp[j-(i-j)]
     * 0-i字符串进行分割 为0-j dp[j]和i-j的新字符串 两部分 若两部分都合法 则0-i合法
     */
    static class Solution {
        public boolean wordBreak(String s, List<String> wordDict) {
//            放入set集合判断 contain
            HashSet<String> strings = new HashSet<>(wordDict);
            boolean[] dp = new boolean[s.length() + 1];
            dp[0] = true;
            for (int i = 1; i <= s.length(); i++) {
                for (int j = 0; j < i; j++) {
                    if (dp[j] && strings.contains(s.substring(j, i))) {
                        dp[i] = true;
                    }
                }
            }
            return dp[s.length()];

        }
    }
}
