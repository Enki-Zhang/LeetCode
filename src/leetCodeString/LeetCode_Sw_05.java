package leetCodeString;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_Sw_05 {
    public static void main(String[] args) {
        String s = " V ";
        String s1 = Solution.replaceSpace(s);
        System.out.println(s1);

    }

   static class Solution {
        public static String replaceSpace(String s) {
            String[] split = s.split("");
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < split.length ; i++) {

                if (split[i].equals(" ")){
                   split[i]="%20";
                }
                stringBuilder.append(split[i]);
            }


//            stringBuilder.append(split[split.length-1]);
            return stringBuilder.toString();
        }
    }
}
