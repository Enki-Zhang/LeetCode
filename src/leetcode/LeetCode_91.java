package leetcode;

import java.util.Scanner;

/**
 * @author Enki
 * @ClassName LeetCode_91
 * @Description: TODO
 * @Date 2023/8/26 9:46
 * @Version 1.0
 */
public class LeetCode_91 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        Solution solution = new Solution();
        System.out.println(solution.numDecodings(s));


    }

    /**
     * 解码方法 一次解析一个单词 dp[i] = dp[i-1] 此时 i != 0
     * 一次解析两个单词 dp[i] = dp[i-2] 此时 dp[i-1]!=0, i<=26
     */
    static class Solution {
        public int numDecodings(String s) {
            int[] dp = new int[s.length()+1];
            dp[0] = 1;
            for (int i = 1; i <= s.length(); i++) {
//                    若前一个数不是0则 解析两个字符
                if (Integer.parseInt(String.valueOf(s.charAt(i - 1))) != 0) {
                    dp[i] += dp[i - 1];
                }
//                解析当前字符
                if (i>=2 && s.charAt(i - 2) != '0' && (s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1)) <= 26) {
                    dp[i] += dp[i - 2];
                }
            }
            return dp[s.length()];
        }
    }
}
