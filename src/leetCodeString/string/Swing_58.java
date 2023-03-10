package leetCodeString.string;

/**
 * @author Enki
 * @Version 1.0
 */
public class Swing_58 {
    public static void main(String[] args) {

    }

    class Solution {
        public String reverseLeftWords(String s, int n) {
//            整体翻转字符
            char[] chars = s.toCharArray();
            rever(chars,0,n-1);
            rever(chars,n,chars.length-1);

//            翻转整个字符串
            rever(chars,0,chars.length-1);

            return new String(chars);


        }

        public void rever(char[] chars, int left, int right) {
            char tem = ' ';
            while (left < right) {
                tem = chars[right];
                chars[right] = chars[left];
                chars[left] = tem;
                left++;
                right--;
            }
        }
    }
}
