package leetCodeString.string;

/**
 * @author Enki
 * @Version 1.0
 */
public class Swing_5 {
    public static void main(String[] args) {
        String s = "   ";
        String[] split = s.split(" ");

    }

    class Solution {
        public String replaceSpace(String s) {
            char[] chars = s.toCharArray();
            StringBuilder stringBuilder = new StringBuilder();
            for (char aChar : chars) {
                if (aChar == ' ') {
                    stringBuilder.append("%20");
                } else {
                    stringBuilder.append(aChar);
                }
            }
            return stringBuilder.toString();


        }
    }
}
