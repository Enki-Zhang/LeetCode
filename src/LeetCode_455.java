import java.util.Arrays;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_455 {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(-2^2);

    }

    //    排序 从小胃口进行满足
    class Solution {
        public int findContentChildren(int[] g, int[] s) {
            Arrays.sort(g);
            Arrays.sort(s);
            int tar = 0;
            for (int i = 0; i < g.length; i++) {
                for (int j = 0; j < s.length; j++) {
                    if (s[j] >= g[i]) {
                        tar++;
                        s[j] = 0;
                        break;
                    }
                }
            }
            return tar;

        }
    }
}
