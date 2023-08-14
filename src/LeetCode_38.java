import java.nio.IntBuffer;
import java.util.ArrayList;

/**
 * @author Enki
 * @ClassName LeetCode_38
 * @Description: TODO
 * @Date 2023/8/14 10:20
 * @Version 1.0
 */
public class LeetCode_38 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countAndSay(5));
//        System.out.println(solution.splitString("1211"));
    }

    /**
     * 外观数列 将字符串按照相同元素进行划分 并描述
     */
    static class Solution {

        public String countAndSay(int n) {

            if (n <= 1) {
                return "1";
            }else
//            递归实现
            return splitString(countAndSay(n - 1));
        }


        /**
         * 将字符串按照相同字符进行划分 并描述
         *
         * @param str
         */
        private String splitString(String str) {

            char[] chars = str.toCharArray();
            StringBuilder stringBuilder = new StringBuilder();
            ArrayList<Integer> integers = new ArrayList<>();
            int i = 0;
            while (i < chars.length) {
                int index = 1;
                while (i + 1 < chars.length && chars[i] == chars[i + 1]) {
                    i++;
                    index++;
                }
                integers.add(Integer.parseInt(String.valueOf(chars[i])));
                stringBuilder.append(index);
                i++;
            }
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < stringBuilder.length(); j++) {
                char c = stringBuilder.charAt(j);
                sb.append(c).append(integers.get(j));
            }
            return sb.toString();
        }
    }
}
