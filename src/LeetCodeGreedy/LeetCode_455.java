package LeetCodeGreedy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_455 {
    public static void main(String[] args) {
        int[] g = {1,2};
        int[] s = {1,2,3};
        int contentChildren = new Solution().findContentChildren(g, s);
        System.out.println(contentChildren);

    }

    //    贪心算法
   static class Solution {
        /**
         * @param g 孩子胃口
         * @param s 饼干大小
         * @return 返回可以吃饱的孩子数量
         */
        public int findContentChildren(int[] g, int[] s) {
            Arrays.sort(g);
            Arrays.sort(s);
            int nums = 0;
            for (int i = 0; i < g.length; i++) {
                for (int j = 0; j < s.length; j++) {
                    if (g[i] <= s[j]) {
                        nums++;
                        s[j] = 0;
                        break;
                    }
                }
            }
            return nums;
        }
    }
}
