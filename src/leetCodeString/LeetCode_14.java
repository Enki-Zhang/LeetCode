package leetCodeString;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_14 {
    public static void main(String[] args) {
        String[] strings = {"flower", "flow", "flight"};
        String[] s = {"ab", "a"};
        String s1 = new Solution().longestCommonPrefix(s);
        System.out.println(s1);

    }

    //    最长公共前缀
    static class Solution {
        public String longestCommonPrefix(String[] strs) {
            StringBuilder stringBuilder = new StringBuilder();
            String first = strs[0];
            boolean flag = false;
//            将每个字符串拿出来和第一个字符串进行比较一个一个比较相同的则是前缀 注意字符串的长度判断
            for (int j = 0; j < first.length(); j++) {
                for (int i = 1; i < strs.length; i++) {
                    if (j >= strs[i].length() || strs[i].charAt(j) != first.charAt(j)) {
                        return stringBuilder.toString();
                    }
                }
                stringBuilder.append(first.charAt(j));
            }
            if (stringBuilder.length() == 0) {
                return "";
            }
            return stringBuilder.toString();
        }
    }
}
