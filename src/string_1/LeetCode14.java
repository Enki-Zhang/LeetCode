package string_1;

/**
 * @ClassName LeetCode14
 * @Description TODO
 * @Author Enki
 * @Date 2024/11/23 9:55
 * @Verison 1.0
 **/
public class LeetCode14 {
    public static void main(String[] args) {
        String[] strs = {"cir", "car"};
        Solution solution = new LeetCode14().new Solution();
        String s = solution.longestCommonPrefix(strs);
        System.out.println(s);

    }

    class Solution {
        /**
         * 最长公共前缀
         *
         * @param strs
         * @return
         */
        public String longestCommonPrefix(String[] strs) {
            StringBuilder stringBuilder = new StringBuilder();
            String first = strs[0];

            for (int i = 0; i < first.length(); i++) {// 遍历第一个字符串
                boolean flag = true;//每个数组是否都有相同的前缀
                for (int j = 0; j < strs.length; j++) {// 遍历数组
                    if (i >= strs[j].length() || first.charAt(i) != strs[j].charAt(i)) {
                        flag = false;
                        break; //有一个不匹配直接跳出
                    }
                }
                if (!flag) {
                    break; // 提前退出外层循环
                }
                if (flag) {
                    stringBuilder.append(first.charAt(i));
                }
            }

            return stringBuilder.toString();
        }
    }
}
