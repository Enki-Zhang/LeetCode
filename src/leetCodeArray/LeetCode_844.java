package leetCodeArray;


import java.util.Arrays;
import java.util.Stack;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_844 {
    public static void main(String[] args) {
        String s = "a#c";
        String t = "b";
        String s1 = Solution.backSpace(t);
//        System.out.println(s1);

        boolean b = Solution.backspaceCompare(s, t);
        System.out.println(b);


    }

    //    static class Solution {
//        public static boolean backspaceCompare(String s, String t) {
//            String s1 = backSpace(s);
//            String s2 = backSpace(t);
//
//            if (s1.equals(s2)) {
//                return true;
//            } else return false;
//
//
//        }
//
//        public static String backSpace(String s) {
//            char[] charArrS = s.toCharArray();
//            int pointA = 0;
//            int pointB = 1;
//            int len = 0;
//            while (pointB < charArrS.length - len) {//防止越界
//                if ('#' == charArrS[pointB]) {
//                    //将a指向的元素移到末尾
//                    for (int i = pointB; i < charArrS.length; i++) {
//                        char temp = charArrS[i];
//                        charArrS[i] = charArrS[i - 1];
//                        charArrS[i - 1] = temp;
//                    }
//                    len++;
////                    将B移到末尾
//                    for (int i = pointB; i < charArrS.length - len; i++) {
//                        char temp = charArrS[i];
//                        charArrS[i] = charArrS[i - 1];
//                        charArrS[i - 1] = temp;
//                    }
//                    len++;
//                }
//                if (!('#' == charArrS[pointA])&&!('#'==charArrS[pointB])) {
//                    pointA++;
//                    pointB++;
//                } else if (pointA>0&&('#' == charArrS[pointA])) {
//                    pointA--;
//                    pointB--;
//                }else if(!('#' == charArrS[pointA])&&('#'==charArrS[pointB])){
//                    continue;
//                }
//                else {
//                    pointA++;
//                    pointB++;
//                }
//
//            }
//
////            if ((charArrS.length - len) * 2 == charArrS.length) {
////                return "";
////            }
//            String target = "";
//            if (charArrS[0]=='#'){
//                for (int i = 1; i < charArrS.length - len; i++) {
//                    target += charArrS[i];
//                }
//            }else {
//                for (int i = 1; i < charArrS.length - len; i++) {
//                    target += charArrS[i];
//                }
//            }
//            return target;
//        }
//
//    }
    static class Solution {
        public static boolean backspaceCompare(String s, String t) {
            return backSpace(s).equals(backSpace(t));
        }

        public static String backSpace(String s) {
            char[] charArrS = s.toCharArray();
            String a = " ";
            Stack<Character> characters = new Stack<>();
            for (int i = 0; i < charArrS.length; i++) {
                if (charArrS[i] != '#') {
                    characters.push(charArrS[i]);
                } else if (charArrS[i] == '#' && !characters.empty()) {
                    characters.pop();
                }
            }
            while (!characters.empty()) {
                a += characters.pop();
            }

            return a;


        }

    }

}
