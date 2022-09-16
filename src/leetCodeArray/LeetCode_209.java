package leetCodeArray;

import java.util.Arrays;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_209 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int target = 11;
        int i = Solution.minSubArrayLen(target, nums);
        System.out.println(Arrays.toString(i));
//        System.out.println(i);
    }


//    static class Solution {
//        public static int minSubArrayLen(int target, int[] nums) {
//            int max = 0;
//            int index = 0;
//            int sum = 0;
//            int[] targetNums=new int[100];
//
//            for (int i = 0; i < nums.length; i++) {
//                if (nums[i] > max) {
//                    max = nums[i];
//                    index = i;
//                }
//            }
//            sum = nums[index];
//            int indexMax = index;
//            int indexA = index;
//            if (sum==target)
//            {
////                System.out.println(index);
//                targetNums[0]=index;
//                return targetNums.length;
//            }
//            while (indexA > 0) {
//                indexA--;
//                if (sum != target) {
//                    sum += nums[indexA];
//                }else {
//                    break;
//                }
//            }
//            int indexB = index;
//            while (indexB < nums.length){
//                indexB++;
//                if (sum != target) {
//                    sum += nums[indexA];
//                }else {
//                    break;
//                }
//            }
//
//            if (indexMax-indexA < indexB-indexMax){
//                for (int i=indexA,j=0;i<=indexMax;i++,j++){
//                    targetNums[j] = i;
////                    System.out.println(i);
//                }
//                return targetNums.length;
//            }else {
//
//                for (int i= indexMax,j=0;i<=indexB;i++,j++)
//                {
//                    targetNums[j] = i;
////                    System.out.println(i);
//
//                }
//                return targetNums.length;
//            }
//
//
//        }
//    }

    //    记录每个满足条件的子串长度
    static class Solution {
        public static int minSubArrayLen(int target, int[] nums) {
            int[] indexNums = new int[5];
            int sum = 0;
            int pointB = 0;
            int indexNumsLength = 0;
            for (int i = 0; i < nums.length; i++) {
                pointB = i;
                sum = 0;
                while (pointB < nums.length) {
                    sum += nums[pointB];
                    if (sum < target) {
                        pointB++;
                        indexNums[i]=0;
                    } else if (sum >= target) {
                        indexNumsLength = pointB - i + 1;
                        indexNums[i] = indexNumsLength;

                        break;
                    }
                }
            }

            int minNotZero = indexNums[0];
            for (int i = 0; i < indexNums.length; i++) {
                if (indexNums[i] != 0 && minNotZero > indexNums[i] ){
                    minNotZero = indexNums[i];
                }
            }

            return minNotZero;
        }
    }


}
