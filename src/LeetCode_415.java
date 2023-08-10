

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_415 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.addStrings("999999", "8888888888"));
    }

    /**
     * 整数相加 模拟
     */
//    static class Solution {
//        public String addStrings(String num1, String num2) {
//            String longStr = num1;
//            String shortStr = num2;
//            if (num1.length() < shortStr.length()) {
//                longStr = num2;
//                shortStr = num1;
//            }
//            StringBuilder stringBuilder = new StringBuilder(longStr);
//            int temp = 0;
//            int tail = 0;
//            int result = 0;
//            for (int i = 0; i < shortStr.length(); i++) {
//                result = temp + Integer.parseInt(String.valueOf(longStr.charAt(longStr.length() - 1 - i))) +
//                        Integer.parseInt(String.valueOf(shortStr.charAt(shortStr.length() - 1 - i)));
//                if (result > 10) {
//                    tail = result - 10;
//                    temp = result / 10;
//                } else {
//                    tail = result;
//                }
//                stringBuilder.setCharAt(longStr.length() - 1 - i,
//                        String.valueOf(tail).charAt(0));
//            }
////            还需要判断是否增加位数
//            if (temp == 1) {
//                stringBuilder.setCharAt(longStr.length() - shortStr.length() - 1,
//                        String.valueOf(Integer.parseInt(String.valueOf(longStr.charAt(longStr.length() - shortStr.length() - 1))) + temp).charAt(0)
//                );
//            }
//            return stringBuilder.toString();
//        }
//    }

    /**
     * 整数相加 涉及到最高位可能有进位 将字符串翻转 相加计算 最后一个temp位进一
     */
    static class Solution {
        public String addStrings(String num1, String num2) {
            StringBuilder stringNum1 = new StringBuilder(num1);
            stringNum1.reverse();
            StringBuilder stringNum2 = new StringBuilder(num2);
            stringNum2.reverse();
            StringBuilder stringBuilder = new StringBuilder();
            int index = 0;
            int temp = 0;
            int tail = 0;
            int a = 0;
            int b = 0;
            while (index < stringNum1.length() || index < stringNum2.length()) {
                a = index <= stringNum1.length() - 1 ? Integer.parseInt(String.valueOf(stringNum1.charAt(index))) : 0;
                b = index <= stringNum2.length() - 1 ? Integer.parseInt(String.valueOf(stringNum2.charAt(index))) : 0;
                int result = a + b + temp;
                if (result >= 10) {
                    temp = result / 10;
                    tail = result - 10;
                } else {
                    tail = result;
                    temp = 0;
                }
                index++;
                stringBuilder.append(tail);
            }
            if (temp == 1) {
                stringBuilder.append(temp);
            }
            return stringBuilder.reverse().toString();
        }
    }

}
