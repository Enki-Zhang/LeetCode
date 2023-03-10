package leetCodeHash.leetCodeHash;

import java.util.HashSet;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_202 {
    public static void main(String[] args) {
    }

    class Solution {
        public boolean isHappy(int n) {
            HashSet<Integer> set = new HashSet<>();
            while (!set.contains(n) && n != 1) {
                set.add(n);
                n = getNum(n);
            }
            return n == 1;
        }

        public int getNum(int n) {
            int res = 0;
            while (n > 0) {
                int temp = n % 10;
                res += temp * temp;
                n = n / 10;
            }
            return res;
        }
    }
}
