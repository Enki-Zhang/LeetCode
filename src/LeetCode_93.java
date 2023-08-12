import java.util.ArrayList;
import java.util.List;

/**
 * @author Enki
 * @Version 1.0
 */
public class LeetCode_93 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.restoreIpAddresses("1231231231234"));
//        System.out.println(solution.isIP("1.0.102.3"));

    }

    /**
     * 复原IP地址 用.分割开整数 对每个分割的数字进行判断
     */
    static class Solution {
        List<String> list = new ArrayList<>();

        public List<String> restoreIpAddresses(String s) {
            if (s.length() < 4) {
                return list;
            }
            back(s, 0, 0);
            return list;
        }

        private void back(String s, int index, int pointNum) {
            if (pointNum == 3 && isIP(s)) {
                list.add(s);
                return;
            }
            for (int i = index; i < s.length(); i++) {
                s = s.substring(0, i + 1) + "." + s.substring(i + 1);
//                这里的变量作为条件判断 需要显示的修改 不能在参数中修改不如无效
                pointNum++;
                back(s, i + 2, pointNum);
                s = s.substring(0, i + 1) + s.substring(i + 2);
                pointNum--;
            }
        }

        private boolean isIP(String substring) {
            String[] split = substring.split("\\.");
            if (split.length != 4) return false;
            for (String s :
                    split) {
                char[] chars = s.toCharArray();
                if (chars.length > 1 && chars[0] == '0') {
                    return false;
                }
                long i = Long.parseLong(s);
                if (i < 0 || i > 255) {
                    return false;
                }
            }
            return true;
        }
    }
}
