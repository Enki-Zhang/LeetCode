package leetCodeBack;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_93_2 {
    public static void main(String[] args) {
        String str = "1212312454";
        Solution solution = new Solution();
//        System.out.println(solution.isIP(str));
        List<String> list = solution.restoreIpAddresses(str);
        System.out.println(list);
//        System.out.println(ip);
//        Long i = Long.parseLong("3123123123");//防止整型溢出
//        System.out.println(i);
//        List<String> list = new LeetCode_93.Solution().restoreIpAddresses(str);
//        System.out.println(list);
    }

    //  分割子串 并判断子串大小和个数
    static class Solution {
        List<String> list = new ArrayList<>();

        public List<String> restoreIpAddresses(String s) {
            back(s, 0, 0);
            return list;

        }

        public void back(String s, int start, int dom) {
            if (dom == 3 && isIP(s)) {
                list.add(s);
            }
            for (int i = start; i < s.length(); i++) {
                s = s.substring(0, i + 1) + "." + s.substring(i + 1);
                list.add(s);
                back(s, i + 2, dom + 1);
                s = s.substring(0, i + 1) + s.substring(i + 2);
                dom--;
//                list.remove(list.size() - 1);
            }
        }

        private boolean isIP(String substring) {
            String[] split = substring.split("\\.");
            if (split.length != 4) return false;
            for (String s :
                    split) {
                int i = Integer.parseInt(s);
                if (i < 0 || i > 255) {
                    return false;
                }
            }
            return true;
        }
    }
}
