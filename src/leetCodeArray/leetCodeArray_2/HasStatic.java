package leetCodeArray.leetCodeArray_2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Enki
 * @Version 1.0
 */
public class HasStatic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
//        System.out.println(longestSubstring(t)); // expected output: ["wke", "kew"]
    }

    public static Set<String> longestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return new HashSet<>();
        }
        int maxLength = 0;
        Set<String> result = new HashSet<>();
        int left = 0;
        int right = 0;
        HashSet<Character> set = new HashSet<>();
        while (right < s.length()) {
            char c = s.charAt(right);
            if (!set.contains(c)) {
                set.add(c);
                right++;
            } else {
                if (right - left > maxLength) {
                    maxLength = right - left;
                    result.clear();
                    result.add(s.substring(left, right));
                } else if (right - left == maxLength) {
                    result.add(s.substring(left, right));
                }
                set.remove(s.charAt(left));
                left++;
            }
        }
        if (right - left > maxLength) {
            result.clear();
            result.add(s.substring(left, right));
        } else if (right - left == maxLength) {
            result.add(s.substring(left, right));
        }
        return result;
    }
}
