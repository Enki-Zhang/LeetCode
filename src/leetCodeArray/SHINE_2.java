package leetCodeArray;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class SHINE_2 {
    public static void main(String[] args) {
        String s = "abcabcabc";
        List<String> list = lengthOfLongestSubstring(s);
        list.forEach(System.out::println);

    }

    //    无重复最长子串
    public static List<String> lengthOfLongestSubstring(String str) {
        char[] chars = str.toCharArray();
        HashSet<Character> window = new HashSet<>();
        ArrayList<String> strings = new ArrayList<>();
        String result = "";
        int len = chars.length;
        int left = 0;
        int right = 0;
        int max = 0;
        while (right < len) {
            if (!window.contains(chars[right])) {
                right++;
                window.add(chars[right]);
//                max = Math.max(max,right-left);
            } else {
                if (right - left > max) {
                    max = right - left;
                    strings.clear();
                    strings.add(str.substring(left, right + 1));
                } else if (right - left == max) {
                    strings.add(str.substring(left, right + 1));
                }
                window.remove(chars[left]);
                left++;
            }
        }
        if (max < right - left + 1) {
            strings.clear();
            strings.add(str.substring(left, right + 1));
        } else if (right - left + 1 == max) {
            strings.add(str.substring(left, right + 1));
        }

        return strings;


    }
}
