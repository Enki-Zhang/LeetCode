/**
 * @author Enki
 * @ClassName LeetCode_58
 * @Description: TODO
 * @Date 2023/8/20 9:19
 * @Version 1.0
 */
public class LeetCode_58 {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String s = "   fly me   to   the moon  ";
//        System.out.println(s.trim());
        System.out.println(solution.lengthOfLastWord(s));


    }

    /**
     * 最后一个字符串
     */
    static class Solution {
        public int lengthOfLastWord(String s) {
            String trim = s.trim();
            String[] split = trim.split(" ");
            return split[split.length-1].length();
        }
    }
}
