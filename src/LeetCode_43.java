/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_43 {
    public static void main(String[] args) {

    }

    /**
     * 字符串相乘 用字符串表示的非负整数相乘的结果
     * 模拟
     * 将较长的字符串a在上面 较短的b在下面 将b的字符截取 每个进位乘以10 并将结果相加
     * 1 <= num1.length, num2.length <= 200 长度限制 需要考虑溢出
     */
    class Solution {
        public String multiply(String num1, String num2) {
            String longStr = num1;
            String shortStr = num2;
            int tailRes = 0;
            int temp = 0;
            if (num1.length() < num2.length()) {
                longStr = num2;
                shortStr = num1;
            }
            StringBuilder resBuilder = new StringBuilder(longStr);
//            将短字符串 从末尾开始取出字符 模拟乘
            for (int i = shortStr.length() - 1; i >= 0; i--) {
                int tailNum = shortStr.charAt(i) - '0';
//              将tailNum数字 乘以longStr 并进位 用temp保存每个数字的进位 最终进位结果只在最大位置进位
                for (int j = 0; j < longStr.length(); j++) {
                    int res = longStr.charAt(longStr.length() - 1 - j) - '0';
                    if (res > 10) {
                        tailRes = res % 10 + temp;
                        temp = res / 10;
                    } else {
                        tailRes = res;
                        temp = 0;
                    }
                    resBuilder.replace(longStr.length() - 1 - j, longStr.length() - j,
                            String.valueOf(tailRes));
                }
            }
            return null;
        }
    }
}
