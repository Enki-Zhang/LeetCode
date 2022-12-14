package leetCodeBack;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_93 {
    public static void main(String[] args) {
        String str = "1231.2312.3123.4";
        boolean ip = new Solution().isIp(str);
        System.out.println(ip);
        Long i = Long.parseLong("3123123123");//防止整型溢出
        System.out.println(i);
        List<String> list = new Solution().restoreIpAddresses(str);
        System.out.println(list);
    }

    //    有效ip地址
    static class Solution {
        public List<String> restoreIpAddresses(String s) {
            List<String> list = new LinkedList<>();
            backRes(s, 0, 0, list);
            return list;
        }

        //分割字符串 加.
        public void backRes(String s, int point, int start, List<String> list) {
            if (point == 3 && isIp(s)) {
                list.add(s);
                return;
            }
            for (int i = start; i < s.length(); i++) {
//                String substring = s.substring(start, i++);
//                if (i - start > 4 || point == 3) break;
//                if (point == 3) break;
                s = s.substring(0, i + 1) + "." + s.substring(i + 1);
                point++;
                backRes(s, point, i + 2, list);
                s = s.substring(0, i + 1) + s.substring(i + 2);
                point--;
            }
        }

        //是否是IP地址 整数个数
        public boolean isIp(String s) {
//            if (s.length() < 4 || s.length() > 16) {
//                return false;
//            }
            String[] split = s.split("\\.");
            if (split.length != 4) {
                return false;
            }
            for (String strings : split) {
//                判断前导0
                if (strings.toCharArray()[0] == '0' && strings.length() > 1) {
                    return false;
                }
                if (Long.parseLong(strings) < 0 || Long.parseLong(strings) > 255) {
                    return false;
                }
            }
            return true;
        }
    }
}
