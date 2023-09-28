package leetcode;

import java.util.*;

/**
 * @author Enki
 * @ClassName LeetCode_392
 * @Description: TODO
 * @Date 2023/8/23 8:58
 * @Version 1.0
 */
public class LeetCode_392 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        scanner.nextLine();
//        String a = scanner.nextLine();
//        String b = scanner.nextLine();
        Solution solution = new Solution();
        System.out.println(solution.isSubsequence("b", "c"));


    }

    /**
     * 遍历子序列每个元素 得到在原序列中的位置b b中的相对位置要升序排序 s ="aaaaaa"
     * t = "bbaaaa" 案例不过
     */
    static class Solution1 {
        public boolean isSubsequence(String s, String t) {
            int[] index = new int[s.length()];
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < t.length(); i++) {
                map.put(t.charAt(i), i);
            }
            for (int i = 0; i < s.length(); i++) {
                if (!map.containsKey(s.charAt(i))) return false;
            }
            for (int i = 1; i < s.length(); i++) {
                if (map.get(s.charAt(i)) < map.get(s.charAt(i - 1))) {
                    return false;
                }
            }
            return true;
        }
    }

    /**
     * 双指针 在t中维护双指针 位置取决于s
     */
    static class Solution {
        public boolean isSubsequence(String s, String t) {
            int a = 0;
            int start = a;
            int end = 0;
            while (end < t.length()) {
                if (s.charAt(a) == t.charAt(start)) {
                    end = start+1;
                }
            }

            return false;
        }
    }
}

