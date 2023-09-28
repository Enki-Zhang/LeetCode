package leetcode;

import java.util.Arrays;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_66 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = {9};
        int[] ints1 = solution.plusOne(ints);
        for (int a:
        ints1){
            System.out.println(a);
        }
    }

    /**
     * 整数数组加1 需要考虑进位 对最高位进位需要加一个元素
     */
    static class Solution {
        public int[] plusOne(int[] digits) {
            int carry = 0;
            int[] newArray = new int[digits.length+1];
            boolean isReplace = false;
            for (int i = digits.length-1; i >= 0; i--) {
                if (i == digits.length-1) {
                    digits[i]++;
                }
                int sum = digits[i]+carry;
                if (sum>=10) {
                    carry = sum/10;
                    digits[i] = sum-10;
//                    进位到第一位需要处理
                    if (i==0) {
                        isReplace= true;
                        newArray[0] = carry;
                        System.arraycopy(digits,0,newArray,1,digits.length);
                    }
                }else {
                    digits[i] = sum;
                    carry = 0;
                }
            }
            return isReplace? newArray:digits;

        }
    }
}
