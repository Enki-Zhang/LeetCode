package algorithm;

import java.util.Arrays;
import java.util.Collections;

/**
 * @ClassName LeetCode_977
 * @Description TODO
 * @Author Enki
 * @Date 2024/9/5 16:41
 * @Verison 1.0
 **/
public class LeetCode_977 {
    public static void main(String[] args) {
        String[] array = new String[]{"Apple", "Orange", "Banana", "Lemon"};
        Integer[] aa = {1,2,3,10,5,6,4};
        Arrays.sort(aa,Integer::compareTo);
        Arrays.sort(array, LeetCode_977::tt);
        System.out.println(String.join(", ", array));
    }

    public static int tt(String s1, String s2) {
        return 0;
    }


    static class Solution {
        public int[] sortedSquares(int[] nums) {
            int[] ints = Arrays.stream(nums).map(num -> {
                return num * num;
            }).sorted().toArray();

            int[] ints1 = Arrays.stream(nums).filter(num -> {
                return num > 3;
            }).sorted().toArray();


            return ints1;
        }
    }

}
