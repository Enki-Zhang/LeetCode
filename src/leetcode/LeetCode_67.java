package leetcode;

/**
 * @author Enki
 * @ClassName LeetCode_67
 * @Date 2023/8/11 17:09
 * @Version 1.0
 */
public class LeetCode_67 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.addBinary("111", "101"));
    }

    /**
     * 二进制求和 和字符串相加一样 将字符串逆置后再相加 最后将结果逆置返回
     */
    static class Solution {
        public String addBinary(String a, String b) {
            StringBuilder builderA = new StringBuilder(a);
            String stringA = builderA.reverse().toString();
            StringBuilder builderB = new StringBuilder(b);
            String stringB = builderB.reverse().toString();
            StringBuilder stringBuilder = new StringBuilder();
//            较短的字符 不足位进行末尾0补齐
            int index = 0;
            int temp = 0;
            while (index <= builderA.length() - 1 || index <= builderB.length() - 1) {
                int x = index > builderA.length() - 1 ? 0 : Integer.parseInt(String.valueOf(builderA.charAt(index)));
                int y = index > builderB.length() - 1 ? 0 : Integer.parseInt(String.valueOf(builderB.charAt(index)));
                int result = x + y + temp;
                if (result == 2) {
                    temp = 1;
                    result = 0;
                } else if (result == 3) {
                    temp = 1;
                    result = 1;
                } else temp = 0;
                index++;
                stringBuilder.append(result);
            }
            if (temp == 1) {
                stringBuilder.append(temp);
            }
            return stringBuilder.reverse().toString();


        }
    }
}
