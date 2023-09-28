package leetcode;

import java.util.Arrays;

/**
 * @author Enki
 * @ClassName Swing_40
 * @Description: TODO
 * @Date 2023/9/11 13:48
 * @Version 1.0
 */
public class Swing_40 {
    public static void main(String[] args) {

    }

    class Solution {
        public int[] getLeastNumbers(int[] arr, int k) {
            int[] res = new int[k];
            Arrays.sort(arr);
            for (int i = 0; i < k; i++) {
                res[i] = arr[i];
            }
            return res;
        }
    }
}
