package swing;

/**
 * @author Enki
 * @Version 1.0
 */
public class Swing2_20 {
    public static void main(String[] args) {

    }

    /**
     * 判断字符串是否表示数字
     */
    class Solution {
        public boolean isNumber(String s) {
//            去掉空格
            String trim = s.trim();
            boolean containsPoint = trim.contains(".");
            boolean havee = trim.contains("e");
            boolean haveE = trim.contains("E");
//            不包含小数点 只有整数
            if (!containsPoint) {

            }
            return false;

        }
    }
}
