package leetCodeArray;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_904 {
    public static void main(String[] args) {
        int[] fruits = {3,3,3,1,2,1,1,2,3,3,4};
        int ints = Solution.totalFruit(fruits);
//        System.out.println(Arrays.toString(ints));

        System.out.println(ints);
    }
/*
用两位数组记录两棵树 将第一个指针从第一个课树开始并将树的种类记录在两位数组中  第一个指针直到扫到第二课不同种类的树停止，
第二个指针在第一个指针下面一个进行扫描并将树的种类记录在两位数组中 并在接下来的扫描中排除两位数组中的元素直到遇到不在两位数组中的树停止
 此时得到从当前树采摘的最大长度，并记录在一个专门用来记录
 每个元素满足题意的长度的数组中 返回该数组的最大值即可。
 */
    static class Solution {
        public static int totalFruit(int[] fruits) {
            int pointA = 0;
            int pointB = 0;
            int[] index = new int[2];
            int compare = fruits[0];
            int[] targetArrays = new int[11];
            for (int i = 0; i < fruits.length; i++) {
                compare = fruits[i];
                pointA = i;

                while (pointA < fruits.length) {
                    if (fruits[pointA] == compare) {
                        index[0] = fruits[pointA];
                        pointA++;
                    } else {
                        break;
                    }
                }
                pointB = pointA;
                if (pointB < fruits.length) {
                    compare = fruits[pointB];
                    index[1] = compare;
                    while (pointB < fruits.length) {
                        if (fruits[pointB] == compare || fruits[pointB] == index[0] || fruits[pointB] == index[1]) {
                            pointB++;
                        } else {
                            break;
                        }
                    }
                }
                targetArrays[i] = pointB - i ;
            }
            int max = 0;
            for (int i= 0;i<targetArrays.length;i++)
            {
                if (max<targetArrays[i])
                {
                    max = targetArrays[i];
                }
            }
            return max;
        }
    }
}
